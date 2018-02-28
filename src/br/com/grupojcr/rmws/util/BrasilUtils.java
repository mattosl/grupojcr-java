package br.com.grupojcr.rmws.util;

import java.util.ArrayList;
import java.util.Map;

public class BrasilUtils {
	
	public static final Boolean isCepValid(String cep) {
		if (TreatString.isBlank((String) cep).booleanValue()) {
			return false;
		}
		String test = TreatString.filterOnlyNumber((String) cep);
		if (TreatString.isBlank((String) test).booleanValue()) {
			return false;
		}
		if (new Integer(test).equals(0)) {
			return false;
		}
		if (test.length() == 8) {
			return true;
		}
		return false;
	}

	public static final Boolean isCPFValid(String valor) {
		if (TreatString.isBlank((String) (valor = TreatString.filterOnlyNumber((String) valor))).booleanValue()
				|| valor.length() != 11) {
			return false;
		}
		String c = valor.substring(0, 9);
		String dv = valor.substring(9, 11);
		Integer d1 = 0;
		Integer i = 0;
		while (i < 9) {
			d1 = d1 + Integer.parseInt("" + c.charAt(i)) * (10 - i);
			i = i + 1;
		}
		if (d1 == 0) {
			return false;
		}
		if ((d1 = Integer.valueOf(11 - d1 % 11)) > 9) {
			d1 = 0;
		}
		if (Integer.parseInt("" + dv.charAt(0)) != d1) {
			return false;
		}
		d1 = d1 * 2;
		i = 0;
		while (i < 9) {
			d1 = d1 + Integer.parseInt("" + c.charAt(i)) * (11 - i);
			i = i + 1;
		}
		if ((d1 = Integer.valueOf(11 - d1 % 11)) > 9) {
			d1 = 0;
		}
		if (Integer.parseInt("" + dv.charAt(1)) != d1 || valor.equals("11111111111") || valor.equals("22222222222")
				|| valor.equals("33333333333") || valor.equals("44444444444") || valor.equals("55555555555")
				|| valor.equals("66666666666") || valor.equals("77777777777") || valor.equals("88888888888")
				|| valor.equals("99999999999")) {
			return false;
		}
		return true;
	}

	public static final Boolean isDocumentoValido(String documento) {
		if (TreatString.isBlank((String) documento).booleanValue()) {
			return false;
		}
		if (documento.length() <= 11) {
			return BrasilUtils.isCPFValid(documento);
		}
		return BrasilUtils.isCNPJValid(documento);
	}

	public static final Boolean isCNPJValid(String cnpj) {
		if (cnpj == null) {
			return false;
		}
		if ((cnpj = TreatString.filterOnlyNumber((String) cnpj)).length() < 14) {
			return false;
		}
		ArrayList<Integer> a = new ArrayList<Integer>();
		Integer b = 0;
		int[] c = new int[] { 6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2 };
		int i = 0;
		while (i < 12) {
			a.add(i, Integer.parseInt(String.valueOf(cnpj.charAt(i))));
			b = b + (Integer) a.get(i) * c[i + 1];
			++i;
		}
		int x = 0;
		x = b % 11;
		if (x < 2) {
			a.add(12, 0);
		} else {
			a.add(12, 11 - x);
		}
		b = 0;
		int y = 0;
		while (y < 13) {
			b = b + (Integer) a.get(y) * c[y];
			++y;
		}
		x = b % 11;
		if (x < 2) {
			a.add(13, 0);
		} else {
			a.add(13, 11 - x);
		}
		if (Integer.parseInt("" + cnpj.charAt(12)) != (Integer) a.get(12)
				|| Integer.parseInt("" + cnpj.charAt(13)) != (Integer) a.get(13)) {
			return false;
		}
		return true;
	}

	public static String escapeTelefoneComDDD(String telefone) {
		if (TreatString.isBlank((String) telefone).booleanValue()) {
			return null;
		}
		String telefoneNumber = TreatString.filterOnlyNumber((String) telefone);
		if (TreatString.isNotBlank((String) telefoneNumber).booleanValue() && telefoneNumber.charAt(0) == '0') {
			return telefoneNumber.substring(1, telefoneNumber.length());
		}
		return telefoneNumber;
	}

