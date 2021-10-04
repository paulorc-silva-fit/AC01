package arranjos.source;

/**
 * @author Paulo Ricardo Costa da Silva - RA: 1905013 
 * @author Geovane Donizete Laera  - RA: 1902679 
 * @author Marcelo Martinez Mesa Campos - RA: 1905076 
 * @author Isaque Ribeiro dos Santos Junior - RA: 1903978
 * @author Vinícius da Cruz Pera - RA: 1903144
 * Data: 25/08/2021
 *
 */
public class Arranjo {
	// Cria um arranjo de números inteiros
	Integer[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
	
	public Integer menor() {
		// Cria a variável min e atribui o valor do índice 0 do arranjo a ela 
		int min = a[0];
		
		// Para cada item do arranjo, é verificado se seu valor é menor do que o menor valor 
		for (int value: a) {
			if (value < min) {
				min = value;
			}
		}
		
		// Exibe o menor valor e o retorna como valor da função
		System.out.println(min);
		return min;
	}

	public Integer maior() {
		// Cria a variável max e atribui o valor do índice 0 do arranjo a ela
		int max = a[0];
		
		// Para cada item do arranjo, é verificado se seu valor é maior do que o maior valor 
		for (int value: a) {
			if (value > max) {
				max = value;
			}
		}
		
		// Exibe o maior valor e o retorna como valor da função
		System.out.println(max);
		return max;
	}

	public Integer soma() {
		// Cria a variável sum e atribui o valor 0 a ela
		int sum = 0;
		
		// Para cada item do arranjo, é incrementado seu valor na variável sum 
		for (int value: a) {
			sum += value;
		}
		
		// Exibe a soma de todos valores e a retorna como valor da função
		System.out.println(sum);
		return sum;
	}

	public Integer repeticoes(int i) {
		// Cria a variável count e atribui o valor 0 a ela
		int count = 0;
		
		// Para cada item do arranjo, é verificado se seu valor é igual ao valor passado como parâmetro e se for, é incrementado 1 na variável count
		for (int value: a) {
			if (value == i) {
				count += 1;
			}
		}
		
		// Exibe a quantidade de vezes que um item está presente no arranjo e a retorna como valor da função
		System.out.println(count);
		return count;
	}

}
