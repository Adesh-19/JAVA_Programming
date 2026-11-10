import  java.io.*;
import  java.net.*;

class ChatServerX
{
    public static void main(String A[])
    {
       try
       {
            ServerSocket ssobj = new ServerSocket(5100);
            System.out.println("Server is running at port 5100");
            Socket sobj = ssobj.accept();
            System.out.println("Client request gets accepted succesfully");

            PrintStream pobj = new PrintStream(sobj.getOutputStream());
            BufferedReader boj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
            BufferedReader boj2 = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Marvellous server is running");
            String str1 = null, str2 = null;

            while((str1 = boj1.readLine()) != null)
            {
                System.out.println("Client says : "+str1);
                System.out.println("Enter message for client : ");
                str2 = boj2.readLine();
                pobj.println(str2);
            }

            pobj.close();
            boj1.close();
            boj2.close();
            sobj.close();
            ssobj.close();
       }

       catch(Exception eobj)
       {
            System.out.println("Exception occured as : "+eobj);
       }
    }
}