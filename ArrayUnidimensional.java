public class ArrayUnidimensional{
	public static void main(String[] args){
		//declaração do nosso array
		int[] array;
		/*
		cria e reserva o espaço para o nosso array
		variável array recebe uma nova instância de um objeto array
		que irá conter 10 elementos do tipo inteiro
		*/
		array = new int[10];

		for(int i = 0; i < 10; i++){
			/*
			imprime de forma formatada - printf
			número inteiro que pode ter até 5 casas - %5d
			número inteiro que pode até 7 elementos - %7d
			*/
			System.out.printf("%5d%7d\n", i, array[i]);
		}
	}
}