package multidimensionales;

public class ArraysM01 {

	public static void main(String[] args) {
		
		int[][] matriz = {{7,8,9},{1,5,7},{5,8,3},{5,8,3}};
		
		int x = matriz[2][2];
		
		System.out.println(x);
		
		//Recorrer la matriz
		for (int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				
				System.out.println(matriz[i][j]);
				
			}
		}
		
	}

}
