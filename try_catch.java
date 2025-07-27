public class try_catch {
    public static void main(String[] args) {
        int a=10,b=0,c;

        try
        {
            c=a/b;

            System.out.println("Sum is "+c);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Main method is runn");
    }
    
}
