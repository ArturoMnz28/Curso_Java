package ejercicio3;

public class Oficial extends Operario {
	
	private String nivel;

	public Oficial() {
		super();
		
	}

	public Oficial(String nombre, String apellido1, String apellido2, String direccion, String foro, String email,
			String departamento, double sueldo, String grado, String nivel) {
		super(nombre, apellido1, apellido2, direccion, foro, email, departamento, sueldo, grado);
		this.nivel = nivel;
	}

	public String getNivel() {
		return this.nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
}
