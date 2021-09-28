package calculadora;

import java.util.Scanner;

public class Principal {
	
	
	static Scanner scan = new Scanner(System.in);
	static String opcionString, numeroOpString;
	static int opcion;
	static float resultadoFinal, numeroOpFloat;
	static Operaciones o = new Operaciones();
	
	
	public static void main(String[] args) {
		
		pintarMenu();

	}
	
	/*Pintamos el menú para seleccionar la opcion, se repite si se usa una opción no valida, si escribes el número 5 termina el programa*/
	public static void pintarMenu() {		
		do {
		System.out.println("==========MENÚ=========="
				+ "\n1- Suma"
				+ "\n2- Resta"
				+ "\n3- Multiplicación"
				+ "\n4- División"
				+ "\n5- Salir");
		opcionString = scan.nextLine();
		opcion = Integer.parseInt(opcionString);
		
		opcionMenu(opcion);
		}while((opcion != 5) || (opcion > 5));
		
	}/*Fin pintar menu*/
	
	
	/*Gestiono todas las opciones del menú con un switch */
	public static void opcionMenu(int opcion) {
		switch (opcion) {
		case 1:
			sumar();
			preguntarNuevaOperacion();
			break;
		case 2: 
			restar();
			preguntarNuevaOperacion();
			break;
		case 3: 
			multiplicar();
			preguntarNuevaOperacion();
			break;
		case 4: 
			dividir();
			preguntarNuevaOperacion();
			break;

		}
	}/*fin opcionMenu*/
	
	/*Control continuar programar o parar*/
	public static void preguntarNuevaOperacion() {
		System.out.println("¿Desea hacer otra operación?(s/n):");
		opcionString = scan.nextLine();
		if(opcionString.toLowerCase().equals("s")) {
			pintarMenu();
		}else {
			pintarResultado();
			System.exit(0);
		}
	}/*fin preguntarNuevaOperacion*/
	
	
	public static void pintarResultado() {
		System.out.println("El resultado final es " + resultadoFinal);
	}/*Fin pintar resultado*/

	/*Pedimos un número, comprobamos si es número y en caso de serlo, se realiza la suma*/
	public static void sumar() {
		System.out.println("Escribe un número para sumar:");
		numeroOpString = scan.nextLine();
		
		try {
			numeroOpFloat = Float.parseFloat(numeroOpString);
		} catch (Exception e) {
			System.out.println("Lo que has introducido no es un número! Error: " + e);
		}
		resultadoFinal = o.sumar(resultadoFinal, numeroOpFloat);
	}/*Fin sumar*/
	
	
	/*Pedimos un número, comprobamos si es número y en caso de serlo, se realiza la resta*/
	public static void restar() {
		System.out.println("Escribe un número para restar:");
		numeroOpString = scan.nextLine();
		
		try {
			numeroOpFloat = Float.parseFloat(numeroOpString);
		} catch (Exception e) {
			System.out.println("Lo que has introducido no es un número! Error: " + e);
		}		
		resultadoFinal = o.restar(resultadoFinal, numeroOpFloat);
	}/*Fin restar*/
	
	
	/*Pedimos un número, comprobamos si es número y en caso de serlo, se realiza la multiplicacion*/
	public static void multiplicar() {
		System.out.println("Escribe un número para multiplicar:");
		numeroOpString = scan.nextLine();

		try {
			numeroOpFloat = Float.parseFloat(numeroOpString);
		} catch (Exception e) {
			System.out.println("Lo que has introducido no es un número! Error: " + e);
		}
		resultadoFinal = o.multiplicar(resultadoFinal, numeroOpFloat);
	}/*Fin multiplicar*/

	
	/*Pedimos un número, comprobamos si es número y en caso de serlo, se realiza la división*/
	public static void dividir() {
		System.out.println("Escribe un número para dividir:");
		numeroOpString = scan.nextLine();
		
		try {
			numeroOpFloat = Float.parseFloat(numeroOpString);
		} catch (Exception e) {
			System.out.println("Lo que has introducido no es un número! Error: " + e);
		}
		resultadoFinal = o.dividir(resultadoFinal, numeroOpFloat);
	}/*Fin dividir*/

}
