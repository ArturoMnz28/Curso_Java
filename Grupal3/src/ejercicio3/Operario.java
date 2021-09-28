package ejercicio3;

public class Operario extends Empleado {
	
	private String grado;
	
	public Operario() {
		
	}

	public Operario(String nombre, String apellido1, String apellido2, String direccion, String foro, String email,
			String departamento, double sueldo, String grado) {
		super(nombre, apellido1, apellido2, direccion, foro, email, departamento, sueldo);
		this.grado = grado;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	@Override
	public String toString() {
		return "Operario [grado=" + grado + ", getNombre()=" + getNombre() + ", getApellido1()=" + getApellido1()
				+ ", getApellido2()=" + getApellido2() + ", getDireccion()=" + getDireccion() + ", getForo()="
				+ getForo() + ", getEmail()=" + getEmail() + ", getDepartamento()=" + getDepartamento()
				+ ", getSueldo()=" + getSueldo() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	public void verGrado() {
		
		System.out.println("El Operario con nombre "+super.getNombre()+" y apellidos "+super.getApellido1()+" "+super.getApellido2()+ " se encuentra en el grado de "+this.getGrado());
		
	}
}
