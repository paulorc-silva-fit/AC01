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
public class DLinkedList {
	// Cria os objetos head e tail da classe DNode
	protected DNode head, tail;
	
	// Cria a variável size, que armazena a quantidade de nodos da lista
	protected long size;
	
	// Método construtor que cria uma lista vazia
	public DLinkedList() {
		size = 0;
		head = new DNode(null, null, null);
		tail = new DNode(null, head, null);
		head.setNext(tail);
	}
	
	// Método que converte a lista para String
	public String toString() {
		String s = "[";
		DNode v = head.getNext();
		
		while(v != tail) {
			s += v.getElement();
			v = v.getNext();
			if(v != tail) {
				s += ",";
			}
		}
		
		s += "]";		
		return s;
	}
	
	// Método que verifica se a lista está vazia
	private boolean isEmpty() {
		return (size == 0);
	}
	
	// Método que adiciona um elemento na cauda da LDE
	public void addLast(DNode v) {
		addBefore(tail, v);
	}
	
	// Método que retorna o último item da lista
	public DNode getLast() throws IllegalStateException {
		if(isEmpty()){
			throw new IllegalStateException("A lista está vazia");
		}
		return tail.getPrev();
	}

	// Método que retorna o valor anterior de um elemento da lista
	public DNode getPrev(DNode v) throws IllegalArgumentException {
		if(v == head) {
			throw new IllegalArgumentException("Não foi possível pegar o elemento anterior, pois o header é o primeiro elemento");
		}
		return v.getPrev();
	}
	
	// Método que retorna o próximo valor de um elemento da lista
	public DNode getNext(DNode v) {
		if(v == tail) {
			throw new IllegalArgumentException("Não foi possível pegar o próximo elemento, pois o trailer é o último elemento");
		}
		return v.getNext();
	}

	// Método que adiciona um elemento antes de outro
	public void addBefore(DNode v, DNode z) throws IllegalArgumentException {
		DNode u = getPrev(v);
		z.setPrev(u);
		z.setNext(v);
		v.setPrev(z);
		u.setNext(z);
		size += 1;
	}

	// Método que adiciona um elemento na cabeça da LDE
	public void addFirst(DNode v) {
		addAfter(head, v);
	}

	// Método que adiciona um elemento depois de outro
	public void addAfter(DNode v, DNode z) throws IllegalArgumentException {
		DNode w = getNext(v);
		z.setPrev(v);
		z.setNext(w);
		w.setPrev(z);
		v.setNext(z);
		size += 1;
	}
}