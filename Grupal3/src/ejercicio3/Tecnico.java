package ejercicio3;

public class Tecnico extends Operario {
	
	private String especialidad;

	public Tecnico() {
		super();
		
	}

	public Tecnico(String nombre, String apellido1, String apellido2, String direccion, String foro, String email,
			String departamento, double sueldo, String grado, String especialidad) {
		super(nombre, apellido1, apellido2, direccion, foro, email, departamento, sueldo, grado);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return this.especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
}
