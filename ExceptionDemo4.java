import java.util.*;

class AgeException extends Exception
{
    AgeException(String str)
    {
        super(str);
    }
}

class ExceptionDemo4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Age = 0;

        System.out.println("Enter your age : ");
        Age = sobj.nextInt();

        try
        {
            if(Age < 18)
            {
                throw new AgeException("You are Under age");
            }
            else 
            {
                System.out.println("Welcome to the -----");
            }
        }

        catch(AgeException aobj)
        {
            System.out.println("Exception occured due to age : ");
        }
    }
}