import java.util.Scanner;

/*
Faça um programa que peça para o usuário digitar um número,
em seguida, faça a soma de todos os algarismos do número
Exemplos:
1111 = 1 + 1 + 1 + 1 = 4
2090 = 2 + 0 + 9 + 0 = 11
*/
public class SomaTodosAlgarismos {
	public static void main(String[] args){
		System.out.println("Informe o número: ");
		int numero = new Scanner(System.in).nextInt();
		int soma = 0;
		/*
		123 -> dividimos por 10, o resultado será 12, sobra 3
		(123 / 10) = 12 -> (123 % 10) = 3
		(12  / 10) = 1  -> (12  % 10) = 2
		(1   / 10) = 0  -> (1   % 10) = 1
		*/

		while(numero > 0) {
			//1) obter o módulo do número digitado
			int modulo = numero % 10;
			//2) incrementar o módulo a nossa variável soma
			soma += modulo;
			//3) dividir o número por e atribuimos a nossa variável numero
			numero /= 10;
			System.out.println("O valor da soma é: " + soma);
		}
		System.out.println("A soma dos algorismos é: " + soma);

	}
}