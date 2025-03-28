package Notas;

public class backoff {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public String toString() {
		double total = nota1 + nota2 + nota3;
		if (total >= 60 && total <= 100) {
			return "FINAL GRADE = " + String.format("%.2f%n", total) + "PASS";
		}
		else if (total >= 0 && total < 60) {
			double pontos_faltantes = 60 - total;
			return "FINAL GRADE = " + String.format("%.2f%n", total) + "FAILED\n"	+ "MISSING " + String.format("%.2f%n", pontos_faltantes) + "to pass";
		}
		else {
			return "Valor da nota invalido";
		}
	}
	
}
