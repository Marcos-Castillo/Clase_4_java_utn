package clase6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	Calculadora calc = new Calculadora();
	double resultado=0;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	
	}

	@Test
	final void testUno() {
		resultado = calc.multiplicar(80, 3); // 240
		assertEquals(240, resultado);
	}

	@Test
	final void testDos() {
		resultado=calc.dividir(calc.sumar(150,180), 3); // 110
		assertEquals(110, resultado);
	}

	@Test
	final void testTres() {
		resultado=calc.multiplicar(calc.restar(90,50),15);// !=605
		assertNotEquals(605,resultado);
	}

	@Test
	final void testCuatro() {
		resultado=calc.multiplicar(calc.sumar(70, 40),25);// !=2700
		assertNotEquals(2700,resultado);
	}

}
