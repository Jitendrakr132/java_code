import java.util.Scanner;
import java.util.Vector;

public class vector_1 {
    public static void main(String[] args) {
        // Create two vectors
        Vector<Object> vector1 = new Vector<>();
        Vector<Object> vector2 = new Vector<>();
        Scanner s=new Scanner(System.in);
        
        vector1.add(10);
        vector1.add(20);
        vector1.add(30.6);
        vector1.addElement(50);
        vector1.insertElementAt("jitu",2);


        System.out.println("Given index "+vector1.elementAt(2));
        System.out.println("Vector1: " + vector1);
        System.out.println("Vector1: Remove  " + vector1.remove(3));
        System.out.println("Remove element "+vector1.removeElement(10));
        System.out.println("List is size of "+vector1.size());
        System.out.println("Vector1: " + vector1);

        System.out.println("Enter the element Vector ");
      try{  for(int i=0;i<5;i++)
        { 
           
            int n=s.nextInt();
            vector2.add(n);
        }
    }
    catch(Exception e)
    {

    }
System.out.println("Vector 2 : "+vector2);
   /* int arrsize=vector2.size();

    String ar[]=new String[arrsize];

    vector2.copyInto(ar);

    for(int i=0;i<arrsize;i++)
    {
    System.out.println("Vector 2 is : "+ar[i]);*/
    }
}

