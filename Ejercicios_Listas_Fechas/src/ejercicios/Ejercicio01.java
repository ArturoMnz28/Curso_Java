package ejercicios;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		int resultado = suma(7,15);
		System.out.println(resultado);
		
	}
	
	public static int suma(int x, int y) {
		
		if(y > x) {
			return y + suma(x,y -1);
		}else {
			return x;
		}
	}

}
