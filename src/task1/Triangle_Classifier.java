package task1;

import java.util.Scanner;

public class Triangle_Classifier
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter side1=");
        int side1 = s.nextInt();
        System.out.print("Enter side2=");
        int side2 = s.nextInt();
        System.out.print("Enter side3=");
        int side3 = s.nextInt();

        if(side1==side2 && side1==side3)
        {
            System.out.println("Equilateral Triangle.");
        }
        else if(side1==side2 || side1==side3 || side2==side3)
        {
            System.out.println("Isosceles Triangle.");
        }
        else
        {
            System.out.println("Scalene Triangle.");
        }

    }
}
