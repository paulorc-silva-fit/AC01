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
public class SLinkedList {
	// Cria os objetos head e tail da classe Node, respectivamente
	protected Node head;
	protected Node tail;
	
	// Cria a variável size, que armazena a quantidade de nodos da lista
	protected long size;
	
	// Método construtor que cria uma lista vazia
	public SLinkedList() {
		head = tail = null;
		size = 0;
	}
	
	// Método que converte a lista para String
	public String toString() {
		String s;
		Node p = head;
		
		s = "[";
		
		while(p != null) {
			s += p.getElement();
			s += ", ";
			p = p.getNext();
		}
		
		if(s.length() > 1) {
			s = s.substring(0, s.length() - 2);
		}
		
		return s + "]";
	}

	// Método que adiciona um elemento na cabeça da LSE
	public void addHead(String element) {
		Node v = new Node(element, null);
		
		if(size == 0) {
			head = tail = v;
		}
		else {	
			v.setNext(head);
			head = v;
		}

		size += 1;
	}

	// Método que adiciona um elemento na cauda da LSE
	public void addTail(String element) {
		Node v = new Node(element, null);
		
		if(size == 0) {
			head = tail = v;
		}
		else {
			v.setNext(null);
			tail.setNext(v);
			tail = v;
		}	
		
		size += 1;
	}

	// Método que remove um elemento na cabeça da LSE
	public void removeHead() {
		if(head == null) {
			throw new EmptySLinkedList("Simply Linked List is empty.");
		}

		Node t;
		t = head;
		head = head.getNext();
		t.setNext(null);
		size -= 1;
	}
}