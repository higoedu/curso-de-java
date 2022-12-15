/*
Faça um progrma que imprima a frase:
"Seja bem-vindo ao meu programa!"
Em seguida, imprima uma linha em branco e na seguência,
imprima as frases e o resultado da expressão matemática.

Cada frase e seu resultado devem estar na mesma linha
	"O produto de 8 por 90 é igual a:"
	"O quociente de 90 por 30 é igual a:"
	"O quadrado de 9 é:"

Notas(s):
1) Em cada expressão matemática,
você deve imprimir o resultado de uma expressão na qual o compilador é quem resolveu.
Ou seja, é para concatenar a frase sugerida no enunciado com o resultado.
*/
public class ExercicioImprindoTextosNumeros {
	public static void main(String[] args){
		System.out.println("Seja bem-vindo ao meu programa!");
		System.out.println();
		System.out.println("O produto de 8 por 90 é igual a: " + 8 * 90);
		System.out.println("O quociente de 90 por 30 é igual a: " + 90 / 30);
		System.out.println("O quadrado de 9 é: " + 9 * 9);
	}
}