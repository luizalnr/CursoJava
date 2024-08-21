package entities;

public class Student {
	public String name;
	public Double grade1;
	public Double grade2;
	public Double grade3;
	public Double finalGrade;
	
	public double finalGrade() {
	    return grade1 * 0.3 + grade2 * 0.35 + grade3 * 0.35;
	}

	public double points() {
	    return 60.0 - finalGrade();
	}
	
	public void pass() {
	    double finalGrade = finalGrade();
	    System.out.printf("FINAL GRADE = %.2f%n", finalGrade);

	    if (finalGrade >= 60.0) {
	        System.out.println("PASS");
	    } else {
	        System.out.println("FAILED");
	        System.out.printf("MISSING %.2f POINTS%n", points());
	    }
	}
}
