package ProjectLogin;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			String nome = "romario";
			String senha = "123";
			
			System.out.print(" Digite seu Nome: ");
			String nome2 = scanner.nextLine();

			System.out.print(" Digite sua Senha: ");
			String senha2 = scanner.nextLine();

			if (nome.equals(nome2) && senha.equals(senha2)) {
				System.out.println(" Logado com sucesso ");
			} else {
				System.out.println(" Login Invalido ");
			}

		}
	}
}
