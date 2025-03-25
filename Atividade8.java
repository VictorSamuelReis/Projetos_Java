package curso_java;
import java.util.Scanner;

public class atv11 {

	public static void main(String[] args) {
		
		System.out.println("Digite dois numeros: ");
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x % y == 0 || y % x == 0) {
			System.out.println("Sao multiplos");
		}
		else {
			System.out.println("Nao sao multiplos");
		}

	}

}
