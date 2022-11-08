public class OperadoresTernarios{
	public static void main(String[] args){
		int a, b;
		String valor;
		a = 5;
		b = 5;

		/*
		a > b - é a condição
		se a condição for verdadeira, a variável valor recebe verdadeiro
		se a condição for falsa, a variável valor recebe falso
		*/
		valor = a > b ? "verdadeiro" : "falso";

		System.out.println(valor);
	}
}