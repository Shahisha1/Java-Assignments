import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char ch = scanner.next().charAt(0);

        if (ch == '+') {
            System.out.println("Result: " + (a + b));
        } else if (ch == '-') {
            System.out.println("Result: " + (a - b));
        } else if (ch == '*') {
            System.out.println("Result: " + (a * b));
        } else if (ch == '/') {
            if (b != 0) {
                System.out.println("Result: " + (a / b));
            } else {
                System.out.println("Error: division by zero.");
            }
        } else {
            System.out.println("Invalid operator.");
        }
    }
}
