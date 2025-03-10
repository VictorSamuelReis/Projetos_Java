package curso_java;
import java.util.Scanner;
import java.util.Locale;


public class atv6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		System.out.println("Digite o número do funcionário, seu número de horas trabalhadas, o valor que recebe por hora");
		Scanner sc = new Scanner(System.in);
		
		int n, h;
		double v, valor;
		
		n = sc.nextInt();
		h = sc.nextInt();
		v = sc.nextDouble();
		
		valor = h * v;
		
		System.out.printf("NUMBER = %d \n"
				+ "SALARY = U$ %.2f", n, valor);

	}

}
