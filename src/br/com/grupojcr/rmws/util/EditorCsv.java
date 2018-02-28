package br.com.grupojcr.rmws.util;

import java.io.UnsupportedEncodingException;

public class EditorCsv {

	private StringBuilder texto;

	private String separador = System.getProperty("line.separator");
	
	private String preencherCom = " ";

	private boolean esquerda = false;
	
	private String charset = "UTF-8";
	
	private String separadorValor;

	private EditorCsv() {
		texto = new StringBuilder();
	}

	public static EditorCsv novo() {
		return new EditorCsv();
	}
	
	public static EditorCsv novoEditorDepesa() {
		EditorCsv csv = new EditorCsv().usarSeparadorValoresPontoVirgula().usarCharsetIso88591();
		//LEGENDA PADRÃO
		 csv.add("0").add("Legenda: Tipo de Registro (1ª Coluna)").add(" 0 = Legenda")
		.novaLinha()
		.add("0").add("1 = Parâmetros de pesquisa informados:")
		.novaLinha()
		.add("0").add("2 = Cabeçalho das Colunas")
		.novaLinha()
		.add("0").add("3 = Conteúdo das Colunas")
		.novaLinha()
		.add("0").add("9 = Dados sobre a Geração");
		return csv;
	}

	public EditorCsv usarCharsetIso88591() {
		this.charset = "ISO-8859-1";
		return this;
	}
	
	public EditorCsv usarSeparadorValoresPontoVirgula(){
		this.separadorValor = ";";
		return this;
	}
	
	public EditorCsv add(Object i) {
		String valor = valor(i);
		texto.append(valor);
		if (TreatString.isNotBlank(separadorValor)) {
			texto.append(separadorValor);
		}
		return this;
	}

	public EditorCsv preencherComZero() {
		preencherCom = "0";
		esquerda = true;
		return this;
	}
	
	public EditorCsv preencherComVazio() {
		preencherCom = " ";
		esquerda = false;
		return this;
	}
	
	public EditorCsv add(Object i, int tamanho) {
		String valor = valor(i);
		if (valor.length() > tamanho) {
			valor = TreatString.subString(valor, tamanho);
		} else {
			if (esquerda) {
				valor = TreatString.completeToLeft(valor, tamanho, preencherCom);
			} else {
				valor = TreatString.completeToLeft(valor, tamanho, preencherCom);
			}
		}
		this.add(valor);
		return this;
	}

	private String valor(Object i) {
		if (i == null || TreatString.isBlank(i.toString())) {
			return "";
		}
		return i.toString();
	}

	public EditorCsv branco(int branco) {
		for (int i = 0; i < branco; i++) {
			texto.append(" ");
		}
		return this;
	}

	public EditorCsv branco(int... brancos) {
		for (int i : brancos) {
			branco(i);
		}
		return this;
	}

	public EditorCsv novaLinha() {
		texto.append(separador);
		return this;
	}

	public EditorCsv removerAcentos() {
		texto = new StringBuilder(TreatString.removerAcentos(texto.toString()));
		return this;
	}

	public EditorCsv todasMaiusculas() {
		texto = new StringBuilder(texto.toString().toUpperCase());
		return this;
	}

	public byte[] toBytes() {
		try {
			return texto.toString().getBytes(charset);
		} catch (UnsupportedEncodingException e) {
			throw new IllegalStateException("Falha obter bytes StringBuilder");
		}
	}

	public boolean isNotEmpty() {
		return texto.length() > 0;
	}
	

	

}
