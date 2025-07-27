import java.util.*;
import java.lang.*;
import java.io.*;
class NomatchException extends Exception
{
    NomatchException(String mgs)
    {
        System.out.println(mgs);
    }
}
class Exception_7 
{
    public static void main(String[] args) {
        
        String n="God is great ";
          String message;

        Scanner in=new Scanner(System.in);

        try{
            System.out.println("Enter the input ");

            String n1=in.nextLine();

            if(n.equals(n1))
            {
                System.out.println("Corrent input ");
            }
            else
            {
              message="Wrong input";
            }

            throw new NomatchException(message);
        }
        catch(Exception e)
        {

        }
    }
}
