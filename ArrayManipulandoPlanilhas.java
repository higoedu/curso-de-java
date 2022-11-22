public class ArrayManipulandoPlanilhas {
	public static void main(String[] args){
		double[][] planilha =
				{
						{434, 45, 912, 42, 54, 0},
						{23.8, 973.3, 254.8, 744.2, 3.74, 0},
						{23.8, 973.3, 254.1, 744.2, 3.74, 0},
						{53.52, 67, 873, 245.9, 54.12, 0},
						{234.25, 54.2, 82.0, 745.2, 82, 0}
				};

		double somaTotal = 0;
		for(int x = 0; x < 5; x++){
			for(int y = 0; y < 5; y++){
				planilha[x][5] += planilha[x][y];
			}
			somaTotal += planilha[x][5];
		}

		for(int x = 0; x < 5; x++){
			String str = "";
			for(int y = 0; y < 6; y++){
				if(y < 5)
					str += planilha[x][y] + ", ";
				else
					str += planilha[x][y];
			}
			System.out.println(str);
		}
		System.out.println("A soma total e: " + somaTotal);
	}
}