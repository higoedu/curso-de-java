public class LacosCondicionais{
	public static void main(String[] args){
		int contadorWhile, contadorDoWhile;
		contadorWhile = contadorDoWhile = 0;

		/*
		executa bloco de instrução, enquanto a instrução for verdadeira
		estrutura de repetição, iteração, looping
		*/
		/*
		enquanto contador for menor e igual a 9
		execute o que estiver dentro do bloco de instrução
		*/
		while(contadorWhile <= 5){
			/*
			contador = contador + 1;
			outra maneira de fazer o incremento
			*/
			contadorWhile++;
			System.out.println("looping while");
		}

		do{
			contadorDoWhile++;
			System.out.println("looping do while");
		}
		while(contadorDoWhile <= 5);
	}
}