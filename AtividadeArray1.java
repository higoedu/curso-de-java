import java.util.Arrays;
import java.util.Scanner;

public class AtividadeArray1 {
    public static void main(String[] args) {
        /*
        Peça para o usuário informar 7 números e
        armazene-os em um array. Na sequência:

        1) Some todos os números e exiba na tela
        2) Multiplique o índice pelo seu valor
        3) Calcule a média aritmética
        */
        Scanner entrada = new Scanner(System.in);
        int[] valores = new int[7];

        for (int i = 0; i < 7; i++){
            System.out.printf("Digite o numero da posicao [%d]: ", i);
            valores[i] = entrada.nextInt();
        }

        System.out.println(Arrays.toString(valores));
    }
}
