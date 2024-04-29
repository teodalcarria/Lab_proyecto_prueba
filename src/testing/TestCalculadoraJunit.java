package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dao.CalculadoraDao;
import dao.CalculadoraDaoImpl;

class TestCalculadoraJunit {
	
	private CalculadoraDao cdao = new CalculadoraDaoImpl();

	@Test
	void sumar() {
		assertEquals(cdao.sumar(4, 6), 10);
		assertEquals(cdao.sumar(34, 0), 34);
		
	}
	
	@Test
	void restar() {
		assertEquals(cdao.restar(8, 2), 6);
		
	}

}
