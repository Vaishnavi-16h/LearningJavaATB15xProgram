package task1;

public class Nested_Ternary_eg1
{
    public static void main(String[] args)
    {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;
        System.out.println("MAX OUT OF THREE");

        //int result = (n1 > n2) ? n1 : (n2 > n3) ? n2 : n3; //wrong 5 3 10...use this and try it will wrong
        int result = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
        System.out.println("Result="+result);

    }
}
