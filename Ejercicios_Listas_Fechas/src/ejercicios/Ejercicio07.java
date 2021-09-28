package ejercicios;

import java.util.Scanner;
import java.util.HashMap;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String pais,capital;
		String c = "";
		int entradas = 0;
		
		//Utilizamos HashMap para introducir los paises y las capitales
		HashMap<String,String> pyc = new HashMap<String, String>();
		
		while(!c.equals("0")) {
			//Introducimos por teclado el país y la capital que deseemos
			
			System.out.println("Introduce el nombre del país: ");
			pais = teclado.nextLine();
			
			System.out.println("Introudce el nombre de la capital: ");
			capital = teclado.nextLine();
			
			pyc.put(pais, capital);//Añadimos el país y la capital
			
			entradas++;//Incrementamos el número de entradas de países y capitales
			
			if(entradas >= 5) {//Preguntamos la posibilidad de si el usuario quiere salir o seguir una vez haya más de 5 entradas
				System.out.println("Introduce 0 si quieres salir o si no quieres introducir más países con capitales");
				c = teclado.nextLine();
			}
			
		}
		
		System.out.println(pyc);//Sacamos todas las entradas de países y capitales
		
		c = "";
		
		while(!c.equals("0")) {//Preguntamos si existe esa entrada mediante el país
			
			System.out.println("Introduce el nombre del país o pulse 0 para salir del programa");
			pais = teclado.nextLine();
			
			
			//Preguntamos por la clave que es el país y buscamos la capital
			if(pyc.containsKey(pais)) {
				
				System.out.println("La capital de "+pais+" es "+pyc.get(pais));
				
			}else if(pais.equals("0")) {
				
				System.out.println("Saliendo del programa. Muchas gracias");
				c= "0";
				
			}else {
				System.out.println("No se encuentra el país indicado");
			}
			
		}
		
	}

}
