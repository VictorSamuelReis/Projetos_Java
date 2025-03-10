package curso_java;
import java.util.Scanner;
import java.util.Locale;

public class Main2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Os dados digitados: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
		
		int a = 9;
		int b = 3;
		int c = 5;
		double A, B, C;
		
		A = Math.sqrt(a);
		B = Math.pow(3, 5);
		C = Math.abs(c);
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		
	}

}
