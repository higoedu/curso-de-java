import java.util.Scanner;
public class Constante{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		/*
		constante:
		- em tempo de execução não será alterada
		- tem endereço de memória protegido
		- nunca será desolocada
		- declaramos um vez, utilizamos quantas vezes for preciso
		*/
		final double CONSTANTE = 10;
		double numero;

		System.out.println("Digite um numero");
		numero = entrada.nextDouble();

		System.out.println("Resultado: " + numero * CONSTANTE);
	}
}