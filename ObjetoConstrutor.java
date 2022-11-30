class Janela{
	int largura, altura;
	boolean b;
	float f;
	double d;
	//java inicializa as variáveis com seus valores padrões
	Janela(){
		System.out.println("int = " + largura);
		System.out.println("boolean = " + b);
		System.out.println("float = " + f);
		System.out.println("double = " + d);
	}
	Janela(int l, int a){
		largura = l;
		altura = a;
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