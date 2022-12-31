import java.util.Scanner;

/*
Faça um programa (utilizando recusividade) que peça para o usuário digitar um número,
em seguida, faça a soma de todos os algarismos do número
Exemplo:
1111 = 1 + 1 + 1 + 1 = 4
2090 = 2 + 0 + 9 + 0 = 11
*/
public class SomaTodosAlgarismosRecusividade {
	public static int somaAlgorismos(int numero, int somaMomentanea){
		if(numero < 1)
			return somaMomentanea;
		somaMomentanea += (numero % 10);
		return somaAlgorismos(numero / 10, somaMomentanea);
	}
	public static void main(String[] args){
		System.out.println("Digite um número: ");
		int numero = new Scanner(System.in).nextInt();
		int soma = somaAlgorismos(numero, 0);

		System.out.println("O valor da soma dos algarismos é: " + soma);
	}
}