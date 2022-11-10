public class ManipulandoArray{
	public static void main(String[] args){
		int[] arrayInt = new int[10];
		arrayInt[0] = 10;
		arrayInt[1] = 20;
		arrayInt[2] = 30;
		arrayInt[3] = 40;
		arrayInt[4] = 50;
		arrayInt[5] = 60;
		arrayInt[6] = 70;
		arrayInt[7] = 80;
		arrayInt[8] = 90;
		arrayInt[9] = 100;

		int soma = arrayInt[0] + arrayInt[1] + arrayInt[2];

		System.out.println("A soma dos primeiros elementos e: " + soma);

		int soma2 = 0;
		for(int i = 0; i < 10; i++){
			soma2 += arrayInt[i];
		}

		System.out.println("A soma de todos os elementos e: " + soma2);

	}
}