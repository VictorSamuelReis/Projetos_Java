package Aumento_Salario;

public class backoff {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public double increaseSalary(double percentage) {
		return ((10.0 / 100) * grossSalary) + netSalary();
	}
	
}
