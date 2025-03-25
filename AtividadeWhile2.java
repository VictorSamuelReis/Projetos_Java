package curso_java;

import java.util.Scanner;

public class atv_while {

	public static void main(String[] args) {
		
		System.out.println("Digite um numero: ");
		Scanner sc = new Scanner(System.in);

		int valor = sc.nextInt();
		int soma = 0;

		if (valor != 0) {

			while (valor != 0) {
				soma += valor;
				System.out.println("Digite um numero: ");
				valor = sc.nextInt();

				if (valor == 0) {
					System.out.println("O valor é 0");
					System.out.println(soma);
				} 
				
				if (valor == 2) {
					System.out.println(soma);
					break;
				}
			}
		}
		sc.close();

	}

}
