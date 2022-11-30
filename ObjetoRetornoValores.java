class Retangulo{
	public int width, heigth;

	public int areaTotal(){
		return width * heigth;
	}

	public boolean isQaudrado(){
		//verifica se é quadrado
		if(width == heigth)
			return true;
		return false;
	}
}
public class ObjetoRetornoValores {
	public static void main(String[] args){
		Retangulo quadrado = new Retangulo();

		quadrado.width = 100;
		quadrado.heigth = 120;

		System.out.println(quadrado.areaTotal());
		System.out.println(quadrado.isQaudrado());

		Retangulo quadrado2 = new Retangulo();

		quadrado2.width = 100;
		quadrado2.heigth = 100;

		System.out.println(quadrado2.areaTotal());
		System.out.println(quadrado2.isQaudrado());
	}
}