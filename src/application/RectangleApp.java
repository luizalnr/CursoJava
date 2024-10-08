package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class RectangleApp {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println("AREA = " + rectangle.area());
		System.out.println("PERIMETER = " + rectangle.perimetro());
		System.out.println("DIAGONAL = " + rectangle.diagonal());
		
		
		sc.close();
	}

}
