package br.com.grupojcr.rmws.util;

public final class AcentosUtil {

	private static final String COM_ACENTO = "\u00E0\u00E1\u00E3\u00E4\u00E2\u00C0\u00C1\u00C3\u00C4\u00C2\u00E8\u00E9\u00EB\u00EA\u00C8\u00C9\u00CB\u00CA\u00EC\u00ED\u00EF\u00EE\u00CC\u00CD\u00CF\u00CE\u00F2\u00F3\u00F5\u00F6\u00F4\u00D2\u00D3\u00D5\u00D6\u00D4\u00F9\u00FA\u00FC\u00FB\u00D9\u00DA\u00DC\u00DB\u00E7\u00C7";
	private static final String SEM_ACENTO = "aaaaaAAAAAeeeeEEEEiiiiIIIIoooooOOOOOuuuuUUUUcC";
	private static final char[] CARACTERES_ESPECIAIS = {' ', '\'', '\"', '\u0021', '\u0040', '\u0023', '\u0024', '\u0025', '\u00A8', '\u0026', '\u002A', '\u0028', '\u0029', '\u002D', '\u005F', '\u003D', '\u002B', '\u005B', '\u007B', '\u00AA', '\u007E', '\u005E', '\u005D', '\u007D', '\u00BA', '\\', '\u007C', '\u002C', '\u003C', '\u002E', '\u003E', '\u003B', '\u003A', '/', '\u003F', '\u00B0'};

	private AcentosUtil(){};
	
	/**
	 * Remove acentuacao de uma String.
	 * @param linha : String acentuada.
	 * @return String sem acento.
	 */
	public static String removeAcentos(String linha) {

		StringBuilder linhaNova = new StringBuilder("");
		String acento = "";
		String letra = "";

		if(linha == null) {
			return null;
		}

		for (int i = 0; i <= linha.length() - 1; i++) {

			letra = linha.substring(i, i + 1);

			for (int j = 0; j <= COM_ACENTO.length() - 1; j++) {

				if (COM_ACENTO.substring(j, j + 1).equals(letra)) {
					letra = SEM_ACENTO.substring(j, j + 1);
				}
			}

			linhaNova = linhaNova.append(letra);
		}

		acento = linhaNova.toString();

		return acento;
	}

	/**
	 * Verifica se existe algum caracter com acento na string passada.
	 * @param texto : texto a ser verificado
	 * @return true se existe acento na String, falso caso contrario.
	 */
	public static boolean existeAcento(String texto) {

		if(texto == null) {
			return false;
		}

		char[] acentos = COM_ACENTO.toCharArray();
		
		for(char caracter : acentos) {

			if(texto.contains(String.valueOf(caracter))) {
				return true;
			}
		}
		
		return false;
	}

	/**
	 * Verifica se existe algum caracter especial na string passada.
	 * @param texto : texto a ser verificado
	 * @return true se existe acento na String, falso caso contrario.
	 */
	public static boolean existeCaracterEspecial(String texto) {

		if(texto == null) {
			return false;
		}

		for(char caracter : CARACTERES_ESPECIAIS) {

			if(texto.contains(String.valueOf(caracter))) {
				return true;
			}
		}

		return false;
	}

	/**
	 * Lista de String com acentos.
	 * @return String com acentos.
	 */
	public static String getListaComAcentos() {
		return COM_ACENTO;
	}

	/**
	 * Lista de String sem acentos.
	 * @return String sem acentos.
	 */
	public static String getListaSemAcentos() {
		return SEM_ACENTO;
	}

	/**
	 * Lista de String de caraceteres especiais.
	 * @return String de caraceteres especiais.
	 */
	public static char[] getListaCaracteresEspeciais() {
		return CARACTERES_ESPECIAIS.clone();
	}
}
