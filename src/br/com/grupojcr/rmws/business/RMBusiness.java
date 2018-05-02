package br.com.grupojcr.rmws.business;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import br.com.grupojcr.rmws.dao.RMDAO;
import br.com.grupojcr.rmws.dto.AprovadorDTO;
import br.com.grupojcr.rmws.dto.ItemDTO;
import br.com.grupojcr.rmws.dto.MovimentoDTO;
import br.com.grupojcr.rmws.util.TreatString;
import br.com.grupojcr.rmws.util.Util;

@Stateless
public class RMBusiness {
	
	protected static Logger LOG = Logger.getLogger(RMBusiness.class);
	
	@EJB
	private RMDAO rmDAO;

	/**
	 * Método responsável por listar movimentos
	 * @author Leonan Yglecias Mattos - <mattosl@grupojcr.com.br>
	 * @since 01/02/2018
	 * @param usuario : String
	 * @param dtInicio : Date
	 * @param dtFim : Date
	 * @param idColigada : Integer
	 * @return List<MovimentoDTO>
	 */
	public List<MovimentoDTO> listarMovimentos(String usuario, Date dtInicio, Date dtFim, Integer idColigada, String centroCusto, String naturezaOrcamentaria) {
		try {
			LOG.info("[listarMovimentos] Listando aprovações do período...");
			List<MovimentoDTO> movimentos = rmDAO.listarAprovacaoPorPeriodo(idColigada, centroCusto, dtInicio, dtFim);
			List<MovimentoDTO> retorno = new ArrayList<MovimentoDTO>();
	
			LOG.info("[listarMovimentos] Verificando movimentos que o usuário tem ligação...");
			for (MovimentoDTO dto : movimentos) {
				Boolean possuiVinculo = Boolean.FALSE;
				List<AprovadorDTO> aprovadores = rmDAO.listarAprovadores(dto.getLotacao());
	
				Double valorCompra = Util.removerFomatacaoMoeda(dto.getValorTotal());
				
				for (AprovadorDTO aprv : aprovadores) {
					if(aprv.getUsuarioAprovacao().equals(usuario)) {
						if(dto.getIdTipoMovimento().equals("CONTRATO")) {
							if(aprv.getValorInicialContrato().compareTo(new BigDecimal(valorCompra)) == 0 || aprv.getValorInicialContrato().compareTo(new BigDecimal(valorCompra)) == -1) {
								if(aprv.getValorFinalContrato().compareTo(new BigDecimal(valorCompra)) == 0 || aprv.getValorFinalContrato().compareTo(new BigDecimal(valorCompra)) == 1) {
									possuiVinculo = Boolean.TRUE;
								}
							}
						} else {
							if(aprv.getValorInicialMovimento().compareTo(new BigDecimal(valorCompra)) == 0 || aprv.getValorInicialMovimento().compareTo(new BigDecimal(valorCompra)) == -1) {
								if(aprv.getValorFinalMovimento().compareTo(new BigDecimal(valorCompra)) == 0 || aprv.getValorFinalMovimento().compareTo(new BigDecimal(valorCompra)) == 1) {
									possuiVinculo = Boolean.TRUE;
								}
							}
						}
						
					}
				}
				
				if (possuiVinculo) {
					if(dto.getIdTipoMovimento().equals("CONTRATO")) {
						dto.setListaItem(rmDAO.listarItensContrato(dto.getIdMov(), dto.getIdColigada()));
					} else {
						dto.setListaItem(rmDAO.listarItensMovimento(dto.getIdMov(), dto.getIdColigada()));
					}
					
					if(TreatString.isNotBlank(naturezaOrcamentaria)) {
						Boolean possuiNatureza = Boolean.FALSE;
						for(ItemDTO item : dto.getListaItem()) {
							if(item.getIdNaturezaOrcamentaria().equals(naturezaOrcamentaria)) {
								possuiNatureza = Boolean.TRUE;
							}
						}
						
						if(possuiNatureza) {
							retorno.add(dto);
						}
						
					} else {
						retorno.add(dto);
					}
				}
			}
			
			LOG.info("[listarMovimentos] Movimentos filtrados.");
			return retorno;
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			throw e;
		}
	}
}
