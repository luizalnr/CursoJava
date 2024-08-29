package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class SchoolApp {
	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Student: ");
        student.name = sc.nextLine();
        System.out.print("First semester grade: ");
        student.grade1 = sc.nextDouble();
        System.out.print("Second semester grade: ");
        student.grade2 = sc.nextDouble();
        System.out.print("Third semester grade: ");
        student.grade3 = sc.nextDouble();

        student.pass();
        
        sc.close();
    }
}