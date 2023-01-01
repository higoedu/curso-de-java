/*
Interfaces funcionais
Function: uma função que recebe um único argumento
Predicate: função que recebe um único parâmetro e devolve um booleano
Consumer: função que recebe um único parâmetro e não devolve nada
*/
public class ExpressaoLambda1 {
	public static void main(String[] args){
		//implementação da classe anônima Runnable
		Runnable run1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Estudando a expressão lambda 1");
			}
		};

		//expressão lambda
		Runnable run2 = ()//lista de argumentos
				->//seta - indica que estamos trabalhando com a expressão lambda
				System.out.println("Estudando a expressão lambda 2");//corpo - bloco de execução

		run1.run();
		run2.run();
	}
}