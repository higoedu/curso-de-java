public class LacosCondicionais{
	public static void main(String[] args){
		int contadorWhile, contadorDoWhile;
		contadorWhile = contadorDoWhile = 0;

		/*
		executa bloco de instrução, enquanto a instrução for verdadeira
		estrutura de repetição, iteração, looping
		*/
		/*
		enquanto contadorWhile for menor e igual a 5
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

		//faça enquanto contadorDoWhile for menor e igual a 5
		do{
			contadorDoWhile++;
			System.out.println("looping do while");
		}
		while(contadorDoWhile <= 5);

		/*
		int i = 0 	- declaramos uma variável
		i <= 5 		- colocamos a condição para que o looping continue ou seja terminado
		i++ 		- incrementamos a nossa variável
		*/
		for(int i = 0; i <=5; i++){
			System.out.println("looping for");
		}
	}
}