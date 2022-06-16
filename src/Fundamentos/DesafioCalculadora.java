package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.print("First number:");
        double firstNumber = entry.nextDouble();

        System.out.print("Second number:");
        double secondNumber = entry.nextDouble();

        System.out.print("Operation:");
        String operation = entry.next();

        double result  = "+".equals(operation) ? firstNumber + secondNumber : 0;
        result = "-".equals(operation) ? firstNumber - secondNumber : result;
        result = "*".equals(operation) ? firstNumber * secondNumber : result;
        result = "/".equals(operation) ? firstNumber / secondNumber : result;
        result = "%".equals(operation) ? firstNumber % secondNumber : result;

        System.out.printf("%.2f %s %.2f = %.2f", firstNumber, operation, secondNumber, result);
        entry.close();
    }
}
