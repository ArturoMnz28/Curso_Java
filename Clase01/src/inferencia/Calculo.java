package inferencia;

public class Calculo {

	public static void main(String[] args) {
		//var no se ocupa como una variable global, si no más bien como una variable local dentro de un método
		var dato = "Hola" ;
		System.out.println(dato);
		
		var num1=23.4;
		var num2=4;
		var suma = num1+num2;
		System.out.println(suma+". El tipo de dato es:"+((Object)suma).getClass().getSimpleName());
		
		var dato2= "2";
		var dato3=3;
		System.out.println(dato2+dato3);
		
		//Calcular las operaciones básicas utilizando var, mostrar tipo de dato del var
		var resta = num1 - num2;
		System.out.println(resta);
		
		var mult = num1*num2;
		System.out.println(mult);
		
		var div = num1/num2;
		System.out.println(div);

	}

}
