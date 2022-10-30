/*
quando queremos utilizar uma classe que esta em outro pacote
utilizammos a instrução import, para importar essa classe
estamos utilizando a classe Scanner do pacote java.util
*/
import java.util.Scanner;
public class EntradaTeclado{
	public static void main(String[] args){
		//variável entrada do tipo Scanner
		Scanner entrada = new Scanner(System.in);
		//lê o que o usuário digitou
		System.out.println("Digite o nome");
		//pega o que o usuário digitou e imrime logo em seguida
		System.out.println( entrada.nextLine() );
	}
}