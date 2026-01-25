package Switch;

public class Lab011_Interview
{
    public static void main(String[] args)
    {
        int a = 11;
        switch (-1)
        {
            default:
                System.out.println("Default");
                break;
            case -1:
                System.out.println("10");
                break;
            case 9:
                System.out.println("9");
                break;
        }
        //Here -1 will match to -1 directly so the output is 10
    }
}
