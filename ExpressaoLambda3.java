import java.util.Arrays;
import java.util.List;

public class ExpressaoLambda3 {
	public static void main(String[] args){
		//antes do Java 8
		List<String> lista1 = Arrays.asList(
				"Santa Catarina",
				"Parana",
				"Para",
				"Sao Paulo",
				"Rio de Janeiro",
				"Brasilia",
				"Ceara"
		);
		for (String s : lista1) {
			System.out.println(s);
		}

		//expressão lambda
		lista1.forEach(x -> System.out.println(x));

		//expressão lambda
		lista1.forEach(System.out::println);
	}
}