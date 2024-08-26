package entities;

public class Funcionario {
	public String Name;
	public double GrossSalary;
	public double Tax;
	
	public double NetSalary() { //salario liquido
		return GrossSalary - Tax;
	}
	
	public void IncreaseSalary(double percentage) { //aumento de salario
		GrossSalary += GrossSalary * (percentage / 100.0);
	}
	
	public String toString() {
        return Name 
            + ", $" 
            + String.format("%.2f", NetSalary());
    }
}
