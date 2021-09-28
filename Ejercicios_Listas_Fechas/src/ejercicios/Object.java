package ejercicios;

public class Object {//Ejercicio04: Crear una clase Object y comentarla
	
	//Atributos de la clase Object con el modificador private
	private String nombreEjemplo;//variable de tipo String
	private int numEjemplo;//variable de tipo entero
	
	//Constructor con parámetros
	public Object(String nombreEjemplo, int numEjemplo) {
		
		this.nombreEjemplo = nombreEjemplo;
		this.numEjemplo = numEjemplo;
	}
	
	//Constructor sin parámetros
	public Object() {
		
	}
	
	//Métodos getters y setters
	public String getNombreEjemplo() {
		return nombreEjemplo;
	}

	public void setNombreEjemplo(String nombreEjemplo) {
		this.nombreEjemplo = nombreEjemplo;
	}

	public int getNumEjemplo() {
		return numEjemplo;
	}

	public void setNumEjemplo(int numEjemplo) {
		this.numEjemplo = numEjemplo;
	}
	
	//Método alternativo de la clase Object
	
	public void NombreEntero() {
		System.out.println("El nombre de ejemplo es: "+this.nombreEjemplo);
	}
	
	
	
}