	public static String escapeCNPJ(String cnpj) {
		if (TreatString.isBlank((String) (cnpj = TreatString.filterOnlyNumber((String) cnpj))).booleanValue()) {
			return null;
		}
		return TreatString.completeZeroToLeft((Object) cnpj, (Integer) 14);
	}

	public static String escapeCPF(String cpf) {
		if (TreatString.isBlank((String) (cpf = TreatString.filterOnlyNumber((String) cpf))).booleanValue()) {
			return null;
		}
		return TreatString.completeZeroToLeft((Object) cpf, (Integer) 11);
	}

	public static String getDDD(String telefone) {
		if (TreatString.isBlank((String) telefone).booleanValue()) {
			return null;
		}
		if (telefone.length() <= 2) {
			return telefone;
		}
		return telefone.substring(0, 2);
	}

	public static String getTelefone(String telefone) {
		if (TreatString.isBlank((String) telefone).booleanValue()) {
			return null;
		}
		if (telefone.length() > 2) {
			return telefone.substring(2, telefone.length());
		}
		return "";
	}

	public static String formatarCEP(String cep) {
		cep = TreatString.filterOnlyNumber((String) cep);
		return TreatString.formatString((String) cep, (String) "#####-###");
	}

	public static String formatarDocumento(Object doc) {
		if (doc == null) {
			return null;
		}
		String parse = TreatString.filterOnlyNumber((String) doc.toString());
		if (parse.length() > 11) {
			return BrasilUtils.formatarCNPJ(parse);
		}
		return BrasilUtils.formatarCPF(parse);
	}

	public static String formatarCPF(String cpf) {
		cpf = TreatString.filterOnlyNumber((String) cpf);
		return TreatString.formatString((String) cpf, (String) "###.###.###-##");
	}

	public static String formatarCNPJ(String cnpj) {
		cnpj = TreatString.filterOnlyNumber((String) cnpj);
		return TreatString.formatString((String) cnpj, (String) "##.###.###/####-##");
	}

	public static String formatarTelefoneComDDD(String telefone) {
		if (TreatString.isBlank((String) telefone).booleanValue()) {
			return "";
		}
		if (TreatString.isBlank((String) (telefone = TreatString.filterOnlyNumber((String) telefone))).booleanValue()) {
			return null;
		}
		Long telefoneLong = new Long(telefone);
		if (telefoneLong.toString().length() == 10) {
			return TreatString.formatString((String) telefoneLong.toString(), (String) "(##) ####-####");
		}
		return TreatString.formatString((String) telefoneLong.toString(), (String) "(##) #####-####");
	}

	public static String formatarIP(String ip) {
		ip = TreatString.filterOnlyNumber((String) ip);
		return TreatString.formatString((String) ip, (String) "###.###.###.###");
	}

	public static String getBinCartao(String numero) {
		return numero.substring(0, 6);
	}

	public static String getFimCartao(String numero) {
		return numero.substring(numero.length() - 4, numero.length());
	}

	public static String mascararNumeroCartao(String numero, Integer tamanhoMaximo) {
		if (TreatString.isBlank((String) (numero = TreatString.filterOnlyNumber((String) numero))).booleanValue()) {
			return null;
		}
		String binCartao = BrasilUtils.getBinCartao(numero);
		String fimCartao = BrasilUtils.getFimCartao(numero);
		StringBuilder to = new StringBuilder(binCartao);
		int restante = tamanhoMaximo - (binCartao.length() + fimCartao.length());
		int i = 0;
		while (i < restante) {
			to.append("*");
			++i;
		}
		to.append(fimCartao);
		if (to.length() != tamanhoMaximo.intValue()) {
			throw new IllegalStateException("Falha mascarar o numero do cartao");
		}
		return to.toString();
	}

	public static String converterCaracteresEspeciaisHTML(String string) {
		for (Map.Entry<String, String> iterator : Dominios.mapaHTML.entrySet()) {
			string = string.replaceAll(iterator.getKey(), iterator.getValue());
		}
		return string;
	}
}