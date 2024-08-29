package application;
 
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class EmployeeApp {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		Funcionario funcionario = new Funcionario();
		
		
		
		//pedindo nome do funcionario
		System.out.print("Name: ");
		funcionario.Name = sc.nextLine();
		//pedindo o salario bruto
		System.out.print("Gross salary: ");
		funcionario.GrossSalary = sc.nextDouble();
		//pedindo a taxa 
		System.out.print("Tax: ");
		funcionario.Tax = sc.nextDouble();
		
		System.out.println();
        System.out.println("Employee: " + funcionario);
		
		//dando aumento
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        funcionario.IncreaseSalary(percentage);
	
		
        System.out.println();
        System.out.println("Updated data: " + funcionario);
		sc.close();
	}
}
