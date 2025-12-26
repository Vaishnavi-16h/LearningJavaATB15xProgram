package task;

public class Inc_Dec_ex_2
{
    public static void main(String[] args)
    {
        int a = 3;
        int b = a++ * ++a;

        //Explanation
        //b= 3 * 5 -> total -> 15

        System.out.println(b);

    }
}
