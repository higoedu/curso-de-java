public class LoopingAlinhado{
	public static void main(String[] args){
		labelForI : for(int i = 0; i < 10; i++){
			
			labelForJ : for(int j = 0; j < 10; j++){
				System.out.println("O valor de i = " + i +
								   " o valor de j = " + j);
				if(j == 6 && i == 0){
					break labelForI;
				}
			}

			int a = 0;

			labelWhile : while(a < 10){
				a++;
				if(a == 5)
					break labelForI;
			}
		}
	}
}