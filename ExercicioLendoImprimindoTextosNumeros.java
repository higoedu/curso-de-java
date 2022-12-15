/*
Faça um programa que peça o nome, idade e cidade de nascimento do usuário.
Em seguida, imprima a frase abaixo trocando as tag's <nome>, <idade>, <cidade>,
pelo nome, idade e cidade informado pelo usuário.
"Ola. Meu nome é <nome>, sou natural de <cidade>, tenho <idade> anos e estou aprendendo a programar."
*/
import java.util.Scanner;

public class ExercicioLendoImprimindoTextosNumeros {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);

		//1) Pedir para o usuário informar: nome, idade, cidade
		//2) Armazenar as informações do usuário em variáveis
		System.out.println("Digite o seu nome:");
		String nome = entrada.nextLine();

		System.out.println("Digite o sua idade:");
		int idade = entrada.nextInt();

		System.out.println("Digite o sua cidade de nascimento:");
		String cidade = entrada.next();

		//3) Alterar a frase do enunciado
		System.out.println("Ola. Meu nome é " + nome +
							", sou natural de " + cidade + ", " +
							"tenho " + idade + " anos e estou aprendendo a programar.");
	}
}