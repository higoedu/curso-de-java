import java.util.Scanner;
public class OperadoresLogicos{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		final int idadeJovem, idadeIdosa;
		int idade;

		idadeJovem = 17;
		idadeIdosa = 60;

		System.out.println("Digite a idade");
		idade = entrada.nextInt();

		//faz verificação para saber se a pessoa é jovem, idosa ou meia idade
		if(idade <= idadeJovem){
			System.out.println("A pessoa e um jovem");
		}
		else if(idade >= idadeIdosa){
			System.out.println("A pessoa e idosa");
		}
		/*
		else if(idade > idadeJovem){
			if(idade < idadeIdosa){
				System.out.println("A pessoa e de meia idade");
			}
		}
		*/
		//substitui por operador lógico &&
		else if((idade > idadeJovem) && (idade < idadeIdosa)){
			System.out.println("A pessoa e de meia idade");
		}
	}
}