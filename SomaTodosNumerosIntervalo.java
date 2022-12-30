import java.util.Scanner;

/*
Faça um programa que mostre a soma de todos os números no intervalo determinado pelo
usuário. Logo, peça para que o usuário defina o início da contagem e em seguida, peça ao
mesmo que informe o final
*/
public class SomaTodosNumerosIntervalo {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o início de intervalo: ");
		int ini = entrada.nextInt();
		System.out.println("Informe o final de intervalo: ");
		int fim = entrada.nextInt();

		int i = ini;
		int soma = ini;
		while(i < fim){
			i++;
			soma+=i;
		}
		System.out.println(soma);
	}
}