package Arrayss;

public class Lab002_Arrays2
{
    public static void main(String[] args)
    {
        int[] marks = {1, 2, 3, 4, 5, 6};

        // 2nd way to create the array
        int[] mark2 = new int[5];
        int mark3[] = new int[5];   //Fixed Size


        String[] names = new String[3];
        names[0] = "pramod";
        names[1] = "Amit";
        names[2] = "Yasho";

        System.out.println(marks[0]); //1 will be output
        System.out.println(mark2[0]); //0 is default value (cause mark2 is not initialize)
                                      //Default val for int is 0
                                      //Default val for String is null
    }
}
