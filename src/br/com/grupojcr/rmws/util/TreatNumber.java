package br.com.grupojcr.rmws.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class TreatNumber {

	/**
	 * Arredonda valor com duas casas decimais
	 */
	public static Double roundingTwoScale(Double value) {
		return roundingValue(value, 2);
	}

	/**
	 * @param scale - numero de casas decimais
	 * @return Double
	 */
	public static Double roundingValue(Double value, int scale) {
		if (value == null) {
			return null;
		}
		final BigDecimal big = new BigDecimal(value).setScale(scale, RoundingMode.HALF_UP);
		return new Double(big.toString());
	}

	public static boolean isNotNullOrZero(Number numero) {
		return !isNullOrZero(numero);
	}

	public static boolean isNullOrZero(Number... numeros) {
		for (Number numero : numeros) {
			if (numero == null || numero.doubleValue() == 0.0) {
				return true;
			}
		}
		return false;
	}

	public static boolean isNullOrZero(String numero) {
		if (TreatString.isBlank(numero)) {
			return true;
		}
		try {
			return Long.valueOf(numero).equals(Long.valueOf(0));
		} catch (NumberFormatException e) {
			return false;
		}
	}

	/**
	 * Formata em para moeda
	 */
	public final static String formatMoney(Number value) {
		if (value == null) {
			return "";
		}
		return format(value, "#,###,###,###,###,##0.00");
	}

	public static String formatThousand(Number number) {
		if (number == null) {
			return "0";
		}
		DecimalFormatSymbols symbols = new DecimalFormatSymbols();
		symbols.setDecimalSeparator('.');
		return format(number, "#,###,###,###,###", symbols );
	}

	public final static String formatMoneyCurrency(Number value) {
		if (value == null) {
			return "";
		}
		
		return "R$ " + format(value, "#,###,###,###,###,##0.00");
	}

	/**
	 * Converte uma string com conteudo "double" para um java.lang.Double
	 */
	public final static Double parseStringToDouble(String value) {
		if (TreatString.isBlank(value)) {
			return null;
		}
		if (value.indexOf(",") != -1) {
			value = value.replace(".", "");
			value = value.replace(",", ".");
		}
		try {
			return Double.parseDouble(value);
		} catch(Exception e) {
			return null;
		}
	}

	/**
	 * Converte uma string com conteudo "double" para um java.lang.Double
	 */
	public final static BigDecimal parseStringToBigDecimal(String value) {
		if (TreatString.isBlank(value)) {
			return null;
		}
		if (value.indexOf(",") != -1) {
			value = value.replace(".", "");
			value = value.replace(",", ".");
		}
		try {
			return new BigDecimal(value);
		} catch(Exception e) {
			return null;
		}
	}

	public static Boolean isEq(Object valor, Object valor2) {
		return trataNumber(valor).equals(trataNumber(valor2));
	}

	public static Double percentual(Integer parte, Integer total) {
		if (parte == null || (total == null || total.equals(0))) {
			return 0.00;
		}

		return roundingTwoScale(new Double(parte * 100 / total.doubleValue()));
	}

	public static Integer zeroIfNull(Integer value) {
		if (value == null) {
			return 0;
		}
		return value;
	}

	private static Object trataNumber(Object valor) {
		if (valor == null) {
			return "null";
		}
		return valor;
	}
	
	public static String formatarSequencial(Number sequencial) {
		String sequencialFormatado = "";
		
		if (sequencial != null && sequencial.intValue() <= 9) {
			sequencialFormatado = String.format("%02d", sequencial);
		}
		
		return sequencialFormatado;
	}

	private final static String format(Number value, String pattern) {
		return format(value, pattern, DecimalFormatSymbols.getInstance(new Locale("pt", "BR")));
	}

	private final static String format(Number value, String pattern, DecimalFormatSymbols symbols) {
		DecimalFormat format = new DecimalFormat(pattern, symbols);
		return format.format(value);
	}
}
