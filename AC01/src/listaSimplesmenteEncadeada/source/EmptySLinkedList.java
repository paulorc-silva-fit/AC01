package listaSimplesmenteEncadeada.source;

/**
 * @author Paulo Ricardo Costa da Silva - RA: 1905013 
 * @author Geovane Donizete Laera  - RA: 1902679 
 * @author Marcelo Martinez Mesa Campos - RA: 1905076 
 * @author Isaque Ribeiro dos Santos Junior - RA: 1903978
 * @author Vinícius da Cruz Pera - RA: 1903144
 * Data: 25/08/2021
 *
 */
@SuppressWarnings("serial")
public class EmptySLinkedList extends RuntimeException {
	// Método que retorna erro caso a lista esteja vazia
	public EmptySLinkedList(String error) {
		super(error);
	}
}
