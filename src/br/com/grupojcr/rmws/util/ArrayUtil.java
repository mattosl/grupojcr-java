package br.com.grupojcr.rmws.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ArrayUtil {

	public ArrayUtil(){};
	
	/** Converte Array de String para um Array de Integer
	 * @author Juliano Jose da Silva
	 * */
	public static Integer[] toIntegerArray(String[] array) throws Exception {

		Integer[] retorno = null;

		if (array != null) {  
			retorno = new Integer[array.length];

			for (int i = 0; i < array.length; i++) {  
				try {
					retorno[i] = Integer.parseInt(array[i]);
				} catch(NumberFormatException e) {
					throw new Exception(e);
				}
			}
		} else {
			retorno = new Integer[0];
		}

		return retorno;
	}
	
	/** Converte Array de String para um Array de Long
	 * @author Juliano Jose da Silva
	 * */
	public static Long[] toLongArray(String[] array) throws Exception {

		Long[] retorno = null;

		if (array != null) {  
			retorno = new Long[array.length];

			for (int i = 0; i < array.length; i++) {  
				try {
					retorno[i] = Long.parseLong(array[i]);
				} catch(NumberFormatException e) {
					throw new Exception(e);
				}
			}
		} else {
			retorno = new Long[0];
		}

		return retorno;
	}
	
	/**Converte dois Arrays de String para um Array de Integer
	 * @author Juliano Jose da Silva
	 * */
	public static Integer[] toIntegerCombinedArray(String[] array1, String[] array2) throws Exception {

		Integer[] retorno = null;

		if (array1 != null) {  
			retorno = new Integer[array1.length];

			for (int i = 0; i < array1.length; i++) {  
				try {
					retorno[i] = Integer.parseInt(array1[i]);
				} catch(NumberFormatException e) {
					throw new Exception(e);
				}
			}
		} else {
			retorno = new Integer[0];
		}

		if (array2 != null) {  
			Integer[] temp = retorno;
			retorno = new Integer[retorno.length + array2.length];

			for (int i = temp.length; i < array2.length; i++) {  
				try {
					retorno[i] = Integer.parseInt(array2[i]);
				} catch(NumberFormatException e) {
					throw new Exception("erro.9", e);
				}
			}
		}

		return retorno;
	}
	
	/**Converte dois Arrays de String para um Array de Integer
	 * @author Juliano Jose da Silva
	 * */
	public static String[] toStringCombinedArray(String[] array1, String[] array2) throws Exception {

		List<String> list = new ArrayList<String>();

		if (array1 != null) {  
			list.addAll(ArrayUtil.toStringList(array1));
		}

		if (array2 != null) {
			list.addAll(ArrayUtil.toStringList(array2));
		}

		 String[] array = new String[list.size()];
		 
		 array = list.toArray(array);
		 
		 return array;
	}

	/** Converte Array de Integer para um Array de String
	 * @author Rodrigo Quartieri Fernandes
	 * */
	public static String[] stringConversion(Integer[] array) throws Exception {

		String[] retorno = null;

		if (array != null) {  
			retorno = new String[array.length];

			for (int i = 0; i < array.length; i++) {  
				try {
					retorno[i] = array[i].toString();
				} catch(NumberFormatException e) {
					throw new Exception(e);
				}
			}
		} else {
			retorno = new String[0];
		}

		return retorno;
	}
	
	/** Converte Array de String para um Set de Integer
	 * @author Juliano Jose da Silva
	 * */
	public static Set<Integer> toIntegerSet(String[] array) throws Exception {

		Set<Integer> retorno = null;

		if (array != null) {  
			retorno = new HashSet<Integer>(array.length);

			for (int i = 0; i < array.length; i++) {  
				try {
					
					if (array[i] != null && !array[i].isEmpty()) {
						retorno.add(Integer.parseInt(array[i]));
					}
					
				} catch(NumberFormatException e) {
					throw new Exception(e);
				}
			}
		} else {
			retorno = new HashSet<Integer>(0);
		}

		return retorno;
	}
	
	/** Converte Array de String para um List de Integer
	 * @author Juliano Jose da Silva
	 * */
	public static List<Integer> toIntegerList(String[] array) throws Exception {

		List<Integer> retorno = null;

		if (array != null) {  
			retorno = new ArrayList<Integer>(array.length);

			for (int i = 0; i < array.length; i++) {  
				try {
					
					if (array[i] != null && !array[i].isEmpty()) {
						retorno.add(Integer.parseInt(array[i]));
					}
					
				} catch(NumberFormatException e) {
					throw new Exception(e);
				}
			}
		} else {
			retorno = new ArrayList<Integer>(0);
		}

		return retorno;
	}
	
	/** Converte Array de String para um List de Integer
	 * @author Juliano Jose da Silva
	 * */
	public static List<Long> toLongList(String[] array) throws Exception {

		List<Long> retorno = null;

		if (array != null) {  
			retorno = new ArrayList<Long>(array.length);

			for (int i = 0; i < array.length; i++) {  
				try {
					retorno.add(Long.parseLong(array[i]));
					
				} catch(NumberFormatException e) {
					throw new Exception(e);
				}
			}
		} else {
			retorno = new ArrayList<Long>(0);
		}

		return retorno;
	}
	
	/** Converte Array de String para um List de String
	 * @author Juliano Jose da Silva
	 * */
	public static List<String> toStringList(String[] array) throws Exception {

		List<String> retorno = null;

		if (array != null) {  
			retorno = new ArrayList<String>(array.length);

			for (int i = 0; i < array.length; i++) {  
				try {
					retorno.add(array[i]);
					
				} catch(NumberFormatException e) {
					throw new Exception(e);
				}
			}
		} else {
			retorno = new ArrayList<String>(0);
		}

		return retorno;
	}
	
	/** Converte Array de String para um Set de String
	 * @author Juliano Jose da Silva
	 * */
	public static Set<String> toStringSet(String[] array) throws Exception {

		Set<String> retorno = null;

		if (array != null) {  
			retorno = new HashSet<String>(array.length);

			for (int i = 0; i < array.length; i++) {  
				try {
					
					if (array[i] != null && !array[i].isEmpty()) {
						retorno.add(array[i]);
					}
					
				} catch(NumberFormatException e) {
					throw new Exception(e);
				}
			}
		} else {
			retorno = new HashSet<String>(0);
		}

		return retorno;
	}
	
	/** Converte List de String para um Array de String
	 * @author Juliano Jose da Silva
	 * */
	public static String[] toStringArray(List<String> list) throws Exception {

		String[] retorno = null;

		if (list != null && list.size() > 0) {  
			retorno = new String[list.size()];

			for (int i = 0; i < list.size(); i++) {  
				retorno[i] = (list.get(i));
			}
		} else {
			retorno = new String[0];
		}

		return retorno;
	}
	
	/** Converte um array de String para uma String
     * @author Juliano Jose da Silva
     * */
    public static String toString(String[] array, String separador) throws Exception {

        StringBuilder retorno = new StringBuilder();

        if (array != null && array.length > 0) {  
            for (int i = 0; i < array.length; i++) { 
                retorno.append(array[i]);
                
                if(i < array.length - 1) {
                	retorno.append(separador);
                }
            }
        }

        return retorno.toString();
    }
    
    /** Converte um array de Object para uma String
     * @author Juliano Jose da Silva
     * */
    public static String toString(Object[] array, String separador) throws Exception {

        StringBuilder retorno = new StringBuilder();

        if (array != null && array.length > 0) {  
            for (int i = 0; i < array.length; i++) { 
                retorno.append(array[i].toString());
                
                if(i < array.length - 1) {
                	retorno.append(separador);
                }
            }
        }

        return retorno.toString();
    }
    
    /** Converte um array de Integer para uma String
     * @author Juliano Jose da Silva
     * */
    public static String toString(Integer[] array, String separador) throws Exception {

        StringBuilder retorno = new StringBuilder();

        if (array != null && array.length > 0) {  
            for (int i = 0; i < array.length; i++) { 
                retorno.append(array[i]);
                
                if(i < array.length - 1) {
                	retorno.append(separador);
                }
            }
        }

        return retorno.toString();
    }
    
    /** Converte um List de String/Integer para uma String
     * @author Juliano Jose da Silva
     * */
    public static <T> String toString(List<T> lista, String separador) throws Exception {

        StringBuilder retorno = new StringBuilder();

        if (lista != null && lista.size() > 0) {  
            for (int i = 0; i < lista.size(); i++) { 
                retorno.append(lista.get(i).toString());
                
                if(i < lista.size() - 1) {
                	retorno.append(separador);
                }
            }
        }

        return retorno.toString();
    }
    
	/** Retorna os valores de cada coluna de cada Object[] da lista passada como paramentro.
	 * @param list: lista de Object[] do qual serao extraidos os valores.
	 * @param index: indice da coluna do Object[] do qual sera extraido o valor.
	 * @author Juliano Jose da Silva
	 * */
	public static List<Object> getAllColumns(List<Object[]> list, int index) throws Exception {

		List<Object> retorno = null;

		if (list != null && list.size() > 0) {  
			retorno = new ArrayList<Object>(list.size());

			for (Object[] obj : list) {  
				retorno.add(obj[index]);
			}
			
		} else {
			retorno = new ArrayList<Object>(0);
		}

		return retorno;
	}
	
	/** Retorna os valores de cada coluna de cada Object[] da lista passada como paramentro.
	 * @param list: lista de Object[] do qual serao extraidos os valores.
	 * @param index: indice da coluna do Object[] do qual sera extraido o valor.
	 * @param type: tipo de objeto do qual o valor extraido sera convertido.
	 * @author Juliano Jose da Silva
	 * */
	public static List<Object> getAllColumns(List<Object[]> list, int index, Class<?> type) throws Exception {

		List<Object> retorno = null;

		if (list != null && list.size() > 0) {  
			retorno = new ArrayList<Object>(list.size());

			for (Object[] obj : list) {  
				retorno.add(obj[index]);
			}
			
		} else {
			retorno = new ArrayList<Object>(0);
		}

		return retorno;
	}
}
