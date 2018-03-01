package br.com.grupojcr.rmws.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import org.apache.log4j.Logger;

import br.com.grupojcr.rmws.dto.AprovadorDTO;
import br.com.grupojcr.rmws.dto.ColigadaDTO;
import br.com.grupojcr.rmws.dto.ItemDTO;
import br.com.grupojcr.rmws.dto.MonitorAprovacaoDTO;
import br.com.grupojcr.rmws.dto.MovimentoDTO;
import br.com.grupojcr.rmws.util.TreatDate;
import br.com.grupojcr.rmws.util.TreatNumber;
import br.com.grupojcr.rmws.util.Util;

@Stateless
public class RMDAO extends GenericDAO {
	
	protected static Logger LOG = Logger.getLogger(RMDAO.class);

	/**
	 * Método responsável por obter movimento
	 * 
	 * @author Leonan Yglecias Mattos - <mattosl@grupojcr.com.br>
	 * @since 01/02/2018
	 * @param codMovimento : Integer
	 * @param codColigada : Integer
	 * @return MovimentoDTO
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public MovimentoDTO obterMovimento(Integer codMovimento, Integer codColigada) {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = datasource.getConnection();

			StringBuilder sb = new StringBuilder();
			sb.append("SELECT DISTINCT ").append("FILIAL.CODCOLIGADA AS CODIGO_EMPRESA, ")
					.append("FILIAL.NOME AS EMPRESA, ").append("USUARIO.NOME AS SOLICITANTE, ")
					.append("TMOV.CODUSUARIO AS USRSOLICITANTE, ").append("TMOV.IDMOV AS IDENTIFICADOR_RM, ")
					.append("TMOV.DATAEMISSAO AS DT_EMISSAO, ").append("FORNECEDOR.CODCFO AS CODIGO_FORNECEDOR, ")
					.append("FORNECEDOR.NOME AS FORNECEDOR, ")
					.append("COND_PAGAMENTO.CODCPG AS CODIGO_COND_PAGAMENTO, ")
					.append("COND_PAGAMENTO.NOME AS CONDICAO_PAGAMENTO, ")
					.append("TMOV.VALORBRUTOORIG AS VALOR_TOTAL, ").append("CCUSTO.CODCCUSTO AS CODIGO_CCUSTO, ")
					.append("CCUSTO.NOME AS CCUSTO, ")
					.append("CAST(HISTORICO.HISTORICOLONGO AS VARCHAR(8000)) AS OBSERVACAO, ")
					.append("TMOV.CODMOEVALORLIQUIDO AS MOEDA, ").append("TIPO_MOV.CODTMV AS CODIGO_MOVIMENTO, ")
					.append("TIPO_MOV.NOME AS TIPO_MOVIMENTO, ").append("TMOV.STATUS AS STATUS ").append("FROM ")
					.append("TMOV AS TMOV (NOLOCK) ")
					.append("JOIN GFILIAL  (NOLOCK) AS FILIAL ON (FILIAL.CODCOLIGADA = TMOV.CODCOLIGADA AND FILIAL.CODFILIAL = TMOV.CODFILIAL) ")
					.append("JOIN GCCUSTO (NOLOCK) AS CCUSTO ON (CCUSTO.CODCCUSTO = TMOV.CODCCUSTO) ")
					.append("JOIN FCFO (NOLOCK) AS FORNECEDOR ON (FORNECEDOR.CODCFO = TMOV.CODCFO) ")
					.append("JOIN GUSUARIO (NOLOCK) AS USUARIO ON (USUARIO.CODUSUARIO LIKE TMOV.CODUSUARIO) ")
					.append("JOIN TCPG (NOLOCK) AS COND_PAGAMENTO ON (COND_PAGAMENTO.CODCPG = TMOV.CODCPG AND COND_PAGAMENTO.CODCOLIGADA = TMOV.CODCOLIGADA) ")
					.append("JOIN TMOVHISTORICO (NOLOCK) AS HISTORICO ON (HISTORICO.CODCOLIGADA = TMOV.CODCOLIGADA AND HISTORICO.IDMOV = TMOV.IDMOV) ")
					.append("JOIN TTMV (NOLOCK) AS TIPO_MOV ON (TIPO_MOV.CODTMV = TMOV.CODTMV) ")
					.append("WHERE TMOV.IDMOV = ? ").append("AND TMOV.CODCOLIGADA = ?");
			ps = conn.prepareStatement(sb.toString());

			ps.setInt(1, codMovimento.intValue());
			ps.setInt(2, codColigada.intValue());

			ResultSet set = ps.executeQuery();

			if (set.next()) {
				MovimentoDTO dto = new MovimentoDTO();
				dto.setIdColigada(Integer.valueOf(set.getInt("CODIGO_EMPRESA")));
				dto.setNomeEmpresa(set.getString("EMPRESA"));
				dto.setSolicitante(set.getString("SOLICITANTE"));
				dto.setIdMov(Integer.valueOf(set.getInt("IDENTIFICADOR_RM")));
				dto.setDataEmissao(TreatDate.format("dd/MM/yyyy", set.getDate("DT_EMISSAO")));
				dto.setIdFornecedor(set.getString("CODIGO_FORNECEDOR"));
				dto.setFornecedor(set.getString("FORNECEDOR"));
				dto.setIdCondicaoPagamento(set.getString("CODIGO_COND_PAGAMENTO"));
				dto.setCondicaoPagamento(set.getString("CONDICAO_PAGAMENTO"));
				BigDecimal valor = set.getBigDecimal("VALOR_TOTAL");
				dto.setValorTotal(TreatNumber.formatMoney(valor).toString());
				dto.setIdCentroCusto(set.getString("CODIGO_CCUSTO"));
				dto.setCentroCusto(set.getString("CCUSTO"));
				dto.setObservacao(set.getString("OBSERVACAO"));
				dto.setMoeda(set.getString("MOEDA"));
				dto.setIdTipoMovimento(set.getString("CODIGO_MOVIMENTO"));
				dto.setTipoMovimento(set.getString("TIPO_MOVIMENTO"));
				dto.setUsrSolicitante(set.getString("USRSOLICITANTE"));
				dto.setStatus(set.getString("STATUS"));
				dto.setListaItem(listarItensMovimento(codMovimento, codColigada));
				return dto;
			}
			return null;
		} catch (Exception e) {
			LOG.error("Erro ao obter movimento");
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					LOG.error(e.getMessage(), e);
				} finally {
					ps = null;
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					LOG.error(e.getMessage(), e);
				} finally {
					conn = null;
				}
			}
		}
		return null;
	}

	/**
	 * Método responsável por listar itens do movimento
	 * 
	 * @author Leonan Yglecias Mattos - <mattosl@grupojcr.com.br>
	 * @since 01/02/2018
	 * @param codMovimento : Integer
	 * @param codColigada : Integer
	 * @return List<ItemDTO>
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<ItemDTO> listarItensMovimento(Integer codMovimento, Integer codColigada) {
		List<ItemDTO> listaDTO = new ArrayList<ItemDTO>();
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = datasource.getConnection();

			StringBuilder sb = new StringBuilder();
			sb.append("SELECT ").append("PRODUTO.CODIGOPRD AS CODIGO_PRODUTO, ")
					.append("PRODUTO.NOMEFANTASIA AS NOME, ").append("ITEM.QUANTIDADETOTAL AS QUANTIDADE, ")
					.append("ITEM.CODUND AS UNIDADE, ").append("ITEM.VALORBRUTOITEMORIG AS VALOR, ")
					.append("CC.CODCCUSTO AS CODIGO_CCUSTO, ").append("CC.NOME AS CENTRO_CUSTO, ")
					.append("ORCAMENTO.CODTBORCAMENTO AS CODIGO_NATUREZA, ").append("ORCAMENTO.DESCRICAO AS NATUREZA, ")
					.append("HISTORICO.HISTORICOLONGO AS OBSERVACAO ").append("FROM ")
					.append("TITMMOV AS ITEM (NOLOCK) ")
					.append("JOIN TPRODUTO (NOLOCK) AS PRODUTO ON (PRODUTO.IDPRD = ITEM.IDPRD) ")
					.append("JOIN GCCUSTO (NOLOCK) AS CC ON (CC.CODCCUSTO = ITEM.CODCCUSTO AND CC.CODCOLIGADA = ITEM.CODCOLIGADA) ")
					.append("LEFT JOIN TPRODUTODEF AS PRODUTODEF ON (PRODUTODEF.IDPRD = PRODUTO.IDPRD) ")
					.append("LEFT JOIN TTBORCAMENTO (NOLOCK) AS ORCAMENTO ON (ORCAMENTO.CODTBORCAMENTO = PRODUTODEF.CODTBORCAMENTO) ")
					.append("JOIN TITMMOVHISTORICO (NOLOCK) AS HISTORICO ON (HISTORICO.IDMOV = ITEM.IDMOV AND HISTORICO.CODCOLIGADA = ITEM.CODCOLIGADA) ")
					.append("WHERE ITEM.CODCOLIGADA = ? ").append("AND ITEM.IDMOV = ? ");

			ps = conn.prepareStatement(sb.toString());

			ps.setInt(1, codColigada.intValue());
			ps.setInt(2, codMovimento.intValue());

			ResultSet set = ps.executeQuery();

			while (set.next()) {
				ItemDTO dto = new ItemDTO();
				dto.setIdProduto(set.getString("CODIGO_PRODUTO"));
				dto.setProduto(set.getString("NOME"));
				dto.setQuantidade(Integer.valueOf(set.getInt("QUANTIDADE")));
				dto.setUnidade(set.getString("UNIDADE"));
				BigDecimal valor = set.getBigDecimal("VALOR");
				dto.setPrecoUnitario(TreatNumber.formatMoney(valor).toString());
				dto.setIdCentroCusto(set.getString("CODIGO_CCUSTO"));
				dto.setCentroCusto(set.getString("CENTRO_CUSTO"));
				dto.setIdNaturezaOrcamentaria(set.getString("CODIGO_NATUREZA"));
				dto.setNaturezaOrcamentaria(set.getString("NATUREZA"));
				dto.setObservacao(set.getString("OBSERVACAO"));

				listaDTO.add(dto);
			}
		} catch (Exception e) {
			LOG.error("Erro ao obter itens do movimento");
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					LOG.error(e.getMessage(), e);
				} finally {
					ps = null;
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					LOG.error(e.getMessage(), e);
				} finally {
					conn = null;
				}
			}
		}
		return listaDTO;
	}

	/**
	 * Método responsável por listar itens do contrato
	 * 
	 * @author Leonan Yglecias Mattos - <mattosl@grupojcr.com.br>
	 * @since 01/02/2018
	 * @param codContrato : Integer
	 * @param codColigada : Integer
	 * @return List<ItemDTO>
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<ItemDTO> listarItensContrato(Integer codContrato, Integer codColigada) {
		List<ItemDTO> listaDTO = new ArrayList<ItemDTO>();
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = datasource.getConnection();

			StringBuilder sb = new StringBuilder();
			sb.append("SELECT ").append("PRODUTO.CODIGOPRD AS CODIGO_PRODUTO, ")
					.append("PRODUTO.NOMEFANTASIA AS NOME, ").append("ITEM.QUANTIDADE AS QUANTIDADE, ")
					.append("ITEM.CODUND AS UNIDADE, ").append("ITEM.VALORTOTAL AS VALOR, ")
					.append("CC.CODCCUSTO AS CODIGO_CCUSTO, ").append("CC.NOME AS CENTRO_CUSTO, ")
					.append("ORCAMENTO.CODTBORCAMENTO AS CODIGO_NATUREZA, ").append("ORCAMENTO.DESCRICAO AS NATUREZA, ")
					.append("HISTORICO.HISTORICOLONGO AS OBSERVACAO ").append("FROM ")
					.append("TITMCNT AS ITEM (NOLOCK) ")
					.append("JOIN TPRODUTO (NOLOCK) AS PRODUTO ON (PRODUTO.IDPRD = ITEM.IDPRD) ")
					.append("JOIN GCCUSTO (NOLOCK) AS CC ON (CC.CODCCUSTO = ITEM.CODCCUSTO AND CC.CODCOLIGADA = ITEM.CODCOLIGADA) ")
					.append("LEFT JOIN TPRODUTODEF AS PRODUTODEF ON (PRODUTODEF.IDPRD = PRODUTO.IDPRD) ")
					.append("LEFT JOIN TTBORCAMENTO (NOLOCK) AS ORCAMENTO ON (ORCAMENTO.CODTBORCAMENTO = PRODUTODEF.CODTBORCAMENTO) ")
					.append("JOIN TITMCNTHISTORICO (NOLOCK) AS HISTORICO ON (HISTORICO.IDCNT = ITEM.IDCNT AND HISTORICO.CODCOLIGADA = ITEM.CODCOLIGADA) ")
					.append("WHERE ITEM.CODCOLIGADA = ? ").append("AND ITEM.IDCNT = ? ");

			ps = conn.prepareStatement(sb.toString());

			ps.setInt(1, codColigada.intValue());
			ps.setInt(2, codContrato.intValue());

			ResultSet set = ps.executeQuery();

			while (set.next()) {
				ItemDTO dto = new ItemDTO();
				dto.setIdProduto(set.getString("CODIGO_PRODUTO"));
				dto.setProduto(set.getString("NOME"));
				dto.setQuantidade(Integer.valueOf(set.getInt("QUANTIDADE")));

				BigDecimal valor = set.getBigDecimal("VALOR");
				dto.setPrecoUnitario(TreatNumber.formatMoney(valor).toString());
				dto.setIdCentroCusto(set.getString("CODIGO_CCUSTO"));
				dto.setCentroCusto(set.getString("CENTRO_CUSTO"));
				dto.setIdNaturezaOrcamentaria(set.getString("CODIGO_NATUREZA"));
				dto.setNaturezaOrcamentaria(set.getString("NATUREZA"));
				dto.setObservacao(set.getString("OBSERVACAO"));

				listaDTO.add(dto);
			}
		} catch (Exception e) {
			LOG.error("Erro ao obter itens do contrato");
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					LOG.error(e.getMessage(), e);
				} finally {
					ps = null;
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					LOG.error(e.getMessage(), e);
				} finally {
					conn = null;
				}
			}
		}
		return listaDTO;
	}
	
	/**
	 * Método responsável por obter lotação
	 * 
	 * @author Leonan Yglecias Mattos - <mattosl@grupojcr.com.br>
	 * @since 01/02/2018
	 * @param codCentroCusto : String
	 * @param codColigada : Integer
	 * @return String
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public String obterLotacao(Integer codColigada, String codCentroCusto) {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = datasource.getConnection();

			StringBuilder sb = new StringBuilder();
			sb.append("SELECT LOTACAO FROM CCUSTOCOMPL WHERE CODCOLIGADA = ? AND CODCCUSTO LIKE ?");

			ps = conn.prepareStatement(sb.toString());

			ps.setInt(1, codColigada.intValue());
			ps.setString(2, codCentroCusto);

			ResultSet set = ps.executeQuery();

			if (set.next()) {
				return set.getString(1);
			}
			return null;
		} catch (Exception e) {
			LOG.error("Erro ao obter lotacao");
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					LOG.error(e.getMessage(), e);
				} finally {
					ps = null;
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					LOG.error(e.getMessage(), e);
				} finally {
					conn = null;
				}
			}
		}
		return null;
	}

	/**
	 * Método responsável por obter primeiros aprovadores
	 * 
	 * @author Leonan Yglecias Mattos - <mattosl@grupojcr.com.br>
	 * @since 01/02/2018
	 * @param lotacao : String
	 * @return List<AprovadorDTO>
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<AprovadorDTO> obterPrimeiroAprovadores(String lotacao) {
		List<AprovadorDTO> listaDTO = new ArrayList<AprovadorDTO>();
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = datasource.getConnection();

			StringBuilder sb = new StringBuilder();
			sb.append("SELECT ")
					.append("CODCOLIGADA, CODCCUSTO, USRAPROV, VALORDEMOV, VALORATEMOV, VALORDECNT, VALORATECNT ")
					.append("FROM ").append("ZMDAPROVADOR ").append("WHERE CODCCUSTO = ?");

			ps = conn.prepareStatement(sb.toString());

			ps.setString(1, lotacao);

			ResultSet set = ps.executeQuery();

			while (set.next()) {
				AprovadorDTO dto = new AprovadorDTO();
				dto.setIdColigada(Integer.valueOf(set.getInt("CODCOLIGADA")));
				dto.setLotacao(set.getString("CODCCUSTO"));
				dto.setUsuarioAprovacao(set.getString("USRAPROV"));
				dto.setValorInicialMovimento(set.getBigDecimal("VALORDEMOV"));
				dto.setValorFinalMovimento(set.getBigDecimal("VALORATEMOV"));
				dto.setValorInicialContrato(set.getBigDecimal("VALORDECNT"));
				dto.setValorFinalContrato(set.getBigDecimal("VALORATECNT"));

				listaDTO.add(dto);
			}
		} catch (Exception e) {
			LOG.error("Erro ao obter aprovadores");
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					LOG.error(e.getMessage(), e);
				} finally {
					ps = null;
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					LOG.error(e.getMessage(), e);
				} finally {
					conn = null;
				}
			}
		}
		return listaDTO;
	}

	/**
	 * Método responsável por obter segundo aprovadores
	 * 
	 * @author Leonan Yglecias Mattos - <mattosl@grupojcr.com.br>
	 * @since 01/02/2018
	 * @param lotacao : String
	 * @return List<AprovadorDTO>
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<AprovadorDTO> obterSegundoAprovadores(String lotacao) {
		List<AprovadorDTO> listaDTO = new ArrayList<AprovadorDTO>();
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = datasource.getConnection();

			StringBuilder sb = new StringBuilder();
			sb.append("SELECT ")
					.append("CODCOLIGADA, CODCCUSTO, USRAPROV, VALORDEMOV, VALORATEMOV, VALORDECNT, VALORATECNT ")
					.append("FROM ").append("ZMDSEGUNDOAPROV ").append("WHERE CODCCUSTO = ?");

			ps = conn.prepareStatement(sb.toString());

			ps.setString(1, lotacao);

			ResultSet set = ps.executeQuery();

			while (set.next()) {
				AprovadorDTO dto = new AprovadorDTO();
				dto.setIdColigada(Integer.valueOf(set.getInt("CODCOLIGADA")));
				dto.setLotacao(set.getString("CODCCUSTO"));
				dto.setUsuarioAprovacao(set.getString("USRAPROV"));
				dto.setValorInicialMovimento(set.getBigDecimal("VALORDEMOV"));
				dto.setValorFinalMovimento(set.getBigDecimal("VALORATEMOV"));
				dto.setValorInicialContrato(set.getBigDecimal("VALORDECNT"));
				dto.setValorFinalContrato(set.getBigDecimal("VALORATECNT"));

				listaDTO.add(dto);
			}
		} catch (Exception e) {
			LOG.error("Erro ao obter aprovadores");
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					LOG.error(e.getMessage(), e);
				} finally {
					ps = null;
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					LOG.error(e.getMessage(), e);
				} finally {
					conn = null;
				}
			}
		}
		return listaDTO;
	}

	/**
	 * Método responsável por incluir monitor de aprovação
	 * 
	 * @author Leonan Yglecias Mattos - <mattosl@grupojcr.com.br>
	 * @since 01/02/2018
	 * @param idColigada : Integer
	 * @param idMov : Integer
	 * @param idTipoMovimento : String
	 * @param usuarioRequisitante : String
	 * @param situacao : String
	 * @param usuarioAprovacao : String
	 * @param usuarioAprovacaoAlternativo : String
	 * @param dtAprovacao : Date
	 * @param quemAprova : String
	 * @param usuarioCriacao : String
	 * @param dtCriacao : Date
	 * @param usuarioAlteracao : String
	 * @param dtAlteracao : Date
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public void incluirMonitorAprovacao(Integer idColigada, Integer idMov, String idTipoMovimento,
			String usuarioRequisitante, String situacao, String usuarioAprovacao, String usuarioAprovacaoAlternativo,
			Date dtAprovacao, String quemAprova, String usuarioCriacao, Date dtCriacao,
			String usuarioAlteracao, Date dtAlteracao) {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = datasource.getConnection();

			StringBuilder sb = new StringBuilder();
			sb.append("INSERT INTO ZMDMONITORAPROVACAO ")
					.append("(CODCOLIGADA, IDMOV, CODTMV, NUMEROMOV, USRREQUIS, SITUACAO, USRAPROV, USRAPROVALTERN, DATAAPROV, QUEMAPROVA, RECCREATEDBY, RECCREATEDON, RECMODIFIEDBY, RECMODIFIEDON) ")
					.append("VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ");

			ps = conn.prepareStatement(sb.toString());

			ps.setInt(1, idColigada.intValue());
			ps.setInt(2, idMov.intValue());
			ps.setString(3, idTipoMovimento);
			ps.setString(4, idMov.toString());
			ps.setString(5, usuarioRequisitante);
			ps.setString(6, situacao);
			ps.setString(7, usuarioAprovacao);
			ps.setString(8, usuarioAprovacaoAlternativo);
			if (Util.isNotNull(dtAprovacao)) {
				ps.setDate(9, new java.sql.Date(dtAprovacao.getTime()));
			} else {
				ps.setNull(9, 91);
			}
			ps.setString(10, quemAprova);
			ps.setString(11, usuarioCriacao);
			if (Util.isNotNull(dtCriacao)) {
				ps.setDate(12, new java.sql.Date(dtCriacao.getTime()));
			} else {
				ps.setNull(12, 91);
			}
			ps.setString(13, usuarioAlteracao);
			if (Util.isNotNull(dtAlteracao)) {
				ps.setDate(14, new java.sql.Date(dtAlteracao.getTime()));
			} else {
				ps.setNull(14, 91);
			}

			ps.execute();
		} catch (Exception e) {
			LOG.error("Erro ao obter aprovadores");
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					LOG.error(e.getMessage(), e);
				} finally {
					ps = null;
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					LOG.error(e.getMessage(), e);
				} finally {
					conn = null;
				}
			}
		}
	}

	/**
	 * Método responsável por incluir aprovação no RM
	 * 
	 * @author Leonan Yglecias Mattos - <mattosl@grupojcr.com.br>
	 * @since 01/02/2018
	 * @param idColigada : Integer
	 * @param idMov : Integer
	 * @param usrAprovacao : String
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public void incluirAprovacaoRM(Integer idColigada, Integer idMov, String usrAprovacao) {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = datasource.getConnection();

			StringBuilder sb = new StringBuilder();
			sb.append("INSERT INTO TMOVAPROVA ")
					.append("(CODCOLIGADA, IDMOV, NSEQITMMOV, IDPROCESSO, CODSISTEMA, CODPERFIL, CODUSUARIO, DATAAPROVACAO, RECCREATEDBY, RECCREATEDON, RECMODIFIEDBY, RECMODIFIEDON, SEQUENCIAL, TIPOAPROVACAO, USUARIODESAPROVA, DATADESAPROVA) ")
					.append("VALUES(?, ?, 0, 6, 'T', 'Aprovador', ?, ?, ?, ?, ?, ?, ((1)), ((1)), null, null) ");

			ps = conn.prepareStatement(sb.toString());

			ps.setInt(1, idColigada.intValue());
			ps.setInt(2, idMov.intValue());
			ps.setString(3, usrAprovacao);
			ps.setTimestamp(4, new Timestamp(Calendar.getInstance().getTime().getTime()));
			ps.setString(5, usrAprovacao);
			ps.setTimestamp(6, new Timestamp(Calendar.getInstance().getTime().getTime()));
			ps.setString(7, usrAprovacao);
			ps.setTimestamp(8, new Timestamp(Calendar.getInstance().getTime().getTime()));

			ps.execute();
		} catch (Exception e) {
			LOG.error("Erro ao incluir aprovação no RM");
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					LOG.error(e.getMessage(), e);
				} finally {
					ps = null;
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					LOG.error(e.getMessage(), e);
				} finally {
					conn = null;
				}
			}
		}
	}

	/**
	 * Método responsável por obter ultima aprovação
	 * 
	 * @author Leonan Yglecias Mattos - <mattosl@grupojcr.com.br>
	 * @since 01/02/2018
	 * @param idColigada : Integer
	 * @param idMov : Integer
	 * @return MonitorAprovacaoDTO
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public MonitorAprovacaoDTO obterUltimaAprovacao(Integer idColigada, Integer idMov) {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = datasource.getConnection();

			StringBuilder sb = new StringBuilder();
			sb.append("SELECT ").append("SITUACAO, USRAPROV, DATAAPROV ").append("FROM ZMDMONITORAPROVACAO ")
					.append("WHERE CODCOLIGADA = ? ").append("AND IDMOV = ? ")
					.append("AND DATAAPROV = (SELECT MAX(DATAAPROV) FROM ZMDMONITORAPROVACAO WHERE CODCOLIGADA = ? and IDMOV = ?)");

			ps = conn.prepareStatement(sb.toString());

			ps.setInt(1, idColigada.intValue());
			ps.setInt(2, idMov.intValue());
			ps.setInt(3, idColigada.intValue());
			ps.setInt(4, idMov.intValue());

			ResultSet set = ps.executeQuery();

			if (set.next()) {
				MonitorAprovacaoDTO dto = new MonitorAprovacaoDTO();
				dto.setDtAprovacao(set.getDate("DATAAPROV"));
				dto.setUsuarioAprovou(set.getString("USRAPROV"));
				dto.setSituacao(set.getString("SITUACAO"));

				return dto;
			}
			return null;
		} catch (Exception e) {
			LOG.error("Erro ao obter ultima aprovação");
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					LOG.error(e.getMessage(), e);
				} finally {
					ps = null;
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					LOG.error(e.getMessage(), e);
				} finally {
					conn = null;
				}
			}
		}
		return null;
	}

	/**
	 * Método responsável por obter primeiro aprovador do monitor
	 * 
	 * @author Leonan Yglecias Mattos - <mattosl@grupojcr.com.br>
	 * @since 01/02/2018
	 * @param idColigada : Integer
	 * @param idMov : Integer
	 * @return MonitorAprovacaoDTO
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public MonitorAprovacaoDTO obterPrimeiroAprovadorMonitor(Integer idColigada, Integer idMov) {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = datasource.getConnection();

			StringBuilder sb = new StringBuilder();
			sb.append("SELECT ").append("SITUACAO, USRAPROV, DATAAPROV ").append("FROM ZMDMONITORAPROVACAO ")
					.append("WHERE CODCOLIGADA = ? ").append("AND IDMOV = ? ")
					.append("AND SITUACAO LIKE 'PRÉ-APROVADO'");

			ps = conn.prepareStatement(sb.toString());

			ps.setInt(1, idColigada.intValue());
			ps.setInt(2, idMov.intValue());

			ResultSet set = ps.executeQuery();

			if (set.next()) {
				MonitorAprovacaoDTO dto = new MonitorAprovacaoDTO();
				dto.setDtAprovacao(set.getDate("DATAAPROV"));
				dto.setUsuarioAprovou(set.getString("USRAPROV"));
				dto.setSituacao(set.getString("SITUACAO"));

				return dto;
			}
			return null;
		} catch (Exception e) {
			LOG.error("Erro ao obter primeiro aprovador no monitor");
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					LOG.error(e.getMessage(), e);
				} finally {
					ps = null;
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					LOG.error(e.getMessage(), e);
				} finally {
					conn = null;
				}
			}
		}
		return null;
	}

	/**
	 * Método responsável por obter segundo aprovador do monitor
	 * 
	 * @author Leonan Yglecias Mattos - <mattosl@grupojcr.com.br>
	 * @since 01/02/2018
	 * @param idColigada : Integer
	 * @param idMov : Integer
	 * @return MonitorAprovacaoDTO
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public MonitorAprovacaoDTO obterSegundoAprovadorMonitor(Integer idColigada, Integer idMov) {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = datasource.getConnection();

			StringBuilder sb = new StringBuilder();
			sb.append("SELECT ").append("SITUACAO, USRAPROV, DATAAPROV ").append("FROM ZMDMONITORAPROVACAO ")
					.append("WHERE CODCOLIGADA = ? ").append("AND IDMOV = ? ").append("AND SITUACAO LIKE 'APROVADO'");

			ps = conn.prepareStatement(sb.toString());

			ps.setInt(1, idColigada.intValue());
			ps.setInt(2, idMov.intValue());

			ResultSet set = ps.executeQuery();

			if (set.next()) {
				MonitorAprovacaoDTO dto = new MonitorAprovacaoDTO();
				dto.setDtAprovacao(set.getDate("DATAAPROV"));
				dto.setUsuarioAprovou(set.getString("USRAPROV"));
				dto.setSituacao(set.getString("SITUACAO"));

				return dto;
			}
			return null;
		} catch (Exception e) {
			LOG.error("Erro ao obter segundo aprovador no monitor");
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					LOG.error(e.getMessage(), e);
				} finally {
					ps = null;
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					LOG.error(e.getMessage(), e);
				} finally {
					conn = null;
				}
			}
		}
		return null;
	}

	/**
	 * Método responsável por obter nome aprovador
	 * 
	 * @author Leonan Yglecias Mattos - <mattosl@grupojcr.com.br>
	 * @since 01/02/2018
	 * @param login : String
	 * @return String
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public String obterNomeAprovador(String login) {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = datasource.getConnection();

			StringBuilder sb = new StringBuilder();
			sb.append("SELECT NOME FROM GUSUARIO WHERE CODUSUARIO = ?");

			ps = conn.prepareStatement(sb.toString());

			ps.setString(1, login);

			ResultSet set = ps.executeQuery();

			if (set.next()) {
				return set.getString("NOME");
			}
			return null;
		} catch (Exception e) {
			LOG.error("Erro ao obter ultima aprovação");
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					LOG.error(e.getMessage(), e);
				} finally {
					ps = null;
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					LOG.error(e.getMessage(), e);
				} finally {
					conn = null;
				}
			}
		}
		return null;
	}

	/**
	 * Método responsável por listar aprovação por período
	 * 
	 * @author Leonan Yglecias Mattos - <mattosl@grupojcr.com.br>
	 * @since 01/02/2018
	 * @param idColigada : Integer
	 * @param dtInicio : Date
	 * @param dtFim : Date
	 * @return List<MovimentoDTO>
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<MovimentoDTO> listarAprovacaoPorPeriodo(Integer idColigada, Date dtInicio, Date dtFim) {
		Connection conn = null;
		PreparedStatement ps = null;
		List<MovimentoDTO> movimentos = new ArrayList<MovimentoDTO>();

		try {
			conn = datasource.getConnection();

			StringBuilder sb = new StringBuilder();
			sb.append("SELECT DISTINCT ").append("FILIAL.CODCOLIGADA AS CODIGO_EMPRESA, ")
					.append("FILIAL.NOME AS EMPRESA, ").append("USUARIO.NOME AS SOLICITANTE, ")
					.append("TMOV.CODUSUARIO AS USRSOLICITANTE, ").append("TMOV.IDMOV AS IDENTIFICADOR_RM, ")
					.append("TMOV.DATAEMISSAO AS DT_EMISSAO, ").append("FORNECEDOR.CODCFO AS CODIGO_FORNECEDOR, ")
					.append("FORNECEDOR.NOME AS FORNECEDOR, ")
					.append("COND_PAGAMENTO.CODCPG AS CODIGO_COND_PAGAMENTO, ")
					.append("COND_PAGAMENTO.NOME AS CONDICAO_PAGAMENTO, ")
					.append("TMOV.VALORBRUTOORIG AS VALOR_TOTAL, ").append("CCUSTO.CODCCUSTO AS CODIGO_CCUSTO, ")
					.append("CCUSTO.NOME AS CCUSTO, ")
					.append("CAST(HISTORICO.HISTORICOLONGO AS VARCHAR(8000)) AS OBSERVACAO, ")
					.append("TMOV.CODMOEVALORLIQUIDO AS MOEDA, ").append("TIPO_MOV.CODTMV AS CODIGO_MOVIMENTO, ")
					.append("'ORDEM DE COMPRA' AS TIPO_MOVIMENTO, ").append("TMOV.STATUS AS STATUS, ")
					.append("MONITOR.SITUACAO AS SITUACAO_APROVACAO, ")
					.append("MONITOR.DATAAPROV AS DATA_ULTIMA_APROVACAO ").append("FROM ")
					.append("TMOV AS TMOV (NOLOCK) ")
					.append("JOIN GFILIAL  (NOLOCK) AS FILIAL ON (FILIAL.CODCOLIGADA = TMOV.CODCOLIGADA AND FILIAL.CODFILIAL = TMOV.CODFILIAL) ")
					.append("JOIN GCCUSTO (NOLOCK) AS CCUSTO ON (CCUSTO.CODCCUSTO = TMOV.CODCCUSTO) ")
					.append("JOIN FCFO (NOLOCK) AS FORNECEDOR ON (FORNECEDOR.CODCFO = TMOV.CODCFO) ")
					.append("JOIN GUSUARIO (NOLOCK) AS USUARIO ON (USUARIO.CODUSUARIO LIKE TMOV.CODUSUARIO) ")
					.append("JOIN TCPG (NOLOCK) AS COND_PAGAMENTO ON (COND_PAGAMENTO.CODCPG = TMOV.CODCPG AND COND_PAGAMENTO.CODCOLIGADA = TMOV.CODCOLIGADA) ")
					.append("JOIN TMOVHISTORICO (NOLOCK) AS HISTORICO ON (HISTORICO.CODCOLIGADA = TMOV.CODCOLIGADA AND HISTORICO.IDMOV = TMOV.IDMOV) ")
					.append("JOIN TTMV (NOLOCK) AS TIPO_MOV ON (TIPO_MOV.CODTMV = TMOV.CODTMV) ")
					.append("JOIN ZMDMONITORAPROVACAO (NOLOCK) AS MONITOR ON (MONITOR.IDMOV = TMOV.IDMOV AND MONITOR.CODCOLIGADA = TMOV.CODCOLIGADA AND MONITOR.IDMOV = TMOV.IDMOV AND MONITOR.CODTMV = TMOV.CODTMV AND MONITOR.DATAAPROV = (SELECT MAX(AUXMON.DATAAPROV) FROM ZMDMONITORAPROVACAO AUXMON WHERE AUXMON.CODTMV = TMOV.CODTMV AND AUXMON.CODCOLIGADA = TMOV.CODCOLIGADA AND AUXMON.IDMOV = TMOV.IDMOV)) ")
					.append("WHERE TMOV.DATAEMISSAO BETWEEN ? AND ? ");
			if (Util.isNotNull(idColigada)) {
				sb.append("AND TMOV.CODCOLIGADA = ? ");
			}

			sb.append("UNION ALL ").append("SELECT DISTINCT ").append("FILIAL.CODCOLIGADA AS CODIGO_EMPRESA, ")
					.append("FILIAL.NOME AS EMPRESA, ").append("USUARIO.NOME AS SOLICITANTE, ")
					.append("CNT.CODUSUARIO AS USRSOLICITANTE, ").append("CNT.IDCNT AS IDENTIFICADOR_RM, ")
					.append("CNT.DATACONTRATO AS DT_EMISSAO, ").append("FORNECEDOR.CODCFO AS CODIGO_FORNECEDOR, ")
					.append("FORNECEDOR.NOME AS FORNECEDOR, ")
					.append("COND_PAGAMENTO.CODCPG AS CODIGO_COND_PAGAMENTO, ")
					.append("COND_PAGAMENTO.NOME AS CONDICAO_PAGAMENTO, ").append("CNT.VALORCONTRATO AS VALOR_TOTAL, ")
					.append("CCUSTO.CODCCUSTO AS CODIGO_CCUSTO, ").append("CCUSTO.NOME AS CCUSTO, ")
					.append("CAST(HISTORICO.HISTORICOLONGO AS VARCHAR(8000)) AS OBSERVACAO, ")
					.append("CNT.CODMOEVALORCONTRATO AS MOEDA, ").append("'CONTRATO' AS CODIGO_MOVIMENTO, ")
					.append("'CONTRATO' AS TIPO_MOVIMENTO, ").append("SIT_CONTRATO.DESCRICAO AS STATUS, ")
					.append("MONITOR.SITUACAO AS SITUACAO_APROVACAO, ")
					.append("MONITOR.DATAAPROV AS DATA_ULTIMA_APROVACAO ").append("FROM ")
					.append("TCNT AS CNT (NOLOCK) ")
					.append("JOIN GFILIAL  (NOLOCK) AS FILIAL ON (FILIAL.CODCOLIGADA = CNT.CODCOLIGADA AND FILIAL.CODFILIAL = CNT.CODFILIAL) ")
					.append("JOIN GCCUSTO (NOLOCK) AS CCUSTO ON (CCUSTO.CODCCUSTO = CNT.CODCCUSTO) ")
					.append("JOIN FCFO (NOLOCK) AS FORNECEDOR ON (FORNECEDOR.CODCFO = CNT.CODCFO) ")
					.append("JOIN GUSUARIO (NOLOCK) AS USUARIO ON (USUARIO.CODUSUARIO LIKE CNT.CODUSUARIO) ")
					.append("JOIN TCPG (NOLOCK) AS COND_PAGAMENTO ON (COND_PAGAMENTO.CODCPG = CNT.CODCPG AND COND_PAGAMENTO.CODCOLIGADA = CNT.CODCOLIGADA) ")
					.append("JOIN TCNTHISTORICO (NOLOCK) AS HISTORICO ON (HISTORICO.CODCOLIGADA = CNT.CODCOLIGADA AND HISTORICO.IDCNT = CNT.IDCNT) ")
					.append("JOIN ZMDMONITORAPROVACAO (NOLOCK) AS MONITOR ON (MONITOR.IDMOV = CNT.IDCNT AND MONITOR.CODTMV LIKE 'CONTRATO' AND MONITOR.CODCOLIGADA = CNT.CODCOLIGADA AND MONITOR.DATAAPROV = (SELECT MAX(AUXMON.DATAAPROV) FROM ZMDMONITORAPROVACAO AUXMON WHERE AUXMON.CODCOLIGADA = CNT.CODCOLIGADA AND AUXMON.IDMOV = CNT.IDCNT)) ")
					.append("JOIN TSTACNT (NOLOCK) AS SIT_CONTRATO ON (SIT_CONTRATO.CODCOLIGADA = CNT.CODCOLIGADA AND SIT_CONTRATO.CODSTACNT LIKE CNT.CODSTACNT) ")
					.append("WHERE CNT.DATACONTRATO BETWEEN ? AND ? ");
			if (Util.isNotNull(idColigada)) {
				sb.append("AND CNT.CODCOLIGADA = ? ");
			}
			sb.append("ORDER BY DT_EMISSAO DESC ");

			ps = conn.prepareStatement(sb.toString());

			int idx = 1;
			ps.setDate(idx++, new java.sql.Date(dtInicio.getTime()));
			ps.setDate(idx++, new java.sql.Date(dtFim.getTime()));
			if (Util.isNotNull(idColigada)) {
				ps.setInt(idx++, idColigada.intValue());
			}
			ps.setDate(idx++, new java.sql.Date(dtInicio.getTime()));
			ps.setDate(idx++, new java.sql.Date(dtFim.getTime()));
			if (Util.isNotNull(idColigada)) {
				ps.setInt(idx++, idColigada.intValue());
			}

			ResultSet set = ps.executeQuery();

			while (set.next()) {
				MovimentoDTO dto = new MovimentoDTO();
				dto.setIdColigada(Integer.valueOf(set.getInt("CODIGO_EMPRESA")));
				dto.setNomeEmpresa(set.getString("EMPRESA"));
				dto.setSolicitante(set.getString("SOLICITANTE"));
				dto.setIdMov(Integer.valueOf(set.getInt("IDENTIFICADOR_RM")));
				dto.setDataEmissao(TreatDate.format("dd/MM/yyyy", set.getDate("DT_EMISSAO")));
				dto.setIdFornecedor(set.getString("CODIGO_FORNECEDOR"));
				dto.setFornecedor(set.getString("FORNECEDOR"));
				dto.setIdCondicaoPagamento(set.getString("CODIGO_COND_PAGAMENTO"));
				dto.setCondicaoPagamento(set.getString("CONDICAO_PAGAMENTO"));
				BigDecimal valor = set.getBigDecimal("VALOR_TOTAL");
				dto.setValorTotal(TreatNumber.formatMoney(valor).toString());
				dto.setIdCentroCusto(set.getString("CODIGO_CCUSTO"));
				dto.setCentroCusto(set.getString("CCUSTO"));
				dto.setObservacao(set.getString("OBSERVACAO"));
				dto.setMoeda(set.getString("MOEDA"));
				dto.setIdTipoMovimento(set.getString("CODIGO_MOVIMENTO"));
				dto.setTipoMovimento(set.getString("TIPO_MOVIMENTO"));
				dto.setUsrSolicitante(set.getString("USRSOLICITANTE"));
				dto.setStatus(set.getString("STATUS"));
				dto.setSituacaoMonitor(set.getString("SITUACAO_APROVACAO"));
				Date dtUltimaAprovacao = set.getDate("DATA_ULTIMA_APROVACAO");
				if (Util.isNotNull(dtUltimaAprovacao)) {
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					dto.setDtUltimaAprovacao(sdf.format(dtUltimaAprovacao));
				}
				String tipoMovimento = set.getString("CODIGO_MOVIMENTO");
				if (tipoMovimento.equals("CONTRATO")) {
					dto.setListaItem(listarItensContrato(Integer.valueOf(set.getInt("IDENTIFICADOR_RM")),
							Integer.valueOf(set.getInt("CODIGO_EMPRESA"))));
				} else {
					dto.setListaItem(listarItensMovimento(Integer.valueOf(set.getInt("IDENTIFICADOR_RM")),
							Integer.valueOf(set.getInt("CODIGO_EMPRESA"))));
				}
				movimentos.add(dto);
			}
		} catch (Exception e) {
			LOG.error("Erro ao listar movimento");
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					LOG.error(e.getMessage(), e);
				} finally {
					ps = null;
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					LOG.error(e.getMessage(), e);
				} finally {
					conn = null;
				}
			}
		}
		return movimentos;
	}

	/**
	 * Método responsável por listar coligadas
	 * 
	 * @author Leonan Yglecias Mattos - <mattosl@grupojcr.com.br>
	 * @since 01/02/2018
	 * @return List<ColigadaDTO>
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<ColigadaDTO> listarColigadas() {
		Connection conn = null;
		PreparedStatement ps = null;
		List<ColigadaDTO> coligadas = new ArrayList<ColigadaDTO>();

		try {
			conn = datasource.getConnection();

			StringBuilder sb = new StringBuilder();
			sb.append(
					"SELECT CODCOLIGADA, NOMEFANTASIA from GFILIAL GROUP BY CODCOLIGADA, NOMEFANTASIA ORDER BY CODCOLIGADA");

			ps = conn.prepareStatement(sb.toString());

			ResultSet set = ps.executeQuery();

			while (set.next()) {
				ColigadaDTO dto = new ColigadaDTO();
				dto.setId(Integer.valueOf(set.getInt("CODCOLIGADA")));
				dto.setNome(set.getString("NOMEFANTASIA"));

				coligadas.add(dto);
			}
		} catch (Exception e) {
			LOG.error("Erro ao listar coligadas");
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					LOG.error(e.getMessage(), e);
				} finally {
					ps = null;
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					LOG.error(e.getMessage(), e);
				} finally {
					conn = null;
				}
			}
		}
		return coligadas;
	}
}
