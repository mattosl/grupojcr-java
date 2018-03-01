package br.com.grupojcr.rmws.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import br.com.grupojcr.rmws.dao.RMDAO;
import br.com.grupojcr.rmws.dto.AprovadorDTO;
import br.com.grupojcr.rmws.dto.MovimentoDTO;

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
	public List<MovimentoDTO> listarMovimentos(String usuario, Date dtInicio, Date dtFim, Integer idColigada) {
		try {
			LOG.info("[listarMovimentos] Listando aprovações do período...");
			List<MovimentoDTO> movimentos = rmDAO.listarAprovacaoPorPeriodo(idColigada, dtInicio, dtFim);
			List<MovimentoDTO> retorno = new ArrayList<MovimentoDTO>();
	
			LOG.info("[listarMovimentos] Verificando movimentos que o usuário tem ligação...");
			for (MovimentoDTO dto : movimentos) {
				Boolean possuiVinculo = Boolean.FALSE;
				String lotacao = rmDAO.obterLotacao(dto.getIdColigada(), dto.getIdCentroCusto());
				List<AprovadorDTO> primeirosAprovadores = rmDAO.obterPrimeiroAprovadores(lotacao);
				List<AprovadorDTO> segundosAprovadores = rmDAO.obterSegundoAprovadores(lotacao);
	
				for (AprovadorDTO primeiro : primeirosAprovadores) {
					if (primeiro.getUsuarioAprovacao().equals(usuario)) {
						possuiVinculo = Boolean.TRUE;
					}
				}
				for (AprovadorDTO segundo : segundosAprovadores) {
					if (segundo.getUsuarioAprovacao().equals(usuario)) {
						possuiVinculo = Boolean.TRUE;
					}
				}
				if (possuiVinculo.booleanValue()) {
					retorno.add(dto);
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
