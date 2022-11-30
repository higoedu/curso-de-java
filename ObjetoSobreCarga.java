//sobrecarga - overloading
class SobreCarga{
	void imprime(String s){//assinatura do método
		System.out.println(s);
	}
	void imprime(String s1, String s2){
		System.out.println(s1 + " - " + s2);
	}
	void imprime(String s, int i){
		System.out.println(s + " - " + i);
	}
}

public class ObjetoSobreCarga {
	public static void main(String[] args){
		/*
		instanciamos a classe SobreCarga
		invocamos o método imprime()
		*/
		new SobreCarga().imprime("Um parametro do tipo String");
		new SobreCarga().imprime("Primeiro parametro", "Segundo parametro");
		new SobreCarga().imprime("A idade e de: ", 25);
	}
}