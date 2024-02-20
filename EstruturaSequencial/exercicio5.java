package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner (System.in);

		int peca1, numpeca1, peca2, numpeca2;
		double valorpeca1, valorpeca2;
		
		peca1 = in.nextInt();
		numpeca1 = in.nextInt();
		valorpeca1 = in.nextDouble();
		peca2 = in.nextInt();
		numpeca2 = in.nextInt();
		valorpeca2 = in.nextDouble();
		
		double total = ((numpeca1 * valorpeca1) + (numpeca2 * valorpeca2));
		
		System.out.printf("VALOR A PAGAR = %.2f%n" , total);
		in.close();

	}

}
