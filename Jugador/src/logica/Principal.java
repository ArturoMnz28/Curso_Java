package logica;

public class Principal {

	public static void main(String[] args) {
		//Creamos los 3 objetos, 2 sin parámetros y otro con parámetros
		Gamer gamer1 = new Gamer();
		Gamer gamer2 = new Gamer();
		Gamer gamer3 = new Gamer("Arturo",2,'M');
		
		//Le añadimos los valores a los dos primeros objetos
		gamer1.setNombre("Elena");
		gamer1.setNivel(1);
		gamer1.setSexo('F');
		
		gamer2.setNombre("Juan");
		gamer2.setNivel(1);
		gamer2.setSexo('M');
		
		//Imprimimos los valores
		System.out.println("Jugador 1: " + gamer1.getNombre() + " , " + gamer1.getNivel() + " , " + gamer1.getSexo());
		System.out.println("Jugador 2: " + gamer2.getNombre() + " , " + gamer2.getNivel() + " , " + gamer2.getSexo());
		System.out.println("Jugador 3: " + gamer3.getNombre() + " , " + gamer3.getNivel() + " , " + gamer3.getSexo());

	}

}
