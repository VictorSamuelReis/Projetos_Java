package Notas;

import java.util.Locale;
import java.util.Scanner;

public class main_Notas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		backoff bo = new backoff();
		
		System.out.print("Digite o seu nome: ");
		bo.name = sc.next();
		System.out.print("Digite a primeira nota: ");
		bo.nota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		bo.nota2 = sc.nextDouble();
		System.out.print("Digite a terceira nota: ");
		bo.nota3 = sc.nextDouble();
		
		System.out.println(bo);
		
		sc.close();

	}

}
