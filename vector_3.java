import java.util.*;
public class vector_3 {
    public static void main(String[] args) {
        
        Vector v1=new Vector();
        
        int x=args.length;

        try
        {
          for(int i=0;i<=x;i++)
          {
            v1.addElement(args[i]);
          }
            if(v1=="donkey")
            {
                System.out.println("Donket is not pet animal");
            }
          
        }
        catch(Exception e)
        {

        }

        System.out.println("Vector is are "+v1);
    }
    
}
