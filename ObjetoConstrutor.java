class Janela{
	int largura, altura;
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
		Janela j = new Janela(250, 300);
		j.imprimir();
	}
}