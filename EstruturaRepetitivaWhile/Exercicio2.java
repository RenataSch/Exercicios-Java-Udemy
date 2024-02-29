package EstruturaRepetitivaWhile;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int senha;
		
		System.out.println("Digite a senha de quatro dígitos:");
		senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Incorreta");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		

	}

}
