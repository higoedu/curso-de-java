public class ArrayForeach {
	public static void main(String[] args){
		int[] lista = new int[3];

		lista[0] = 10;
		lista[1] = 20;
		lista[2] = 30;

		//imprime a média aritmética
		int soma = 0;
		for (int item : lista) {
			soma += item;
			System.out.println(item);
		}

		float media = (float) soma / lista.length;

		System.out.println("A media aritmetica e: " + media);

		//imprime o menor e o maior valor da lista
		int menor = 0;
		int maior = 0;
		for (int item : lista) {
			if(item < menor || menor == 0)
				menor = item;
			if(item > maior)
				maior = item;
		}

		System.out.println("O menor valor da lista e: " + menor);
		System.out.println("O maior valor da lista e: " + maior);

	}
}