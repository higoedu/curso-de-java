public class TiposPrimitivos{
	public static void main(String[] args){
		//ocupa 1 byte, 8 bits
		boolean pergunta = true;

		//ocupa 2 byte, 16 bits
		char letra = 'H';

		//ocupa 1 byte, 8 bits
		byte numeroB = 100;
		
		//ocupa 2 byte, 16 bits
		short numeroS = 2000;

		//ocupa 4 byte, 32 bits
		int numeroI = 10000;

		//ocupa 8 byte, 64 bits
		long numeroL = 250L;

		//ocupa 4 byte, 32 bits
		float numeroF = 64.87f;

		//ocupa 8 byte, 64 bits
		double numeroD = 540.11;

		System.out.println("Pergunta: " + pergunta +
							"\nletra: " + letra +
							"\nnumero: " + numeroB +
							"\nnumero: " + numeroS +
							"\nnumero: " + numeroI +
							"\nnumero: " + numeroL +
							"\nnumero: " + numeroF +
							"\nnumero: " + numeroD);
	}
}