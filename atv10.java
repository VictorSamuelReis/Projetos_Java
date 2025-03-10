package curso_java;
import java.util.Scanner;

public class atv10 {

	public static void main(String[] args) {
		
		System.out.println("Digite um numero: ");
		Scanner sc = new Scanner(System.in);
		
		int x, resto;
		
		x = sc.nextInt();
		
		resto = x % 2;
		
		if(resto == 0)
		{
			System.out.println("O numero " + x + " é par");
		}
		else {
			System.out.println("O numero " + x + " é impar");
		}
	}

}
