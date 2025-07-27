public class exception_5 {
    public static void main(String[] args) {
        try

        {
            int a=20,b=0,c;

            c=a/b;

            System.out.println(c);
            System.out.println("division ");
        }
        catch(ArithmeticException a)
        {
            System.out.println("can't device by zero ");
        }
        finally
        {
            System.out.println("jitendra ");
        }
        System.out.println("main methode ended ");
    }
    
}
