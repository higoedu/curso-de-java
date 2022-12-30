/*
Faça um programa que mostre a soma de todos os números no intervalo de 1 até 100
*/
public class ExercicioSoma1a100 {
	public static void main(String[] args){
		int soma = 0;

		System.out.println("A soma dos 100 primeiros números é: ");
		for(int i = 0; i <= 100; i++)
			soma+=i;
		System.out.println(soma);

		System.out.println("A soma utilizando a instrução WHILE: ");
		int soma2 = 0, i2 = 0;
		while (i2 <= 100){
			//fazemos 1º a atribuição, depois o incremento
			soma2+=i2;
			//soma2 = soma2 + i2;
			i2++;
		}
		System.out.println(soma2);
	}
}