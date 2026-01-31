package Strings;

public class Lab017_SB4
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);

        sb.replace(0, 4, "C++");
        System.out.println(sb);

    }
}
