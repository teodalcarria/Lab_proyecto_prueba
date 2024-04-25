package testing;

import dao.CalculadoraDao;
import dao.CalculadoraDaoImpl;

public class TestCalculadora {
	
	public static void main(String[] args) {
		CalculadoraDao cdao = new CalculadoraDaoImpl();
		
		System.out.println(cdao.sumar(17, 8));
		System.out.println(cdao.restar(17, 8));
		System.out.println(cdao.multiplicar(17, 8));
		System.out.println(cdao.dividir(17, 8));
		System.out.println(cdao.resto(17, 8));
		
		
	}

}
