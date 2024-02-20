package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int soma = num1 + num2; 
		
		System.out.println("SOMA = " + soma);

		in.close();
	}

}
