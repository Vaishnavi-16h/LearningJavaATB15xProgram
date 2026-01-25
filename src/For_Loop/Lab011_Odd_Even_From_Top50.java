package For_Loop;

public class Lab011_Odd_Even_From_Top50
{
    public static void main(String[] args)
    {
        // TO find the even numbers from 1 to 50

        for (int i = 1; i <= 50; i++)
        {
            //if (i % 2 == 0)even {
            if (i % 2 != 0)//odd
            {
              //System.out.println("Even => " + i);//Even
                System.out.println("Odd => " + i);//Odd
            }
        }
    }
}
