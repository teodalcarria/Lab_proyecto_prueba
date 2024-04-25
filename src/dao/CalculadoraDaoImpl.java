package dao;

public class CalculadoraDaoImpl implements CalculadoraDao{

	@Override
	public int sumar(int op1, int op2) {
		// TODO Auto-generated method stub
		return op1 + op2;
	}

	@Override
	public int restar(int op1, int op2) {
		// TODO Auto-generated method stub
		return op1 - op2;
	}

	@Override
	public int multiplicar(int op1, int op2) {
		// TODO Auto-generated method stub
		return op1 * op2;
	}

	@Override
	public int dividir(int op1, int op2) {
		// TODO Auto-generated method stub
		return op1 / op2;
	}

	@Override
	public int resto(int op1, int op2) {
		// TODO Auto-generated method stub
		return op1 % op2;
	}

}
