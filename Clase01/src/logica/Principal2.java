package logica;

public class Principal2 {

	public static void main(String[] args) {
		//Creación o instacia de una clase(Crear un objeto)
		
		//Creación de objeto con método constructor sin parámetros
		Persona per = new Persona();
		//Creación de objeto con método constructor con parámetros
		Persona per2 = new Persona("Arturo",23);
		//Ubicación en memoria del objeto     
		System.out.println(per);
		System.out.println(per2);
		//Objeto 1
		per.setNombre("Arturo");
		per.setEdad(43);
		System.out.println(per.getNombre());
		System.out.println(per.getEdad());
		//Objeto 2
		System.out.println(per2.getNombre());
		System.out.println(per2.getEdad());
		

	}

}
