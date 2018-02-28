package br.com.grupojcr.rmws.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TreatCollection {

	/**
	 * Ordena uma lista pelo campo selecionado. <br/>
	 * Ex: minhaListaOrdenada = ordenaAscendente(minhaLista, "nome"); <br/>
	 * Ex2: minhaListaOrdenada = ordenaAscendente(minhaLista, "tipo.subTipo.descricao"); <br/>
	 * @since 24/10/2014
	 * @author Marcelo R. Vellame <marcelo.rochetto@sigma.com.br>
	 * @param lista - lista a ser ordenada
	 * @param campo - nome do campo pelo qual sera ordanado
	 * @return
	 */
	public static <T> List<T> ordenaAscendente(List<T> lista, final String campo) {

		validaPrecondicoes(lista, campo);

		lista = new ArrayList<T>(lista);
		Collections.sort(lista, new Comparator<T>() {

			public int compare(T o1, T o2) {
				Object campoNoO1 = null;
				Object campoNoO2 = null;
				if (o1 != null) {
					campoNoO1 = chamaGetter(o1, campo);
				}
				if (o2 != null) {
					campoNoO2 = chamaGetter(o2, campo);
				}
				return comparaAscendente(campoNoO1, campoNoO2);
			}

			@SuppressWarnings({ "unchecked", "rawtypes" })
			private int comparaAscendente(Object campoNoO1, Object campoNoO2) {
				if (campoNoO1 == null && campoNoO2 == null) {
					return 0;
				}
				if (campoNoO1 != null && campoNoO2 == null) {
					return 1;
				}
				if (campoNoO2 != null && campoNoO1 == null) {
					return -1;
				}
				if (campoNoO1 instanceof Comparable<?>) {
					return ((Comparable) campoNoO1).compareTo(campoNoO2);
				} else {
					new IllegalArgumentException("Não é possível ordenar por um: " + campoNoO1.getClass());
				}
				return 0;
			}
		});

		return lista;
	}

	/**
	 * Ordena uma lista pelo campo selecionado. <br/>
	 * Ex: minhaListaOrdenada = ordenaAscendente(minhaLista, "nome"); <br/>
	 * Ex2: minhaListaOrdenada = ordenaAscendente(minhaLista, "tipo.subTipo.descricao"); <br/>
	 * @since 24/10/2014
	 * @author Marcelo R. Vellame <marcelo.rochetto@sigma.com.br>
	 * @param lista - lista a ser ordenada
	 * @param campo - nome do campo pelo qual sera ordanado
	 * @return
	 */
	public static <T> List<T> ordenaDescendente(List<T> lista, final String campo) {

		validaPrecondicoes(lista, campo);

		lista = new ArrayList<T>(lista);
		Collections.sort(lista, new Comparator<T>() {

			public int compare(T o1, T o2) {
				Object campoNoO1 = null;
				Object campoNoO2 = null;
				if (o1 != null) {
					campoNoO1 = chamaGetter(o1, campo);
				}
				if (o2 != null) {
					campoNoO2 = chamaGetter(o2, campo);
				}
				return comparaDescendente(campoNoO1, campoNoO2);
			}

			@SuppressWarnings({ "unchecked", "rawtypes" })
			private int comparaDescendente(Object campoNoO1, Object campoNoO2) {
				if (campoNoO1 == null && campoNoO2 == null) {
					return 0;
				}
				if (campoNoO1 != null && campoNoO2 == null) {
					return -1;
				}
				if (campoNoO2 != null && campoNoO1 == null) {
					return 1;
				}
				if (campoNoO1 instanceof Comparable<?>) {
					return ((Comparable) campoNoO2).compareTo(campoNoO1);
				} else {
					new IllegalArgumentException("Não é possível ordenar por um: " + campoNoO1.getClass());
				}
				return 0;
			}
		});

		return lista;
	}

	/**
	 * Chama recursivamente at� chegar no campo desejado. Se algo estiver nulo no caminho retorna null. 
	 * @since 24/10/2014
	 * @author Marcelo R. Vellame <marcelo.rochetto@sigma.com.br>
	 * @param o - Objeto com o campo
	 * @param campo - nome do campo
	 * @return
	 */
	private static Object chamaGetter(Object o, String campo) {

		if (o == null) {
			return null;
		}

		if (campo.contains(".")) {
			String nomeProximoObjeto = pegaNomeDoProximoObjeto(campo);
			String nomeObjetoSeguinte = pegaNomeDoObjetoSeguinte(campo);
			Object proximoObjeto = chamaGetter(o, nomeProximoObjeto);
			return chamaGetter(proximoObjeto, nomeObjetoSeguinte);
		}

		String nomeDoGetter = "get" + primeiraLetraMaiuscula(campo);

		try {
			Method method = o.getClass().getMethod(nomeDoGetter, new Class<?>[0]);
			return method.invoke(o, new Object[0]);
		} catch (SecurityException e) {
			throw new RuntimeException(e);
		} catch (NoSuchMethodException e) {
			throw new IllegalArgumentException("Não existe um método: " + nomeDoGetter + "() na classe: " + o.getClass().getName());
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Não existe um método: " + nomeDoGetter + "() na classe: " + o.getClass().getName());
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			throw new RuntimeException(e);
		}
	}

	private static String pegaNomeDoObjetoSeguinte(String campo) {
		return campo.substring(campo.indexOf(".") + 1, campo.length());
	}

	private static String pegaNomeDoProximoObjeto(String campo) {
		return campo.substring(0, campo.indexOf("."));
	}

	private static String primeiraLetraMaiuscula(String campo) {
		StringBuilder sb = new StringBuilder();
		sb.append(campo.substring(0, 1).toUpperCase());
		sb.append(campo.substring(1));
		return sb.toString();
	}

	private static <T> void validaPrecondicoes(List<T> lista, String campo) {
		if (lista == null) {
			new IllegalArgumentException("Não é possível ordenar uma lista nula");
		}
		if (campo == null || campo.trim().isEmpty()) {
			new IllegalArgumentException("O campo pelo qual a lista será ordenada deve ser informado");
		}
	}
}
