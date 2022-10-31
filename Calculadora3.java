import java.util.Scanner;
public class Calculadora3{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		//onde vamos armazenar a operação a realizar
		int x = 0;
		double numero1, numero2, resultado;
		numero1 = numero2 = resultado = 0;

		do{

		System.out.println("Digite o codigo da operacao");
		System.out.println("1) somar");
		System.out.println("2) subtrair");
		System.out.println("3) multiplicar");
		System.out.println("4) dividir");
		System.out.println("0) Sair");

		x = entrada.nextInt();

		//verifica se o usuário deseja sair do programa
		if(x != 0){
			System.out.println("Digite o 1 numero");
			numero1 = entrada.nextDouble();

			System.out.println("Digite o 2 numero");
			numero2 = entrada.nextDouble();

			//somar
			if(x == 1){
				resultado = numero1 + numero2;
			}
			else
				//subtrair
				if(x == 2){
					resultado = numero1 - numero2;
				}
				else
					//multiplicar
					if(x == 3){
						resultado = numero1 * numero2;
					}
					else
						//dividir
						if(x == 4){
							resultado = numero1 / numero2;
						}
			System.out.println("\nResultado: " + resultado);
			System.out.println();
		}
		}
		while(x != 0);
	}
}