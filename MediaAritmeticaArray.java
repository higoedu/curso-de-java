public class MediaAritmeticaArray {
	public static void main(String[] args){
		int[] numeros = new int[5];
		numeros[0] = 9;
		numeros[1] = 10;
		numeros[2] = 5;
		numeros[3] = 6;
		numeros[4] = 7;

		int soma = 0;
		for(int i = 0; i < numeros.length; i++){
			soma += numeros[i];
		}

		float media = (float) soma / numeros.length;

		System.out.println("A media e: " + media);

	}
}