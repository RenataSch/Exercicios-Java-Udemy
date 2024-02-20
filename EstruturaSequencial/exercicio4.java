package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner (System.in);

		int num, numhoras;
		double valorhora;
		
		num = in.nextInt();
		numhoras = in.nextInt();
		valorhora = in.nextDouble();
		
		double salario = numhoras * valorhora;
		
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = %.2f%n", salario);
		in.close();
	}

}
