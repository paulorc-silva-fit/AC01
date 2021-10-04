package arranjos.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import arranjos.source.Arranjo;

class ArranjoTest {
	Arranjo a = new Arranjo();
	
	@Test
	void menorTeste() {
		assertEquals(510, a.menor(), "O menor valor deve ser 510");
	}

	@Test
	void maiorTeste() {
		assertEquals(940, a.maior(), "O maior valor deve ser 940");
	}
	
	@Test
	void somaTeste() {
		assertEquals(7540, a.soma(), "A soma dos valores deve ser 7540");
	}

	@Test
	void repeticoesTeste() {
		assertEquals(0, a.repeticoes(3), "O número 3 aparece 0 vezes");
		assertEquals(1, a.repeticoes(650), "O número 650 aparece 1 vez");
		assertEquals(2, a.repeticoes(940), "O número 940 aparece 2 vezes");
	}
}