package logica;

public class Persona {
	
	//Atributos-propiedades
	//Declaramos variables
	private String nombre;
	private int edad;
	
	//Constructor sin parámetros
	public Persona() {
		
	}
	//Constructor con parámetros(siempre en el orden que se han declarado)
	public Persona(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
		
	}
	
	//Métodos o funciones Accesadores(getters) o mutadores(setters)
	//Getters
	public String getNombre() {
		return this.nombre;
	}
	public int getEdad() {
		return this.edad;
	}
	
	//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
