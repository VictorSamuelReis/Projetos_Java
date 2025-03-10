package curso_java;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		
		System.out.println("Digite as horas: ");
		Scanner sc = new Scanner(System.in);
		
		int horas;
		
		horas = sc.nextInt();
		
		if (horas < 12) {
			System.out.println("Bom dia!");
		}
		
		else {
			if (horas >= 12 && horas < 18) {
				System.out.println("Boa tarde!");
			}
			
			else {
				System.out.println("Boa noite!");
			}
		}

	}

}
