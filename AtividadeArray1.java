import java.util.Arrays;
import java.util.Scanner;
/*
Peça para o usuário informar 7 números e
armazene-os em um array. Na sequência:

1) Some todos os números e exiba na tela
2) Multiplique o índice pelo seu valor
3) Calcule a média aritmética
*/
public class AtividadeArray1{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int[] valores = new int[7];

		for(int j = 0; j < 7; j++) {
			System.out.printf("Digite o numero da posicao [%d]:", j + 1);
			valores[j] = entrada.nextInt();
		}

		System.out.println(Arrays.toString(valores));

		int somaElementos = 0;
		for(int x = 0; x < 7; x++) {
			somaElementos += valores[x];
		}

		System.out.printf("A soma dos elementos e: %d\n", somaElementos);

		for(int x = 0; x < 7; x++) {
			int produto = valores[x] * x;
			System.out.printf("A multiplicacao do indice pelo elemento e: %d * %d = %d\n", valores[x], x, produto);
		}

		double soma = somaElementos;
		double media = soma / 7.0;
		System.out.printf("A media aritmetica e: %f\n", media);
	}
}