package task1;

public class Inc_Dec_ex_1
{
    public static void main(String[] args)
    {
        int a = 10;
        a = a++ + a++ + a++;

        //Explanation
        //a = 10 + 11 + 12 -> total-> 33

        System.out.println(a);
    }
}
