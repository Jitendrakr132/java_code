public class NPE {
    public static void main(String[] args) {
        String str="jitu";
        String str1="ankit";
     try
        {
            int a=Integer.parseInt(str1);
           System.out.println(a);
           //System.out.println(str.toUpperCase());
        }
        catch(NumberFormatException e)
        {
            System.out.println(" "+str1);
        }
    }
    
}
