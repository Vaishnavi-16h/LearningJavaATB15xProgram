package task;

import java.util.Scanner;

public class ReverseString_withoutFun
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string=");
        String inp = scanner.next();

        String rev="";
        for(int i=0 ; i<inp.length() ; i++)
        {
            rev= inp.charAt(i) + rev;
        }
        System.out.println(rev);


//        StringBuilder reversedStr = new StringBuilder();
//        for(int i= inp.length()-1; i>=0;i--)
//        {
//            reversedStr=reversedStr.append(inp.charAt(i));
//        }
//        System.out.println(reversedStr);


    }
}
