package curso_java;
import java.util.Scanner;
import java.util.Locale;

public class atv7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		System.out.println("DIgite o codigo, a quantidade e o preço de duas peças abaixo: ");
		Scanner sc = new Scanner(System.in);
		
		int cod1, qt1, cod2, qt2;
		double prc1, prc2, valor;
		
		cod1 = sc.nextInt();
		qt1 = sc.nextInt();
		prc1 = sc.nextDouble();
		cod2 = sc.nextInt();
		qt2 = sc.nextInt();
		prc2 = sc.nextDouble();
		
		valor = qt1 * prc1 + qt2 * prc2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valor);

	}

}
