import java.util.Scanner;
public class Calculadora{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		double numero1, numero2, soma, subtracao, multiplicacao, divisao;
		
		//entrada de dados
		System.out.println("Digite o 1 numero");
		numero1 = entrada.nextDouble();

		System.out.println("Digite o 1 numero");
		numero2 = entrada.nextDouble();

		//processamento de dados
		soma = numero1 + numero2;
		subtracao = numero1 - numero2;
		multiplicacao = numero1 * numero2;
		divisao = numero1 / numero2;

		//saída de dados
		System.out.println("Soma: " + soma);
		System.out.println("Subtracao: " + subtracao);
		System.out.println("Multiplicacao: " + multiplicacao);
		System.out.println("Divisao: " + divisao);
	}
}