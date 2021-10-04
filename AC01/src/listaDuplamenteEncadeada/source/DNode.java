package listaDuplamenteEncadeada.source;

/**
 * @author Paulo Ricardo Costa da Silva - RA: 1905013 
 * @author Geovane Donizete Laera  - RA: 1902679 
 * @author Marcelo Martinez Mesa Campos - RA: 1905076 
 * @author Isaque Ribeiro dos Santos Junior - RA: 1903978
 * @author Vinícius da Cruz Pera - RA: 1903144
 * Data: 01/09/2021
 *
 */
public class DNode {
	// Cria as variáveis element, next e prev
	protected String element;
	private DNode prev, next;
	
	// Cria um nodo com um dado elemento e a referência ao nodo anterior e ao próximo nodo
	public DNode(String e, DNode p, DNode n) {
		element = e;
		prev = p;
		next = n;	
	}

	// Métodos Getters
	// Retorna o elemento do nodo
	public String getElement() {
		return element;
	}
	
	// Retorna a referência ao nodo anterior
	public DNode getPrev() {
		return prev;
	}
	
	// Retorna a referência ao próximo nodo
	public DNode getNext() {
		return next;
	}
	
	// Métodos Setters
	// Define o elemento do nodo
	public void setElement(String newElement) {
		element = newElement;
	}
	
	// Define a referência ao nodo anterior
	public void setPrev(DNode newPrev) {
		prev = newPrev;
	}
	
	// Define a referência ao próximo nodo
	public void setNext(DNode newNext) {
		next = newNext;
	}
}
