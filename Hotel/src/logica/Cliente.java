package logica;

public class Cliente {
	
	private String nombre;
	private int edad;
	private String id;
	private float dineroDisponible;
	
	public Cliente() {
		
	}
	
	public Cliente(String nombre, int edad, String id, float dineroDisponible) {
		this.nombre = nombre;
		this.edad = edad;
		this.id = id;
		this.dineroDisponible = dineroDisponible;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public float getDineroDisponible() {
		return this.dineroDisponible;
	}

	public void setDineroDisponible(float dineroDisponible) {
		this.dineroDisponible = dineroDisponible;
	}
	
	public void imprimirCliente() {
		System.out.println("Nombre del cliente: " +this.nombre);
		System.out.println("Edad del cliente: "+this.edad);
		System.out.println("DNI:" +this.id);
		System.out.println("Euros: " +this.dineroDisponible);
	}
	
	
}
