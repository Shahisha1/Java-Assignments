import java.util.Scanner;

public class Converter {
    static final double Factor = 9.0 / 5.0;
    static final double num = 32;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * Factor) + num;

        System.out.println("Celsius:    " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
    }
}
