import java.util.Scanner;
public class Constante{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		final double CONSTANTE = 10;
		double numero;

		System.out.println("Digite um numero");
		numero = entrada.nextDouble();

		System.out.println("Resultado: " + numero * CONSTANTE);
	}
}