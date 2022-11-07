import java.util.Random;
public class NumerosAleatorios{
	public static void main(String[] args){
		//atribui a instância Random à variável numero
		Random numero = new Random();
		//invocamos o método nextInt()
		System.out.println(numero.nextInt());
		/*
		gerar número em um determinado intervalo
		temos que passar o valor máximo desse intervalo
		entre 0 e 5
		*/
		System.out.println(numero.nextInt(6));
		

	}
}