package ejercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//preguntamos al usuario las 2 fechas
		System.out.println("Introduce el primer dia:");
		int dia1=teclado.nextInt();
		
		System.out.println("Introduce primer mes:");
		int mes1=teclado.nextInt();
		
		System.out.println("Introduce el primer año:");
		int año1=teclado.nextInt();
		
		
		
		System.out.println("Introduce el segundo dia:");
		int dia2=teclado.nextInt();
		
		System.out.println("Introduce segundo mes:");
		int mes2=teclado.nextInt();
		
		System.out.println("Introduce el segundo año:");
		int año2=teclado.nextInt();
		
		//Construimos los objetos LocalDate
		LocalDate fecha1 = LocalDate.of(dia1,mes1,año1);
		LocalDate fecha2 = LocalDate.of(dia2, mes2, año2);
		
		//Comprobamos que fecha es anterior a otra o son iguales
		if(fecha2.isBefore(fecha1)) {
			
			System.out.println("La segunda fecha es anterior");
			
		}else if(fecha1.isEqual(fecha2)) {
			
			System.out.println("Las dos fechas son iguales");
			
		}else {
			System.out.println("La primera fecha es anterior");
		}

	}

}
