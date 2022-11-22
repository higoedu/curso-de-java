public class ArrayFuncaoMatricial {
	public static void main(String[] args){
		/*
		f(x, y) = (3 * (x + 1) + (y * y));
		(0 < x < 9) e (0 < y < 9)
		*/
		int[][] valores = new int[10][10];

		for(int x = 0; x < 10; x++){
			String str = "";
			for(int y = 0; y < 10; y++){
				valores[x][y] = (3 * (x + 1) + (y * y));

				if(y < 9)
					str += valores[x][y] + ", ";
				else
					str += valores[x][y];
			}
			System.out.println(str);

		}
	}
}