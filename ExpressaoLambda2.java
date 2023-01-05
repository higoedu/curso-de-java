/*
Interfaces funcionais
*/
public class ExpressaoLambda2 {

	//interface funcional, pois temos só um método abstrato
	interface Num{
		//métodos abstratos
		double getValue();
	}

	interface ValorNumerico{
		//retorna uma valor booleano
		//passa um valor do tipo inteiro
		boolean teste (int n);
	}

	interface ValorNumerico2{
		boolean teste (int n, int n2);
	}

	public static void main(String[] args){
		//quando executarmos o programa, será criada uma instância da interface Num
		Num n;
		//e foi implementada através de uma expressão lambda com uma constante
		n = () -> 333.11;

		//quando o método que está contido na interface for invocado, a expressão lambda será executada
		System.out.println( n.getValue() );

		//utilização da classe math com a estrutura lambda
		Num n2 = () -> Math.random() * 100;

		System.out.println( n2.getValue() );

		ValorNumerico isPar = (int n3) -> (n3 % 2) == 0;

		System.out.println( isPar.teste(89) );
		System.out.println( isPar.teste(90) );

		ValorNumerico2 isDiv = (x, y) -> (x % y) == 0;

		System.out.println( isDiv.teste(10 ,2) );
		System.out.println( isDiv.teste(10, 3) );

		ValorNumerico expressao1 = n4 -> (n4 % 2) == 0;
		ValorNumerico2 expressao2 = (int x, int y) -> (x % y) == 0;

	}
}