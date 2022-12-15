import java.util.Scanner;

/*
Desenvolva um pequeno programa de login e senha.
Para isso, peça ao usuário para digitar o seu login e armazene o que o usuário digitou em uma variável.
Em seguida, peça para o usuário digitar a sua senha e armazene em uma outra variável.
Por fim, verifique se o login e a senha são iguais àquele definido por você

Dica(s):
1) Você pode utilizar para login o seu nome e para a sua senha o seu CPF
*/
public class ExercicioLoginSenha {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		System.out.println("login: ");
		String login = entrada.nextLine();

		System.out.println("senha: ");
		String senha = entrada.nextLine();

		if(login.equals("programar") && senha.equals("123"))
			System.out.println("Usuário " + login + " logado com sucesso");
		else
			System.out.println("login ou senha inválidos!");
	}
}