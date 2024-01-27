package git_eclipse_package;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

class E18_EligePrimeroTest {

	String[] nombres = { "Mar", "Isabel", "Ivan", "Pol", "Eva", "Ruth" };
	int numeroEntrado = 0;

	@Test
	public void TestCase01() {
		Exception exception = assertThrows(Exception.class, () -> {
			E18_EligePrimero.ordenarNombres(nombres, -30);
		});

		String expectedMessage = "Error.";
		String actualMessage = exception.getMessage();

		assertTrue(actualMessage.contains(expectedMessage));
	}
	@Test
	public void TestCase02() {
		Exception exception = assertThrows(Exception.class, () -> {
			E18_EligePrimero.ordenarNombres(nombres, 0);
		});

		String expectedMessage = "Error.";
		String actualMessage = exception.getMessage();

		assertTrue(actualMessage.contains(expectedMessage));
	}	
	@Test
	public void TestCase03() throws Exception {
		assertEquals(nombres, E18_EligePrimero.ordenarNombres(nombres, 1));
	}
	@Test
	public void TestCase04() throws Exception {
		assertEquals(nombres, E18_EligePrimero.ordenarNombres(nombres, 3));
	}
	@Test
	public void TestCase05() throws Exception {
		assertEquals(nombres, E18_EligePrimero.ordenarNombres(nombres, 6));
	}
	@Test
	public void TestCase06() {
		Exception exception = assertThrows(Exception.class, () -> {
			E18_EligePrimero.ordenarNombres(nombres, 7);
		});

		String expectedMessage = "Error.";
		String actualMessage = exception.getMessage();

		assertTrue(actualMessage.contains(expectedMessage));
	}
	@Test
	public void TestCase07() {
		Exception exception = assertThrows(Exception.class, () -> {
			E18_EligePrimero.ordenarNombres(nombres, 50);
		});

		String expectedMessage = "Error.";
		String actualMessage = exception.getMessage();

		assertTrue(actualMessage.contains(expectedMessage));
	}
}