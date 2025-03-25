package curso_java;
import java.util.Scanner;
import java.util.Locale;

public class atv4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		System.out.println("Digite o valor do raio: ");
		Scanner sc = new Scanner(System.in);
		
		Double x =  3.14159, r, y, resultado;
		
		y = sc.nextDouble(); 
		
		r = Math.pow(y, 2);
		resultado = x * r;
		
		System.out.printf("O valor da area é %.4f", resultado);

	}

}
