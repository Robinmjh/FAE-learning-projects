import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Creates the input tool
        System.out.println("Simple Java Console Calculator");

        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble(); //creates actual Input
        
        // Validate Operator  
        boolean validOperator = false;
        char operator = ' ';
        while (!validOperator) {
            System.out.println("Enter an Operator (+, -, *, /): ");
            operator = scanner.next().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                validOperator = true; //Exit loop if valid
            } else {
                System.out.println("Invalid Operator. Please try again."); //Loop repeats, ask again
            }
        }

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    scanner.close();
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid Operator.");
                scanner.close();
                return;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}