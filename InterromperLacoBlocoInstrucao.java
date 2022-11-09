public class InterromperLacoBlocoInstrucao{
	public static void main(String[] args){
		int i;
		for(i = 0; i < 5; i++){
			if(true)
				break;
		}

		System.out.println(i);

		int j = 10;
		while(i < 100){
			j++;
			if(true)
				break;
		}

		System.out.println(j);

		int m = 2;
		switch(m){
			case 1 : System.out.println("numero 1");
			break;
			case 2 : System.out.println("numero 2");
			break;
			default : System.out.println("numero invalido");
		}

		blocoIntrucao: {
						System.out.println("1");
						if(true)
							break blocoIntrucao;
						System.out.println("2");
		}
	}
}