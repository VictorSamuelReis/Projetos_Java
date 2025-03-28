package Triangle;
import java.util.Scanner;
import java.util.Locale;
import Triangle.backTriangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		backTriangle x, y;
		x = new backTriangle();
		y = new backTriangle();
		
		System.out.println("Enter the measures of triangle x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle x area %.4f%n", areaX);
		System.out.printf("Triangle y area %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area x");
		}
		else {
			System.out.println("Larger area y");
		}
		
		sc.close();
	}

}
