package logica;

public class Gamer {
	
	//Atributos
	private String nombre;
	private int nivel;
	private char sexo;
	
	//Constructor sin parámetros
	public Gamer() {
		
	}
	//Constructor con parámetros
	public Gamer(String nombre, int nivel, char sexo) {
		this.nombre = nombre;
		this.nivel = nivel;
		this.sexo = sexo;
	}
	
	//Getters
	public String getNombre() {
		return this.nombre;
	}
	
	public int getNivel() {
		return this.nivel;
	}
	
	public char getSexo() {
		return this.sexo;
	}
	
	//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
}
