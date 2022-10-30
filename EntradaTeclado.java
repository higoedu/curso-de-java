import java.util.Scanner;
public class EntradaTeclado{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome");
		System.out.println( entrada.nextLine() );
	}
}