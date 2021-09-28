package padreHijo;

public class Padre {
	
	private String nombre;
	private int edad;
	private String sexo;
	private double altura;
	private String colorPiel;
	private String colorOjos;
	
	
	
	public Padre(String nombre, int edad, String sexo, double altura, String colorPiel, String colorOjos) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.altura = altura;
		this.colorPiel = colorPiel;
		this.colorOjos = colorOjos;
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



	public String getSexo() {
		return this.sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public double getAltura() {
		return this.altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	public String getColorPiel() {
		return this.colorPiel;
	}



	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}



	public String getColorOjos() {
		return this.colorOjos;
	}



	public void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}
	
	public void trabajar(String trabajo) {
		System.out.println("El padre trabaja en "+trabajo);
	}
	
	
}
