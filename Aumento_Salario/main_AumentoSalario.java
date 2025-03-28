package Aumento_Salario;
import java.util.Locale;
import java.util.Scanner;

public class main_AumentoSalario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		backoff backoff = new backoff();
		
		System.out.print("Digite o seu nome: ");
		backoff.name = sc.next();
		System.out.print("Digite o seu salario: ");
		backoff.grossSalary = sc.nextDouble();
		System.out.print("Digite a taxa: ");
		backoff.tax = sc.nextDouble();
		
		System.out.printf("Employee: %s, $%.2f%n", backoff.name, backoff.netSalary());
		System.out.print("Which percentage to increase salary? ");
		double porcentagem = sc.nextDouble();
		System.out.printf("Updated data: %s, $%.2f%n", backoff.name, backoff.increaseSalary(porcentagem));
		
		sc.close();
	}

}
