class Janela{
	int largura, altura;
	boolean b;
	float f;
	double d;
	//java inicializa as variáveis com seus valores padrões
	Janela(){
		/*
		esta chamando o construtor com parâmetro
		passando os argumentos 100, 100
		*/
		this(100, 100);
		System.out.println("int = " + largura);
		System.out.println("boolean = " + b);
		System.out.println("float = " + f);
		System.out.println("double = " + d);
	}
	Janela(int largura, int altura){
		//this esta fazendo referência ao atributo da classe
		this.largura = largura;
		//sem o this esta se referindo ao argumento passado no construtor
		this.altura = altura;
	}
	void imprimir(){
		System.out.println("Altura: " + altura + ", largura: " + largura);
	}
}

public class ObjetoConstrutor {
	public static void main(String[] args){
		Janela j1 = new Janela();
		Janela j2 = new Janela(250, 300);
		j2.imprimir();
	}
}