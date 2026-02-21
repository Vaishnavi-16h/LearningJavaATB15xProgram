package task1;

import java.util.Scanner;

public class Grade_Display
{
    public static void main(String[] args)
    {
//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69
//        F: 0-59

        Scanner s = new Scanner(System.in);
        System.out.print("Enter your score=");
        int score = s.nextInt();

        if(score>=90 && score<=100)
        {
            System.out.println("A Grade");
        }
        else if(score>=80 && score<=89)
        {
            System.out.println("B Grade");
        }
        else if(score>=70 && score<=79)
        {
            System.out.println("B Grade");
        }
        else if(score>=60 && score<=69)
        {
            System.out.println("B Grade");
        }
        else
        {
            System.out.println("Fail");
        }

    }
}
