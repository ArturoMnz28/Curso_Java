package ejercicio05;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Pila implements InterfazPila {
	
	private ArrayList<Integer> entradas = new ArrayList<Integer>();
	private int contadorObjetos;
	
	
	public Pila(ArrayList<Integer> entradas, int contadorObjetos) {
		super();
		this.entradas = entradas;
		this.contadorObjetos = contadorObjetos;
	}


	public ArrayList<Integer> getEntradas() {
		return this.entradas;
	}


	public void setEntradas(ArrayList<Integer> entradas) {
		this.entradas = entradas;
	}


	public int getContadorObjetos() {
		return contadorObjetos;
	}


	public void setContadorObjetos(int contadorObjetos) {
		this.contadorObjetos = contadorObjetos;
	}


	@Override
	public void anadir(int numero) {
		if(this.entradas.size() <= 7) {
			this.entradas.add(numero);
		}else {
			System.out.println("Capacidad máxima de la pila alcanzada, el número " + numero + " no se ha podido incluir");
		}	
	}


	@Override
	public boolean estaVacio() {
		
		boolean ret = false;
		if(this.entradas.size() == 0) {
			 ret = true;
		}
		return ret;
	}


	@Override
	public int primero() {
		int ret = 0;
		try {
			if(this.entradas.get(0) != null) {
				ret = this.entradas.get(0);
			}
		}catch(Exception NoSuchElementException) {
			throw new NoSuchElementException();
		}
		return ret;
	}


	@Override
	public int extraer() {
		int ret = 0;
		try {
			ret = this.entradas.remove(this.entradas.size()-1);
		}catch(Exception NoSuchElementException) {
			//throw new NoSuchElementException();
		}
		return ret;
		
	}
	
	public void leerLista() {
		System.out.println("=======Lista completa de la pila=======");
		for(int i = 0; i < entradas.size(); i++) {
			System.out.println(entradas.get(i));
		}
	}


	
	
	
	
}
