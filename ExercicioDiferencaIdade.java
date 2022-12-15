import java.util.Scanner;

/*
Escreva um pequeno software que peça a sua idade e a idade de sua mãe.
Em seguida, imprima na tela as 3 informações a seguir:
1) a sua idade
2) a idade da sua mãe
3) minha mãe é <anos> mais velha do que eu

Nota(s):
1) Substitua o texto <anos> pela diferença entra a sua idade e a de sua mãe
*/
public class ExercicioDiferencaIdade {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a sua idade:");
		int minhaIdade = entrada.nextInt();

		System.out.println("Digite a idade de sua mãe:");
		int idadeMae = entrada.nextInt();

		int diferenca = idadeMae - minhaIdade;
		System.out.println("Minha mãe é " +
							diferenca +
							" anos mais velha do que eu");
	}
}