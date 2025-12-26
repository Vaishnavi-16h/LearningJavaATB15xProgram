package Operators;

public class Lab025_All_Operator
{
    public static void main(String[] args)
    {
        boolean b1 = true;
        int a = 10;
        int b = 20;

        System.out.println(a + b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);


        // Compound Assignment Operators
        int age = 10;
        //age +=10;   //  age = age  + 10           //20
        //age -=10;  // += -> age = age -10;        //0
        age /=10;   // += -> age = age /10;         //1
        System.out.println(age);


        // Optional to learn - Digital Electronics
        // Bitwise - Not important for Automation

        // ~ - Bitwise Not,
        // >> - Right shift,
        // << Left Shift,
        // ^ - XOR


    }
}
