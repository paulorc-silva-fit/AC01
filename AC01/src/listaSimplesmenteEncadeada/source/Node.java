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
public class Node {
	// Cria as variáveis element e next
	private String element;
	private Node next;
	
	// Cria um nodo com um dado elemento e a referência ao próximo nodo
	public Node(String nodo, Node prox) {
		element = nodo;
		next = prox;
	}
	
	// Métodos Getters
	// Retorna o elemento do nodo
	public String getElement() {
		return element;
	}
	
	// Retorna a referência ao próximo nodo
	public Node getNext() {
		return next;
	}
	
	// Métodos Setters
	// Define o elemento do nodo
	public void setElement(String newElement) {
		element = newElement;
	}
	
	// Define a referência ao próximo nodo
	public void setNext(Node newNext) {
		next = newNext;
	}
}
