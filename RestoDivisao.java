import java.util.Scanner;
public class RestoDivisao{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		double numero;

		System.out.println("Digite um numero");
		numero = entrada.nextDouble();

		if(numero % 2 == 0)
			System.out.println("O resto da divisao por 2 e igual a 0, resto: " + numero % 2);
		else
			System.out.println("O resto da divisao por 2 nao e igual a 0, resto: " + numero % 2);
	}
}