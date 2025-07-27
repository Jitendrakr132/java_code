 class myException extends Exception
{
    myException(String mgs)
    {
        System.out.println(mgs);
    }
}
class exception_6 
 {
  public static void main(String[] args) {
    try
    {
        show();
    }
    catch(Exception e)
    {
        
    }
}
   public static void show() throws myException
   {
    throw new myException("Honesty is not good police ");
   }
      
}
