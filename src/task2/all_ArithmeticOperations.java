package task2;

import java.util.Scanner;

public class all_ArithmeticOperations
{
    public static void main(String[] args)
    {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter first number: ");
                int num1 = sc.nextInt();
                System.out.print("Enter second number: ");
                int num2 = sc.nextInt();

                // Perform operations
                int sum = num1 + num2;
                int difference = num1 - num2;
                int multiplication = num1 * num2;
                int division = num1 / num2;

                System.out.println("Sum: " + sum);
                System.out.println("Difference: " + difference);
                System.out.println("Multiplication: " + multiplication);
                System.out.println("Division: " + division);

                sc.close();

    }
}
