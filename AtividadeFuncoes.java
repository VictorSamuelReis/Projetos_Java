package curso_java;
import java.util.Scanner;

public class atv_funcoes {

	public static void main(String[] args) {
		
		System.out.println("Digite 3 numeros: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		showResult(higher);

	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		}
		else if (y > x && y > z) {
			aux = y;
		} else {			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int valor) {
		System.out.println("Higher: " + valor);
	}
}
