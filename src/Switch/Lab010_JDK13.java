package Switch;

public class Lab010_JDK13
{
    public static void main(String[] args)
    {
        int itemcode = 006;
        switch (itemcode)
        {
            //Mulitple cases or condition
            case 001,002,005:
                System.out.println("All of the them are Electronic Gadget");
                break;
            case 004,006,007:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");
        }

    }
}
