package curso_java;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, soma;
		
		System.out.println("Digite dois numeros a serem somados: ");
		x = sc.nextInt();
		y = sc.nextInt();
		soma = x + y;
		
		System.out.printf("A soma dos dois numeros é %d", soma);

	}

}
