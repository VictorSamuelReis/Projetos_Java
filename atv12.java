package curso_java;
import java.util.Scanner;

public class atv12 {

	public static void main(String[] args) {
		
		System.out.println("Digite a hora inicial e a hora final de um jogo: ");
		Scanner sc = new Scanner(System.in);
		
		int hora_inicial, hora_final, duracao;
		
		hora_inicial = sc.nextInt();
		hora_final = sc.nextInt();
		
		if(hora_inicial < hora_final) {
			duracao = hora_final - hora_inicial;
		}
		else {
			duracao = 24 - hora_inicial + hora_final;
		}
		
		System.out.println("A duracao do jogo é " + duracao);

	}

}
