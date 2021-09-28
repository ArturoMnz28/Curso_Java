package ejercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio03 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//Preguntamos al usuario su fecha de nacimiento
		System.out.println("Introduzca el día de nacimiento: ");
		int dia = teclado.nextInt();
		
		System.out.println("Introduzca el mes de nacimiento: ");
		int mes = teclado.nextInt();
		
		System.out.println("Introduzca el año de nacimiento: ");
		int anio = teclado.nextInt();
		
		//Obtenemos la fecha actual y separamos las variables de día, mes y año
		LocalDate hoy = LocalDate.now();
		int diaActual = hoy.getDayOfMonth();
		int mesActual = hoy.getMonthValue();
		int anioActual = hoy.getYear();
		
		//Calculamos la diferencia
		int diferencia = (anioActual - anio)*365 +(mesActual - mes)*30 + (diaActual - dia);
		System.out.println("La diferencia entre las dos fechas en días es: "+diferencia);
		teclado.close();
		
		
	}
}
