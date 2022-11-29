class Fatorial{
	//método recursivo
	int fatorial(int n){
		//expressão mínima
		if(n <= 1)
			return 1;
		//implementa a recursiva
		int r = fatorial(n - 1) * n;
			return r;
	}
}

public class ObjetoRecursividade {
	public static void main(String[] args){
		System.out.println(new Fatorial().fatorial(5));
	}
}