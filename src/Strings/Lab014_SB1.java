package Strings;

public class Lab014_SB1
{
    public static void main(String[] args)
    {
        //Here 1 string is created
        StringBuffer stringBuffer = new StringBuffer("Pramod");
        stringBuffer.append("Dutta");
        System.out.println(stringBuffer);


        //Here 2 string is created
        String s1 = "PRamod";
        s1 = s1+ "Dutta";
        System.out.println(s1);
    }
}
