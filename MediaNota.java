import java.util.Scanner;
public class MediaNota{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		double numero1, numero2, numero3, numero4, media;

		System.out.println("Digite a 1 nota");
		numero1 = entrada.nextDouble();

		System.out.println("Digite a 2 nota");
		numero2 = entrada.nextDouble();

		System.out.println("Digite a 3 nota");
		numero3 = entrada.nextDouble();

		System.out.println("Digite a 4 nota");
		numero4 = entrada.nextDouble();

		media = (numero1 + numero2 + numero3 + numero4) / 4;

		if(media >= 7){
			System.out.println("Voce foi aprovado, a media e: " + media);
		}
		else{
			System.out.println("Voce foi reprovado, a media e: " + media);
		}
	}
}