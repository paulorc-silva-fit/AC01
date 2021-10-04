package listaSimplesmenteEncadeada.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import listaSimplesmenteEncadeada.source.EmptySLinkedList;
import listaSimplesmenteEncadeada.source.SLinkedList;

class SLinkedListTest {
	SLinkedList lse = new SLinkedList();
	
	@Test
	void addHeadTeste() {
		assertEquals("[]", lse.toString(), "Deve imprimir []");

		lse.addHead("BOS");
		assertEquals("[BOS]", lse.toString(), "Deve imprimir [BOS]");

		lse.addHead("ATL");
		assertEquals("[ATL, BOS]", lse.toString(), "Deve imprimir [ATL, BOS]");

		lse.addHead("MSP");
		assertEquals("[MSP, ATL, BOS]", lse.toString(), "Deve imprimir [MSP, ATL, BOS]");

		lse.addHead("LAX");
		assertEquals("[LAX, MSP, ATL, BOS]", lse.toString(), "Deve imprimir [LAX, MSP, ATL, BOS]");
	}
	
	@Test
	void addTailTeste() {
		assertEquals("[]", lse.toString(), "Deve imprimir []");

		lse.addTail("MSP");
		assertEquals("[MSP]", lse.toString(), "Deve imprimir [MSP]");

		lse.addTail("ATL");
		assertEquals("[MSP, ATL]", lse.toString(), "Deve imprimir [MSP, ATL]");

		lse.addTail("BOS");
		assertEquals("[MSP, ATL, BOS]", lse.toString(), "Deve imprimir [MSP, ATL, BOS]");

		lse.addTail("MIA");
		assertEquals("[MSP, ATL, BOS, MIA]", lse.toString(), "Deve imprimir [MSP, ATL, BOS, MIA]");
	}
	
	@Test
	void removeHeadTeste() {
		assertEquals("[]", lse.toString(), "Deve imprimir []");

		lse.addTail("MSP");
		assertEquals("[MSP]", lse.toString(), "Deve imprimir [MSP]");

		lse.addTail("BOS");
		assertEquals("[MSP, BOS]", lse.toString(), "Deve imprimir [MSP, BOS]");

		lse.removeHead();
		assertEquals("[BOS]", lse.toString(), "Deve imprimir [BOS]");

		lse.removeHead();
		assertEquals("[]", lse.toString(), "Deve imprimir []");

		assertThrows(EmptySLinkedList.class, () -> { lse.removeHead(); });
	}
}