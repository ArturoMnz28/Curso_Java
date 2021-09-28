package calculadora;

public class Operaciones implements InterfazOperaciones {
	
	InterfazOperaciones suma = (n,m) -> n+m;
	InterfazOperaciones resta = (n,m) -> n-m;
	InterfazOperaciones multiplicacion = (n,m) -> n*m;
	InterfazOperaciones division = (n,m) -> n/m;
	
	public float sumar(float num1, float num2) {
		return suma.obtenerNumeros(num1, num2);
	}
	
	public float restar(float num1, float num2) {
		return resta.obtenerNumeros(num1, num2);
	}
	
	public float multiplicar(float num1, float num2) {
		return multiplicacion.obtenerNumeros(num1, num2);
	}
	
	public float dividir(float num1, float num2) {
		
		if(num2 == 0) {
			throw new ArithmeticException();
		}else {
			return division.obtenerNumeros(num1, num2);
		}
			
		
	}
	
	@Override
	public float obtenerNumeros(float a, float b) {
		return 0;
	}
	
	
}
