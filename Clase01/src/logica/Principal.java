package logica;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Hola mundo");
		//Declaración y asignación de variables
			//Variable de tipo clase
		String saludo = "Hola curso Java";
		String espacio = " ";
		int numero1 =12;
		double numero3=23.45454545;
		
		System.out.println(saludo);
		System.out.println(numero1);
		System.out.println(numero3);
		//Concatenar datos
		System.out.println(saludo+" "+numero1);
		System.out.println(saludo+espacio+numero1);
		System.out.println(numero3+numero1);
		System.out.println(saludo+numero3+numero1);
		System.out.println(saludo+(numero3+numero1));
		
		
		//Operaciones básicas +,-,*,/
		int num1=2;
		int num2=5;
		
		int suma;
		suma = num1+num2;
		
		System.out.println("Suma");
		System.out.println(suma);
		//Actividad 1
		//Resta
		int resta;
		resta = num1 - num2;
		System.out.println("Resta");
		System.out.println(resta);
		
		//Multiplicación
		int multi;
		multi = num1 * num2;
		System.out.println("Multiplicación");
		System.out.println(multi);
		
		//División
		double division;
		division = num2/num1;
		System.out.println("División");
		System.out.println(division);
		
		char letra='e';
		System.out.println(letra);
		//Actividad 2 concatenar nombre
		//Almacenamiento de un carácter a través de código ASCII
		char letra1 = 'A';//Habría que mirar el número correspondiente
		char letra2 = 'r';
		char letra3 = 't';
		char letra4 = 'u';
		char letra5 = 'o';
		System.out.println(""+letra1+letra2+letra3+letra4+letra2+letra5);
		
		//Actividad 3 suma,resta,multiplicación,división
		float numero5 = 2;
		float numero6 = 5;
		
		//Suma
		float sum;
		sum = numero5 + numero6;
		System.out.println("Suma"+sum);
		
		float rest;
		rest = numero5 + numero6;
		System.out.println("Resta"+rest);
		
		float mult;
		mult = numero5 * numero6;
		System.out.println("Multiplicación: "+mult);
		
		float division2;
		division2 = numero5 / numero6;
		System.out.println("División: "+division2);
		
		
		//Actividad calcular el modulo de su dia de nacimiento entre 2
		int dia = 28;
		int num = 2;
		System.out.println(dia%num);
		

	}

}
