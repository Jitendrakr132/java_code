import java.util.*;
public class vector_2 {

    public static void main(String[] args) {
        
        Vector v1=new Vector();
        v1.add(3);
        int n=args.length;
        
        v1.insertElementAt(2, 1);
         v1.addElement(5);

        for(int i=0;i<n;i++)
        {
            v1.addElement(args[i]);
        }
        System.out.println("Vector is "+v1);

    }
    
}
