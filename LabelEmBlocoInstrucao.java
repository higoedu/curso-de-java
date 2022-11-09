public class LabelEmBlocoInstrucao{
	public static void main(String[] args){
		label1: {
			System.out.println("label 1");
			labelIf: if(true){
				System.out.println("instrucao if");
				break label1;
			}
			label2: {
				System.out.println("instrucao 2");
			}
		}
	}
}