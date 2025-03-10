package curso_java;
import java.util.Scanner;

public class atv5 {

	public static void main(String[] args) {
		
		System.out.println("Digite 4 numeros: ");
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, resultado;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		resultado = a * b - c * d;
		
		System.out.printf("O resultado é %d", resultado);

	}

}
