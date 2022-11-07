import java.util.Random;
public class NumerosAleatorios{
	public static void main(String[] args){
		//atribui a instância Random à variável numero
		Random numero = new Random();
		//invocamos o método nextInt()
		System.out.println(numero.nextInt());
	}
}