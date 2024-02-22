package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		int A, B, C, D;
		
		A = in.nextInt();
		B = in.nextInt();
		C = in.nextInt();
		D = in.nextInt(); 
		
		int diferenca = (A * B - C * D);
		
		System.out.println("DIFERENCA = " + diferenca);
		
		in.close();
	}

}
