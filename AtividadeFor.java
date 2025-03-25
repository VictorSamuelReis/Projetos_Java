package curso_java;
import java.util.Scanner;

public class atv_for {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int soma = 0;
		
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		
		System.out.println("A soma é " + soma);
		
		for (int x=0; x<soma; x++) {
			System.out.println("Somando... x=" + x);
		}
		
		for (int y=15; y>soma; y--) {
			System.out.println("Subtraindo... y=" + y);
		}
		
		sc.close();
	}

}
