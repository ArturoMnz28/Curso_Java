package ejercicio06;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String fono;
	private String mail;
	
	
	public Cliente(String nombre, String apellido, String fono, String mail) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fono = fono;
		this.mail = mail;
	}


	public String getNombre() {
		return this.nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return this.apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getFono() {
		return this.fono;
	}


	public void setFono(String fono) {
		this.fono = fono;
	}


	public String getMail() {
		return this.mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	
	
}
