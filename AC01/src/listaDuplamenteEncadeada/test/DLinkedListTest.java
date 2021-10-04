package listaDuplamenteEncadeada.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import listaDuplamenteEncadeada.source.DLinkedList;
import listaDuplamenteEncadeada.source.DNode;

class DLinkedListTest {
	@Test
	void DNodeTeste() {
		DNode z, v;
		DLinkedList lde = new DLinkedList();
		
		assertEquals("[]", lde.toString(), "[]");
		
		z = new DNode("BWI", null, null);
		lde.addLast(z);
		assertEquals("[BWI]", lde.toString(), "[BWI]");

		z = new DNode("SFO", null, null);
		lde.addLast(z);
		assertEquals("[BWI,SFO]", lde.toString(), "[BWI,SFO]");

		z = new DNode("JFK", null, null);
		lde.addFirst(z);
		assertEquals("[JFK,BWI,SFO]", lde.toString(), "[JFK,BWI,SFO]");

		v = lde.getLast();
		assertEquals("SFO", v.getElement(), "SFO");

		z = new DNode("PVD", null, null);
		lde.addBefore(v, z);
		assertEquals("[JFK,BWI,PVD,SFO]", lde.toString(), "[JFK,BWI,PVD,SFO]");	
	}
}
