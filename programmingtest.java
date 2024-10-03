import java.util.Scanner;

public class programmingtest {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int num1, num2;

    System.out.print("Enter first number: ");
    num1 = scanner.nextInt();

    System.out.print("Enter second number: ");
    num2 = scanner.nextInt();

    System.out.println("Select an operation: ");
    System.out.println("1. Addition (+) ");
    System.out.println("2. Subtraction (-) ");

    int choice = scanner.nextInt();
    double result;

    switch (choice) {
        case 1:
        result = num1 + num2;
        System.out.println("Your result is: " + num1 + " + " + num2 + " = " + result);
        break;
        case 2:
        result = num1 - num2;
        System.out.println("Your result is: " + num1 + " - " + num2 + " = " + result);
        break;
        default:
        System.out.println("Invalid operation selected.");
        break;
    }
    scanner.close();
}



}