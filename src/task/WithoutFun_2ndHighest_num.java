package task;

public class WithoutFun_2ndHighest_num
{
    public static void main(String[] args)
    {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};     //100,34    //34


        int high = 0;
        int sechigh = numbers[0];

        for (int i = 1; i < numbers.length; i++)
        {
            if (numbers[i] > high)
            {
                sechigh = high;
                high = numbers[i];
            }
            else if (numbers[i] > sechigh && numbers[i] != high)
            {
                sechigh = numbers[i];
            }
        }
        System.out.println("Second highest number in array : " + sechigh);
    }
}