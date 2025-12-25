package ex_01_Java_Basics;

public class Lab012_Literals_2
{
    public static void main(String[] args)
    {
        //1.Int Literal
        final int girl_age = 18;
        int age = 20;

        //2.Float Literal
        float pi = 3.14f;
        float pi2 = 3.14F;
        float x = 10.00f;

        //3.Boolean Literal
        boolean is_married = true;
        boolean is_married_amit = false;
        //boolean is_married_amit = 123;

        //4.String Literal
        String name = null;
        String name1 = "";
        char c_ = '0';
        //int a = null;

        //5.Null Literal


        //6.Char Literal
        char c1 = 'A';
        // A to Z, a-z, !@#$%^&*()_+
        // char c = "A"; String - "" - bunch of chars.
        char c2 = 'B';
        System.out.println(c2);          //output->B
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space

        // Escape Sequence
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("PramodDutta");
        System.out.println("Pramod"+new_line+"Dutta");
        System.out.println("Pramod\nDutta");
        System.out.println("Pramod"+tab_line+"Dutta");
        System.out.println("Pramod"+back_space+"Dutta");
        System.out.println("Pramod"+carriage_return+"Dutta");
        System.out.println( " ----- ");
        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");


        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65

        char ruppes = '₹';
        System.out.println(ruppes);


        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);

        char c11  = '\u1F60';


        int binary = 0b1010;
        int hex = 0xFF;
        long amount = 1_00_000L;    //we can use _ for presentation it won't print
        System.out.println(amount);

        // char A  = "10";
        char c = 'A'; // 65
        System.out.println(c);




        //Non - primitive literals
        String namee = "Pramod"; // String is a bunch of char.         //string
        int[] arrays_of_items = new int[10];                          //array

        char A_ = '0';
        System.out.println(A_);

    }
}
