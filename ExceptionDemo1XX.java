import java.util.*;

class ExceptionDemo1XX
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int No1 = 0, No2 = 0, Ans = 0;

        try
        {

            System.out.println("Enter the first number : ");
            No1 = sobj.nextInt();

            System.out.println("Enter the second number : ");
            No2 = sobj.nextInt();

            Ans = No1 / No2;           // Exception prone code
        
        }

        catch(ArithmeticException aobj)
        {
            System.out.println("Exception occcured : "+aobj);
        }

        catch(Exception eobj)
        {
            System.out.println("Inside generic catch : "+eobj);
        }
        
        finally
        {
            System.out.println("Inside finally block");
        }
        
        System.out.println("Division is : "+Ans);   

        

    }
}