import java.util.Scanner;

/*
Reescreva o código a seguir a fim de se utilizar o mínimo de linhas possíveis:
Nota(s):
	1) Amontoar linhas não soluciona o problema.
	O código a seguir não é simplificação e sim, confusão:
	2) Escreva de forma tal a utilizar somente 4 linhas
Código fonte:
Scanner in = new Scanner(System.in);
System.out.println("Simplificando expressão para reduzir o número de linhas");
int x = 0;
x = in.nextInt();
if(x > 10){
	System.out.println("O número digitado é maior do que 10");
} else{
	System.out.println("O número digitado é menor do que 10");
}
*/
public class ExercicioSimplificacao {
	public static void main(String[] args){
		System.out.println("Simplificando expressão para reduzir o número de linhas");
		int x = new Scanner(System.in).nextInt();
		String s = (x > 10) ? "maior" : "menor";
		System.out.println("O número digitado e " + s + " do que 10");
	}
}