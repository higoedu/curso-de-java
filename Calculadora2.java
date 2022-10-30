import java.util.Scanner;
public class Calculadora2{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		double numero1, numero2;
		int i;

		System.out.println("Digite 1 para somar");
		System.out.println("Digite 2 para subtrair");
		System.out.println("Digite 3 para multiplicar");
		System.out.println("Digite 4 para dividir");
		i = entrada.nextInt();

		System.out.println("Digite a 1 numero");
		numero1 = entrada.nextDouble();

		System.out.println("Digite a 2 numero");
		numero2 = entrada.nextDouble();

		if(i == 1)
			System.out.println(numero1 + numero2);
		else if (i == 2)
			System.out.println(numero1 - numero2);
		else if (i == 3)
			System.out.println(numero1 * numero2);
		else if (i == 4)
			System.out.println(numero1 / numero2);
	}
}