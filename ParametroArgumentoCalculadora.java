class Calculadora4{
	//método sem retorno
	//2 parâmetros
	void soma(int numero1, int numero2){
		System.out.println(numero1 + numero2);
	}
}

public class ParametroArgumentoCalculadora {
	public static void main(String[] args){
		Calculadora4 calculadora = new Calculadora4();
		//2 argumentos
		calculadora.soma(5, 25);
	}
}