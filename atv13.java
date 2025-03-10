package curso_java;
import java.util.Scanner;

public class atv13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 12, y = 2, a = 20, resul;
		double aa = (5 < 7) ? 10 :  5;;
		
		System.out.println(aa);
		
		x += y;
		a -= x;
		resul  = a;
		
		int b = sc.nextInt();
		
		switch(b) {
		case 1:
			System.out.println("opa");
			break;
		case 2: 
			System.out.println("oioi");
			break;
		case 3:
			System.out.println("Joia");
			break;
		case 4:
			System.out.println("tudo bem");
			break;
			
		default:
			System.out.println("nao");
			break;
		}
		
		System.out.println(resul);

	}

}
