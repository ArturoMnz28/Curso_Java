/**
 * 
 */
package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author amunoz
 *
 */
class CalculadoraTest {
	
	Operaciones o;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		o = new Operaciones();
	}
	
	@Test
	void testSuma() {
		float resultado = o.sumar(1,1);
		assertEquals(2,resultado);
	}
	
	@Test
	void testResta() {
		float resultado = o.restar(5,3);
		assertEquals(2,resultado);
	}
	
	@Test
	void testMultiplicar() {
		float resultado = o.multiplicar(2,5);
		assertEquals(10,resultado);
	}
	
	@Test
	void testDivision() {
		//float resultado = o.dividir(10,2);
		//assertEquals(5,resultado);
		assertThrows(ArithmeticException.class,() -> { o.dividir(6,0); });
	}

}
