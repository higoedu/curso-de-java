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

	}
}