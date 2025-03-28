package Rectangle;
import java.util.Scanner;
import java.util.Locale;

public class main_rectangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		backoff backoff = new backoff();
		
		System.out.print("Digite a largura: ");
		backoff.width = sc.nextDouble();
		System.out.print("Digite a altura: ");
		backoff.height = sc.nextDouble();
		
		double area = backoff.area();
		double perimetro = backoff.perimeter();
		double diagonal = backoff.diagonal();
		
		System.out.printf("Area: %.2f%n", area);
		System.out.printf("Perimetro: %.2f%n", perimetro);
		System.out.printf("Diagonal: %.2f%n", diagonal);
		
		sc.close();
	}

}
