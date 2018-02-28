package br.com.grupojcr.rmws.util;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.text.MaskFormatter;

import org.apache.commons.lang.WordUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;


public class TreatString {

	public static final String escape(String string) {
		if (TreatString.isBlank(string)) {
			return "";
		}
		return string.trim();
	}

	/**
	 * Verifica se existe o padrao na string passada
	 *
	 * @return Boolean
	 */
	public static final Boolean isSequenceStringExists(String string,
			String regex) {
		Pattern p = Pattern.compile(regex);
		Matcher mat = p.matcher(string);
		if (mat.matches()) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

	public static final String formataTelefone(String telefone){
		if(telefone == null){
			return "";
		}
		if (telefone.length() == 8) {
			return telefone.substring(0, 4) + "-" + telefone.substring(4);
		}
		if (telefone.length() == 9) {
			return telefone.substring(0, 5) + "-" + telefone.substring(5);
		}
		if (telefone.length() == 10) {
			return "(" + telefone.substring(0, 2) + ") " + telefone.substring(2, 6) + " - " + telefone.substring(6);
		}
		if (telefone.length() == 11) {
			return "(" + telefone.substring(0, 2) + ") " + telefone.substring(2, 7) + " - " + telefone.substring(7);
		}
		return telefone;
	}

	public static final String getSequenceStringExists(String string,
			String regex) {
		Pattern p = Pattern.compile(regex);
		Matcher mat = p.matcher(string);
		if (mat.find()) {
			return mat.group();
		}
		return null;
	}

	public static final Collection<String> getSequencesStringExists(
			String string, String regex) {
		Pattern p = Pattern.compile(regex);
		Matcher mat = p.matcher(string);
		ArrayList<String> sequences = new ArrayList<String>();
		while (mat.find()) {
			sequences.add(mat.group());
		}
		return sequences;
	}

	/**
	 * Verifica se o email valido
	 */
	public static final Boolean isEmailValid(String email) {
		if (email == null) {
			return false;
		}
		String regex = "^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$";
		return isSequenceStringExists(email, regex);
	}

	public static final Boolean isNotBlank(String string) {
		if (string != null) {
			string = string.trim();
			return !string.isEmpty();
		}
		return false;
	}

	public static final Boolean isBlank(String string) {
		if (string != null) {
			return string.trim().isEmpty();
		}
		return true;
	}

	/**
	 * Filtra string, deixando apenas numeros na string
	 */
	public static final String filterOnlyNumber(String value) {
		if (isBlank(value)) {
			return null;
		}
		return value.replaceAll("\\D", "");
	}

	public static String md5(String value) {
		return encryptsValue(value, Algorithm.MD5);
	}

	public static String randomId() {
		return UUID.randomUUID().toString();
	}

	/**
	 * Retorna um texto criptografado.
	 *
	 * @param value
	 *            o texto a ser criptografado.
	 * @param algorithm
	 *            o tipo de algoritmo: MD2, MD5, SHA-1, SHA-256, SHA-384 ou
	 *            SHA-512.
	 * @return o texto criptografado.
	 * @throws Exception
	 */
	public static String encryptsValue(String value, Algorithm algorithm) {
		if (isBlank(value)) {
			return null;
		}
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance(algorithm.toString());
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
		md.reset();
		byte[] b = md.digest(value.getBytes());
		String hexa = "0123456789ABCDEF";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < b.length; i++) {
			int j = ((int) b[i]) & 0xFF;
			sb.append(hexa.charAt(j / 16));
			sb.append(hexa.charAt(j % 16));
		}
		return sb.toString();
	}
	
	public static final String escapeSequencia(String value){
		if(StringUtils.isBlank(value)){
			return value;
		}
		
		String retorno = StringEscapeUtils.unescapeJava(escapeHTML(value));
		
		retorno = retorno.replaceAll("\n", "");
		retorno = retorno.replaceAll("\t", " ");
		retorno = retorno.replaceAll("\r", "");
		
		return retorno;
	}

	public static final String escapeHTML(String value) {
		if (value == null) {
			return null;
		}
		
		return value.replaceAll("\\<[^>]*>", "");
	}

