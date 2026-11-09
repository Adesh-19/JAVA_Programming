import java.util.*;

class Selection1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int No = 0;

        System.out.println("Enter the number : ");
        No = sobj.nextInt();

        if((No % 2) == 0)
        {
            System.out.println("The Number is Even");
        }

        else
        {
            System.out.println("The Number id Odd");
        }

    }
}