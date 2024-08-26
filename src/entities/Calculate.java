package entities;

public class Calculate {

    double number1, number2, result;

    public double operation(double number1, double number2, int operation) {
        switch (operation) {
            case 1: 
                result = number1 + number2;
                System.out.println("Addition performed");
                break;
            case 2: 
                result = number1 - number2;
                System.out.println("Subtraction performed");
                break;
            case 3: 
                result = number1 * number2;
                System.out.println("Multiplication performed");
                break;
            case 4: 
                result = number1 / number2;
                System.out.println("Division performed");
                break;
            default:
                System.out.println("Invalid operation number.");
        }
        return result;
    }
}

