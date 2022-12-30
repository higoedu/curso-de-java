import java.util.Scanner;

/*
Escreva um programa que peça para o usuário informar qual tabuada o mesmo deseja ver e
armazene o número em uma variável. Em seguida, imprima a tabuada na tela se utilizando da
instrução FOR. Para imprimir a tabuada, siga o modelo abaixo:
Por favor, informe qual a tabuada que você deseja:
Ax X B = C10
Ax X B = C9
Ax X B = C8
Nota(s):
1) A, B e C representam, respectivamente:
A -> número da tabuada desejada pelo usuário
B -> número a ser incrementado
C -> resutaldo da expressão Ax X Bx = Cx
Exemplo:
5 X 10 = 50
5 X 9 = 45
5 X 8 = 40
*/
public class ExercicioTabuadaAvesso {
	public static void main(String[] args){
		//Pedimos para o usuário informar a tabuada
		System.out.println("Digite a tabuada que você deseja: ");
		//Criamos uma instância da classe Scanner
		Scanner entrada = new Scanner(System.in);

		//Pegamos o valor digitado pelo usuário
		int tabuada = entrada.nextInt();

		for (int i = 10; i > 1; i--){
			/*
			Ax X Bx = Cx
			Ax -> valor informado pelo usuário
			Bx -> valor a ser decrementado
			Cx -> cáculo
			*/
			System.out.println(tabuada +
					" x " +
					i +
					" = " +
					(tabuada * i));
		}
	}
}