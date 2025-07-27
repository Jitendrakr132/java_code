public class trycatch_finally {
    public static void main(String[] args) {
        int a=10,b=0,c;

        try{
            c=a/b;
            System.out.println(c);
            System.out.println("Sittu");
          }
        catch(Exception e)
        {
            System.out.println("Can't device by zero ");
        }
        finally
        {
            System.out.println("Sub thik h bhai log");
        }
        System.out.println("main method ended");
    }
    
}
