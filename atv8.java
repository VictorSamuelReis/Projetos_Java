package curso_java;
import java.util.Scanner;
import java.util.Locale;

public class atv8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		System.out.println("Digite um valor para a, b e c: ");
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, areaTri, areaCir, areaTra, areaQua, areaRet;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		areaTri = (a * c)/ 2;
		areaCir = 3.14159 * Math.pow(c, 2);
		areaTra = ((a + b) * c)/2;
		areaQua = Math.pow(b, 2);
		areaRet = a * b;
		
		System.out.printf("TRIANGULO: %.3f  CIRCULO: %.3f  TRAPEZIO: %.3f  QUADRADO: %.3f  RETANGULO: %.3f", areaTri, areaCir, areaTra, areaQua, areaRet);
	}

}
