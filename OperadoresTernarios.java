import java.util.Scanner;
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

		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual o seu dia da semana predileto");
		System.out.println("Digite 1 para segunda e 7 para domingo");
		int numero = entrada.nextInt();

		String dia = (numero == 1) ? "segunda" :
					 (numero == 2) ? "terca" :
					 (numero == 3) ? "quarta" :
					 (numero == 4) ? "quinta" :
					 (numero == 5) ? "sexta" :
					 (numero == 6) ? "sabado" :
					 (numero == 7) ? "domingo" :
					 				 "dia invalido";

		System.out.println("O dia foi: " + dia);
					 
	}
}