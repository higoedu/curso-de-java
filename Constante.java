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

		//Distância que o som vai percorre em um determinado espaço de tempo
		final double velocidadeSom = 340.28;//m/s

		System.out.println("Digite o espaco de tempo");
		int tempo = entrada.nextInt();

		System.out.println("A distancia e de: " +
							tempo * velocidadeSom +
							" metros percorridos");

		System.out.println("A distancia em Km de: " +
							(tempo * velocidadeSom) / 1000 +
							" Km percorridos");
	}
}