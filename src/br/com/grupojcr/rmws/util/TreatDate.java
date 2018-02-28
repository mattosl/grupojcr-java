package br.com.grupojcr.rmws.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TreatDate {
	
	public static final Integer calcularDiferencasEmMeses(Date dataInicio, Date dataFim) {
		if (dataFim.before(dataInicio)) {
			throw new IllegalArgumentException("Datas invalidas para contagem de meses");
		}
		Calendar calInicio = Calendar.getInstance();
		calInicio.setTime(dataInicio);
		
		Calendar calFim = Calendar.getInstance();
		calFim.setTime(dataFim);
		
		int mesesInicial = (calInicio.get(Calendar.MONTH)) + calInicio.get(Calendar.YEAR) * 12;
		int mesesFinal = (calFim.get(Calendar.MONTH)) + calFim.get(Calendar.YEAR) * 12;
		
		return (mesesFinal - mesesInicial) + 1;
	}
	
	public static final Integer contarDiferencaEmDias30Dias(Date dataInicio, Date dataFim) {
		int meses = calcularDiferencasEmMeses(dataInicio, dataFim);
		if (meses == 1) {
			return contarDiferencaDentroMesEmDias30Dias(dataInicio, dataFim);
		}
		
		Integer diasMesInicio = contarDiferencaDentroMesEmDias30Dias(dataInicio, ultimoDiaMes(dataInicio));
		Integer diasMesFim = contarDiferencaDentroMesEmDias30Dias(primeiroDiaMes(dataFim), dataFim);
		Integer diasIntervalo = 0;
		
		if (meses >= 2) {
			diasIntervalo = (meses - 2) * 30;
		}
		return diasMesInicio + diasIntervalo + diasMesFim;
	}
	
	private static final Integer contarDiferencaDentroMesEmDias30Dias(Date dataInicio, Date dataFim) {
		Integer dias = contarDiferencaEmDias(dataInicio, dataFim);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(dataFim);
		
		int ultimoDia = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		if (dias < ultimoDia) {
			if (cal.get(Calendar.DAY_OF_MONTH) != ultimoDia) {
				return dias;
			}
		}
		if (cal.get(Calendar.MONTH) == Calendar.FEBRUARY) {
			return dias + (30 - ultimoDia);
		}
		
		return dias - (ultimoDia - 30);
	}
	
	public static final Integer contarDiferencaEmDias(Date dataInicio, Date dataFim) {
		if (dataFim.before(dataInicio)) {
			throw new IllegalArgumentException("Datas invalidas para contagem de dias");
		}

		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(clearDateTime(dataInicio));

		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(clearDateTime(dataFim));
		
		int count = 0;
		while (!isMesmaData(cal1.getTime(), cal2.getTime())) {
			cal1.add(Calendar.DAY_OF_MONTH, 1);
			count++;
		}
		return count + 1;
	}
	
	public static Boolean isMesmaData(Date data1, Date data2) {
		return formatDefaultDate(data1).equals(formatDefaultDate(data2));
	}

	public static Date ultimoDiaMes(Date data) {
		Calendar atual = Calendar.getInstance();
		atual.setTime(clearDateTime(data));
		
		int ultimoDia = atual.getActualMaximum(Calendar.DAY_OF_MONTH);
		atual.set(Calendar.DAY_OF_MONTH, ultimoDia);
		return atual.getTime();
	}
	
	public static Date ultimoDiaMes(int mesReferencia) {
		Calendar atual = Calendar.getInstance();
		atual.setTime(new Date());
		atual.set(Calendar.MONTH, mesReferencia - 1);
		return ultimoDiaMes(atual.getTime());
	}

	public static Integer ano(Date data) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		return cal.get(Calendar.YEAR);
	}

	/**
	 * Retorna o numero do mes, iniciando em 1 ate 12
	 * @author Renan Oliveira - renan.oliveira@sigma.com.br
	 * @since 07/08/2014
	 * @param dataAdmissao
	 * @return
	 */
	public static Integer mes(Date data) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		return cal.get(Calendar.MONTH) + 1;
	}
	
	/**
	 * Retorna uma data sem horas minutos e segundos.
	 * @author: Felipe dos Santos Assis <felipe.assis@sigma.com.br>
	 * @since 07/05/2016
	 * @param data : Date
	 * @return DAte
	 * @throws ParseException
	 */
	public static Date dataSemHorario(Date data) throws ParseException {
		if (data != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			return sdf.parse(sdf.format(data));
		}

		return null;
	}

	public static Date primeiroDiaMes(Date data) {
		Calendar atual = Calendar.getInstance();
		atual.setTime(clearDateTime(data));
		
		atual.set(Calendar.DAY_OF_MONTH, 1);
		return atual.getTime();
	}
	
	public static Date primeiroDiaMes(int mesReferencia) {
		Calendar atual = Calendar.getInstance();
		atual.setTime(new Date());
		atual.set(Calendar.MONTH, mesReferencia - 1);
		return primeiroDiaMes(atual.getTime());
	}
	
	public static Date primeiroDiaDoMesAno(Integer mes, Integer ano) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(clearDateTime(montaData(1, mes, ano)));
		return cal.getTime();
	}

	public static boolean isPassado(Date data) {
		return clearDateTime(new Date()).after(clearDateTime(data));
	}
	
	/**
	 * Retorna a mesma data com horário minimo 
	 * @param date
	 * @return
	 */
	public static final Date clearDateTime(Date date) {
		if (date == null) {
			return null;
		}
		Calendar calTemp = Calendar.getInstance();
		calTemp.setTime(date);

		Calendar cal = Calendar.getInstance();
		cal.clear();
		// seta apenas campos da data
		cal.set(Calendar.DATE, calTemp.get(Calendar.DATE));
		cal.set(Calendar.YEAR, calTemp.get(Calendar.YEAR));
		cal.set(Calendar.MONTH, calTemp.get(Calendar.MONTH));
		return cal.getTime();
	}
	
	/**
	 * Retorna a mesma data com horário maximo 
	 * @param date
	 * @return
	 */
	public static final Date maxDateTime(Date date) {
		if (date == null) {
			return null;
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);

		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MILLISECOND, 999);
		return cal.getTime();
	}
	
	public static final String formatDefaultDate(Date date) {
		if(date == null){
			return "";
		}
		return format("dd/MM/yyyy", date);
	}
	
	/**
	 * Formata data confome o padrao especificado
	 */
	public static final String format(String pattern, Date date) {
		if (date == null)
			return "";
		SimpleDateFormat sd = new SimpleDateFormat(pattern);
		return sd.format(date);
	}
	
	public static Date primeiroDiaAno(Integer ano) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(clearDateTime(new Date()));
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.MONTH, Calendar.JANUARY);
		cal.set(Calendar.YEAR, ano);
		return cal.getTime();
	}

	public static Date ultimoDiaAno(Integer ano) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(clearDateTime(new Date()));
		cal.set(Calendar.MONTH, Calendar.DECEMBER);
		cal.set(Calendar.DAY_OF_MONTH, 31);
		cal.set(Calendar.YEAR, ano);
		return cal.getTime();
	}
	
	public static Date ultimoDiaDoMesAno(Integer mes, Integer ano) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(clearDateTime(montaData(1, mes, ano)));
	    cal.add(Calendar.MONTH, 1);  
        cal.add(Calendar.DAY_OF_MONTH, -1);  
		return cal.getTime();
	}
	
	public static Date ultimoDiaUtilDoMesAno(Integer mes, Integer ano) {
		Date ultimoDiaMes = ultimoDiaDoMesAno(mes, ano);
		if(isDiaUtil(ultimoDiaMes)) {
			return ultimoDiaMes;
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(clearDateTime(ultimoDiaMes));
		do {
			cal.add(Calendar.DAY_OF_MONTH, -1);
		} while(!isDiaUtil(cal.getTime()));
		return cal.getTime();
	}
	
	public static Date ultimoDiaUtil(Date ultimoDiaMes) {
		
		ultimoDiaMes = ultimoDiaMes(ultimoDiaMes);
		
		if(isDiaUtil(ultimoDiaMes)) {
			return ultimoDiaMes;
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(clearDateTime(ultimoDiaMes));
		do {
			cal.add(Calendar.DAY_OF_MONTH, -1);
		} while(!isDiaUtil(cal.getTime()));
		return cal.getTime();
	}
	
	public static Date montaData(Integer dia, Integer mes, Integer ano) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(clearDateTime(new Date()));
		cal.set(Calendar.MONTH, mes - 1);
		cal.set(Calendar.DAY_OF_MONTH, dia);
		cal.set(Calendar.YEAR, ano);
		return cal.getTime();
	}

	public static Boolean isDiaUtil(Date data) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		int diaDaSemana = cal.get(Calendar.DAY_OF_WEEK);
		if(diaDaSemana >= Calendar.MONDAY && diaDaSemana <= Calendar.FRIDAY) {
			return true;
		} else {
			return false;
		}
	}

	public static Date primeiroDiaUtilApartirDaData(Date data) {
		if(isDiaUtil(data)) {
			return data;
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(clearDateTime(data));
		do {
			cal.add(Calendar.DAY_OF_MONTH, 1);
		} while(!isDiaUtil(cal.getTime()));
		return cal.getTime();
	}
	
	public static Date primeiroDiaUtilAteData(Date data) {
		if(isDiaUtil(data)) {
			return data;
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(clearDateTime(data));
		do {
			cal.add(Calendar.DAY_OF_MONTH, -1);
		} while(!isDiaUtil(cal.getTime()));
		return cal.getTime();
	}
	
	public static Date adicionaDiasUteis(Date data, Integer dias) {
		Integer incremento = null;
		if(dias.equals(0)){
			return data;
		} else if(dias.intValue() > 0){
			incremento = 1;
		} else {
			incremento = -1;
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(clearDateTime(data));
		Integer contador = 0;
		while( !contador.equals(dias) ) {
			cal.add(Calendar.DAY_OF_MONTH, incremento);
			if(isDiaUtil(cal.getTime())){
				contador += incremento;
			}
		}
		return cal.getTime();
	}

	public static Integer dia(Date data) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		return cal.get(Calendar.DAY_OF_MONTH);
    }

	/**
	 * Verifica se a data passada esta no mes atual
	 * @author Renan Oliveira - renan.oliveira@sigma.com.br
	 * @since 27/10/2014
	 * @param data
	 * @return
	 */
	public static boolean isMesAtual(Date data) {
		
		Date comparar = clearDateTime(data);

		Date agora = new Date();

		if (primeiroDiaMes(agora).compareTo(comparar) <= 0 && ultimoDiaMes(agora).compareTo(comparar) >= 0) {
			return true;
		}
		return false;
	}
	
	/**
	 * Retorna a descricao do mes passado
	 * @author Renan Oliveira - renan.oliveira@sigma.com.br
	 * @since 31/10/2014
	 * @param mes - deve iniciar em 1.
	 * @return descricao do mes, ex "Janeiro" se passado valor 1
	 */
	public static String descricaoMes(Integer mes) {
		if (mes == null) {
			return "";
		}
		if (mes < 0 || mes > 12) {
			throw new IllegalArgumentException("Mes informado [" + mes + "] é inválido.");
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.MONTH, mes - 1);
		return format("MMMMM", cal.getTime());
	}
	
	public static Date retrocederDias(Date data, Integer dias) {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(clearDateTime(data));
		cal.add(Calendar.DAY_OF_MONTH, -dias);
		return cal.getTime();
	}
	
	public static Date retrocederMeses(Date data, Integer meses) {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(clearDateTime(data));
		cal.add(Calendar.MONTH, -meses);
		return cal.getTime();
	}

	public static boolean isMes(Integer mes, Integer ano, Date dataComparar) {
		return (mes + "" + ano).equals(TreatDate.mes(dataComparar) + "" + TreatDate.ano(dataComparar));
	}
	
	
	public static final Integer calcularDiferencaProporcionalDiasEm30Dias(Date dataFim, Integer diasCargaHoraria) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(dataFim);
		
		if (cal.get(Calendar.MONTH) == Calendar.FEBRUARY) {
			diasCargaHoraria = diasCargaHoraria + (30 - cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		} else {
			diasCargaHoraria = diasCargaHoraria - (cal.getActualMaximum(Calendar.DAY_OF_MONTH) - 30);
		}
		return diasCargaHoraria;
	}

	public static boolean isMesmoMes(Date dataMes, Date dataComparar) {
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(dataMes);

		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(dataComparar);
		
		return cal2.get(Calendar.MONTH) == cal1.get(Calendar.MONTH)
				&& cal2.get(Calendar.YEAR) == cal1.get(Calendar.YEAR);
	}
	
	/**
	 * Formata data confome o padrao especificado
	 * @throws ParseException 
	 */
	public static final Date format(String pattern, String data) throws ParseException {
		if(Util.isBlank(data)) {
			return null;
		}

		SimpleDateFormat format = new SimpleDateFormat(pattern);
		return new Date(format.parse(data).getTime());
		
	}
	
	/**
	 * Método responsável por concatenar duas datas e forma período
	 * @since 12/11/2015 11:00:18
	 * @author Roberto G Claro <roberto.claro@sigma.com.br> (Implementação)
	 * @param dataInicial	:Date
	 * @param dataFinal		:Date
	 * @return Strig : dd/MM/yyyy a dd/MM/yyyy
	 */
	public static String concatenarPeriodo(Date dataInicial, Date dataFinal){
		StringBuilder periodo = new StringBuilder();
		periodo.append(TreatDate.format("dd/MM/yyyy 'a' ", dataInicial));
		periodo.append(TreatDate.format("dd/MM/yyyy", dataFinal));
		return periodo.toString();
	}
	
	/**
	 * Método responsável em retornar se uma data está presente em um determinado período. 
	 * @author Felipe dos Santos Assis <felipe.assis@sigma.com.br> (Implementação)
	 * @since 17/11/2015
	 * @param data : Date - Data a ser verificada
	 * @param dataInicial : Date - Data incial do período
	 * @param dataFinal : Date - Data final do período
	 * @return Boolean
	 */
	public static Boolean pertenceAoPeriodo(Date data, Date dataInicial, Date dataFinal) {
		if ((data.equals(dataInicial) || data.after(dataInicial)) 
				&& (data.equals(dataFinal) || data.before(dataFinal))) {
			return Boolean.TRUE;
		}
		
		return Boolean.FALSE;
	}
	
	/**
	 * Método responsável em retornar se uma data pertence ao período de uma mesma data em específico
	 * @author: Felipe dos Santos Assis <felipe.assis@sigma.com.br>
	 * @since 07/05/2016
	 * @param data : Date - Data a ser verificada
	 * @param dataInicial : Date - Data inicial do período
	 * @param dataFinal Date - Data final do período
	 * @return Boolean
	 */
	public static Boolean periodosIguais(Date data, Date dataInicial, Date dataFinal) {
		if (data.equals(dataInicial) && data.equals(dataFinal)) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	

	/**
	  * Valida data string mes, dia e ano bissexto
	  * 
	  * @author Nelson kuchar junior
	  * @email nelson.kuchar@sigma.com.br
	  * @since 14/06/2017 <13:46>
	  * @param data
	  * @return boolean
	  */
	public static boolean validarDataMesDia(String data) {
		GregorianCalendar calendar = new GregorianCalendar();
		int dia = 0, mes = 0, ano = 0;
		String diaStr = data.substring(0, 2);
		String mesStr = data.substring(3, 5);
		String anoStr = data.substring(6, 10);
		try {
			dia = Integer.parseInt(diaStr);
			mes = Integer.parseInt(mesStr);
			ano = Integer.parseInt(anoStr);
		} catch (Exception e) {
			return false;
		}
		if (dia < 1 || mes < 1 || ano < 1)
			return false;
		else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
			if (dia <= 31)
				return true;
			else
				return false;
		else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
			if (dia <= 30)
				return true;
			else
				return false;
		else if (mes == 2)
			if (calendar.isLeapYear(ano))
				if (dia <= 29)
					return true;
				else
					return false;
			else if (dia <= 28)
				return true;
			else
				return false;
		else if (mes > 12)
			return false;
		return true;
	}
	
}
