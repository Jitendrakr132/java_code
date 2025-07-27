public class exception_3 {
    public static void main(String[] args) {
        String str=null;

        try{
            System.out.println(str.toUpperCase());
        }
        catch(NullPointerException e)
        {
            System.out.println("NUll can't be casted");
        }
    }
    
}
