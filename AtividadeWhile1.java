package curso_java;
import java.util.Scanner;
import java.util.Locale;

public class atv_do_while {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		do {
			System.out.print("Digite a temperatura em celsios: ");
			double c = sc.nextDouble();
			double f = 9.0 * c / 5.0 + 32.0;
			
			System.out.printf("Equeivalente em fahrenheit: %.1f%n", f);
			System.out.print("DEseja continuar s/n? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n' && resp == 's');
		
		sc.close();

	}

}
