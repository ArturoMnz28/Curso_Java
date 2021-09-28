package ejercicio03;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
	
	static ArrayList<Publicaciones> libros = new ArrayList<Publicaciones>();

	public static void main(String[] args) {
		addLibros();
		System.out.println("Cantidad de libros prestados: " + saldoPrestados());
		System.out.println("Cantidad de libros publicados por debajo del año seleccionado 2002: " + cantPublicaciones(2002));

	}
	
	public static void addLibros() {
		Publicaciones l1 = new Publicaciones("Los juegos del hambre", LocalDate.parse("1998-01-22"), false);
		Publicaciones l2 = new Publicaciones("Los juegos del hambre - En llamas", LocalDate.parse("1999-07-28"), true);
		Publicaciones l3 = new Publicaciones("Los juegos del hambre - Sinsajo", LocalDate.parse("2010-05-11"), true);
		Publicaciones l4 = new Publicaciones("Balada de pájaros cantores y serpientes", LocalDate.parse("2020-08-17"), false);

		
		libros.add(l1);
		libros.add(l2);
		libros.add(l3);
		libros.add(l4);
	}
	
	
	public static int saldoPrestados() {
		int contador = 0;
		for(int i = 0; i < libros.size(); i++) {
			if(libros.get(i).isPrestado()) {
				contador++;
			}
		}
		return contador;
	}
	
	public static int cantPublicaciones(int anio) {
		
		int contador = 0;
		LocalDate f_param = LocalDate.parse(anio + "-01-01");
		LocalDate f_lib;

		for(int i = 0; i < libros.size(); i++) {
			f_lib = libros.get(i).getFecha();
			if(f_param.compareTo(f_lib) > 0) {
				contador++;
			}
		}
		return contador;
	}

}
