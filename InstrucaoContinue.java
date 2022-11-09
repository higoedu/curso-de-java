public class InstrucaoContinue{
	public static void main(String[] args){
		int a = 0, soma = 0;

		System.out.println("Imprime os numeros pares de 0 a 100");
		for(int i = 0; i <= 100; i++){
			//i é divisível por 2 e o resto é igual a 0
			if(i % 2 == 0)
				System.out.println(i);
			else
				/*
				se for ímpar volta para o cabeçalho for
				encerra um ciclo
				*/
				continue;

			while(a < i){
				a++;
				soma+=a;
			}
		}
		System.out.println("A soma de todos os numeros e: " + soma);
	}
}