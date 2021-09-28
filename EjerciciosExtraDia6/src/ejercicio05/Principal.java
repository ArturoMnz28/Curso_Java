package ejercicio05;

import java.util.ArrayList;

public class Principal {
	
	static ArrayList<Integer> lista = new ArrayList<Integer>();
	static Pila p;
	public static void main(String[] args) {
		
		rellenarListaPila();
		comprobarPila();
		addElementsPila();
		
		//Obtenemos el primer elemento de la lista
		System.out.println("El primer elemento de la lista es: " + p.primero());
		
		System.out.println("Acabamos de extrar el último elemento de la lista: " + p.extraer());

		//Ahora podemos incluir otro elemento en la lista
		p.anadir(12);
		//Leemos la lista completa
		p.leerLista();

	}
	
	public static void rellenarListaPila() {
		p.anadir(1);
		p.anadir(2);
		p.anadir(3);
		p.anadir(4);
		p.anadir(5);
		p.anadir(6);
		
		p = new Pila(lista, 7);
	}/*fin rellenarListaPila*/
	
	
	//Comprobamos si la lista está vacía
	public static void comprobarPila() {
		boolean vacio = p.estaVacio();
		if (vacio == true){
			System.out.println("La pila está vacia");
		}else {
			System.out.println("La pila no está vacia");
		}
		
	}/*Fin comprobarPila*/
	
	
	//Añadimos nuevos elementos a la pila, añadimos de más para ver el manejo de errores
	public static void addElementsPila() {
		p.anadir(7);
		p.anadir(8);
		p.anadir(9);
	}

}
