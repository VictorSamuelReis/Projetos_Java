package curso_java;
import java.util.Scanner;

public class atv9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		x = sc.nextInt();
		
		if (x >= 0) {
			System.out.println("O numero é positivo");
		}
		else {
			System.out.println("O numero é negativo");
		}

	}

}
