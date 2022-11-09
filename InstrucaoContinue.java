public class InstrucaoContinue{
	public static void main(String[] args){
		int a = 0, soma = 0;

		System.out.println("Imprime os numeros pares de 0 a 100");
		for(int i = 0; i <= 100; i++){
			if(i % 2 == 0)
				System.out.println(i);
			else
				continue;

			while(a < i){
				a++;
				soma+=a;
			}
		}
		System.out.println("A soma de todos os numeros e: " + soma);
	}
}