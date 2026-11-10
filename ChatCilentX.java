import  java.io.*;
import  java.net.*;

class ChatCilentX
{
    public static void main(String A[])
    {
       
        try
        {
            Socket sobj = new Socket("localhost",5100);
            System.out.println("Client gets connected with server succesfully");

            PrintStream pobj = new PrintStream(sobj.getOutputStream());
            BufferedReader boj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
            BufferedReader boj2 = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Marvellous client is running");
            String str1 = null, str2 = null;
            System.out.println("Enter message for server : ");
            while(!(str1 = boj2.readLine()).equals("end"))
            {
                pobj.println(str1);
                str2 = boj1.readLine();
                System.out.println("Server says : "+str2);
                System.out.println("Enter message for server : ");
            }

            pobj.close();
            boj1.close();
            boj2.close();
            sobj.close();
        }

        catch(Exception eobj)
        {
            System.out.println("Exception occured as : "+eobj);
        }

    }
}