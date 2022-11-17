public class ArraysMultidimensionais {
	public static void main(String[] args){
		int[][] numeros = new int[2][9];

		/*
		numeros[0][0] = 1000;
		System.out.println(numeros[0][0]);

		numeros[1][0] = 5;
		System.out.println(numeros[1][0]);

		System.out.println(numeros[0].length);
		*/

		numeros[0][0] = 1;
		numeros[0][1] = 2;
		numeros[0][2] = 3;
		numeros[0][3] = 4;
		numeros[0][4] = 5;
		numeros[0][5] = 6;
		numeros[0][6] = 7;
		numeros[0][7] = 8;
		numeros[0][8] = 9;

		for(int x = 0; x < numeros[0].length; x++)
			System.out.println(numeros[0][x]);

		int[][] valores = {{1, 2, 3},
						   {4, 5, 6},
						   {7, 8, 9}};

		//int[][] x = new int[2][2];

		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++)
				System.out.print(valores[i][j] + " ");
			System.out.println();
		}

		/*
		1) de i
		i = 0;
			j = 0; (0, 0)
			j = 1; (0, 1)
			j = 2; (0, 2)
		*/

	}
}