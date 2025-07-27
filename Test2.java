import java.lang.*;

class myException extends Exception
{
    myException(String mgs)
    {
        System.out.println(mgs);
    }
}
public class Test2
{
    public static void main(String[] args) 
    {
     
        try
        {
            show();
        }

        catch(Exception e)
        {

        }
        public static void show() throws myException
        {
            throw new myException("jitendra kumar");
        }
    }
}