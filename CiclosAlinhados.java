public class CiclosAlinhados {
	public static void main(String[] args){
		int[][] valores = new int[5][5];

		/*
		ciclo alinhado
		um laço de repetição que contém outro laço de repetição
		*/
		for (int x = 0; x < 5; x++){
			for(int y = 0; y < 5; y++){
				valores[x][y] = 9;
			}
		}

		for (int x = 0; x < 5; x++){
			for(int y = 0; y < 5; y++){
				System.out.println(valores[x][y]);
			}
		}
	}
}