	/**
	 * Verifica se algum elemento do array passado esta nulo
	 */
	public static final Boolean isAnythingIsNull(Object... objects) {
		for (Object object : objects) {
			if (object == null) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Completa o valor passado, colocando zero a esquerda.
	 *
	 * @param value
	 *            - objeto que contem o valor a ser avaliado
	 * @param size
	 *            - numero total de caracteres que o retorno deve ter
	 * @return String
	 */
	public static final String completeZeroToLeft(Object value, Integer size) {
		return completeToLeft(value, size, "0");
	}

	public static final String completeToLeft(Object value, Integer size, String preencherCom) {
		if (value == null || isBlank(value.toString())) {
			return null;
		}
		if (size.equals(value.toString().length())) {
			return value.toString();
		}
		StringBuilder sb = new StringBuilder(value.toString());
		while (sb.length() < size) {
			sb.insert(0, preencherCom);
		}
		return sb.toString();
	}

	public static String completeToRight(String value, Integer size, String preencherCom) {
		if (value == null || isBlank(value.toString())) {
			return null;
		}
		if (size.equals(value.toString().length())) {
			return value.toString();
		}
		StringBuilder sb = new StringBuilder(value.toString());
		while (sb.length() < size) {
			sb.append(preencherCom);
		}
		return sb.toString();
	}

	/**
	 * Realiza um "replace" no template/source passado como parametro, alterando
	 * as ocorrencias pelo valor informado.
	 *
	 * @param tag
	 *            - identificador no template. ex: {tag} {numeroPedido}
	 * @param template
	 *            - conteudo que tem todo o texto
	 * @param value
	 *            - valor que sera substituido nas ocorrencias encontradas
	 * @return a mesma fonte informada
	 */
	public static final StringBuilder replace(String tag,
			StringBuilder template, Object value) {
		if (value == null) {
			value = "";
		}
		Integer fromIndex = null;
		while ((fromIndex = template.indexOf(tag)) != -1) {
			template.replace(fromIndex, fromIndex + tag.length(),
					value.toString());
		}
		return template;
	}

	public static final void checkKey(String algoritimo, String secreteKey,
			String rawpayload, byte[] sig) {
		try {
			SecretKeySpec secretKeySpec = new SecretKeySpec(
					secreteKey.getBytes(), algoritimo);
			Mac mac = Mac.getInstance(algoritimo);
			mac.init(secretKeySpec);
			byte[] mysig = mac.doFinal(rawpayload.getBytes());
			if (!Arrays.equals(mysig, sig)) {
				throw new IllegalStateException("Non-matching signature for request");
			}
		} catch (NoSuchAlgorithmException e) {
			throw new IllegalStateException("Unknown hash algorithm "
					+ algoritimo, e);
		} catch (InvalidKeyException e) {
			throw new IllegalStateException("Wrong key for " + algoritimo, e);
		}
	}

	public static String formatString(String str, String mask) {
		if (str == null || str.trim().isEmpty()) {
			return "";
		}
		
		try {
			MaskFormatter mf = new MaskFormatter(mask);
			mf.setValueContainsLiteralCharacters(false);
			return mf.valueToString(str);
		} catch (ParseException e) {
			throw new RuntimeException("Erro ao formatar string. "
					+ e.getMessage());
		}
	}

	public static String subString(String string, int tamanho) {
		if (string == null) {
			return null;
		}
		if (string.length() > tamanho) {
			return string.substring(0, tamanho);
		}
		return string;
	}

	public static Boolean isNameValid(String nomeCompleto) {
		if (isBlank(nomeCompleto)) {
			return false;
		}
		String[] partes = nomeCompleto.split(" ");
		int partesIdentificadas = 0;
		for (String parte : partes) {
			if (isBlank(parte)) {
				continue;
			}
			partesIdentificadas++;
		}
		return partesIdentificadas > 1;
	}

	private static enum Algorithm {
		MD2, MD5, SHA_1, SHA_256, SHA_384, SHA_512
	}

	public static String traduzirColuna(String nomeColuna){
		return nomeColuna;
	}

	public static String removerAcentos(String string) {
		return Normalizer.normalize(string, Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
	}

	public static String toUpper(String observacoes) {
		if (TreatString.isBlank(observacoes)) {
			return null;
		}
		return observacoes.toUpperCase();
	}

	public static String treatBlank(String rg) {
		if (rg == null) {
			return "";
		}
		return rg;
	}
	
	public static String geraEspaco(Integer cont){
		if (cont == null || (cont != null && cont.equals(0))){
			return "";
		}else{
			StringBuilder sb = new StringBuilder();
			for(int i = 1; i <= cont; i++){
				sb.append(" ");
			}
			
			return sb.toString();
		}
	}
	
	public static String geraEspacoHtml(Integer cont){
		if (cont == null || (cont != null && cont.equals(0))){
			return "";
		}else{
			StringBuilder sb = new StringBuilder();
			for(int i = 1; i <= cont; i++){
				sb.append("&nbsp;");
			}
			
			return sb.toString();
		}
	}
	
	public static String geraCaracteresHtml(Integer cont, String html){
		if (cont == null || (cont != null && cont.equals(0))){
			return "";
		}else{
			StringBuilder sb = new StringBuilder();
			for(int i = 1; i <= cont; i++){
				sb.append(html);
			}
			
			return sb.toString();
		}
	}
	
	public static String mascaraOficio(Integer numero){
		if (numero == null || (numero != null && numero.equals(0))){
			return "";
		}else{
			String valor = numero.toString();
			if(valor.length() > 4){
				int indice = valor.length() - 4;
				valor = valor.substring(0, indice)+"/"+valor.substring(indice, valor.length());
			}
			return valor.toString();
		}
	}

	
	/**
	 * Método responsável em formatar um texto para URLs substituidindo todos os caracteres acentuados, removendo 
	 * todos os espaços em branco e deixando todos os caracteres minúsculos.
	 * Ex: Consulta de Viagens -> consultadeviagens
	 * @param tema : String
	 * @return String
	 */
	public static String formatarUrlTema(String tema) {
		if (!isBlank(tema)) {
			char[] comAcento = "ãâàáäêèéëîìíïõôòóöûúùüÃÂÀÁÄÊÈÉËÎÌÍÏÕÔÒÓÖÛÙÚÜçÇñÑ".toCharArray();
			char[] semAcento = "aaaaaeeeeiiiiooooouuuuAAAAAEEEEIIIIOOOOOUUUUcCnN".toCharArray();
			
			for (int i = 0; i < comAcento.length; i++) {
				tema = tema.replace(comAcento[i], semAcento[i]);
			}
			
			tema = tema.replaceAll(" ", "");
		}
		
		return tema.toLowerCase();
	}
	
	/**
	 * Método responsável em formatar um texto de forma capitalizada. 
	 * @author: Felipe dos Santos Assis <felipe.assis@sigma.com.br>
	 * @since 05/05/2016
	 * @param str : String
	 * @return String
	 */
	public static String capitalizar(String str) {
		if (!isBlank(str)) {
			return WordUtils.capitalizeFully(str);
		}
		
		return "";
	}
}