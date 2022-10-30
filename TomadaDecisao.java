import java.util.Scanner;
public class TomadaDecisao{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		double numero;

		System.out.println("Digite um numero");
		numero = entrada.nextDouble();

		if(numero == 10)
			System.out.println("e numero 10");
		else
			System.out.println("nao e numero 10");
	}
}