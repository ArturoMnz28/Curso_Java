package unidimensionales;

public class Arrays01 {

	public static void main(String[] args) {
		
		String [] autos = {"Kia","Nissan","Seat", "Audi", "Subaru", "BMW"};
		
		autos[1] = "Hyundai";
		
		int[] notas = {10,50,70};
		
		System.out.println(autos[1]);
		
		System.out.println(autos.length);
		
		for(int i=0; i < autos.length; i++) {
			
			System.out.println(autos[i]);
			
		}
		
		// Otra forma de recorrer el array
		for(String i : autos) {
			
			System.out.println(i);
		}
	}

}
