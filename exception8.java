public class exception8 {
    public static void main(String[] args) {
      
           int[] arr={4,3,5,6,7,8,9};
        try{
            
            System.out.println(" "+arr[-1]);
            }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index out of bound Exception "+e);
        }
         int a=5;
         int b=0;
         int c=a/b;

         try
         {
            System.out.println("diviable by zero "+c);
         }
         catch(ArithmeticException e)
         {
            System.out.println(e);
         }
    }
    
}
