import java.io.*;
public class campar {
       public static void main(String[] args)
       {
           DataInputStream S=new DataInputStream(System.in);
   
           int x,y,z;
           try
           {
               System.out.print("Enter the number :");
               String x1=S.readLine();
               x=Integer.parseInt(x1);
               System.out.print("Enter the number");
               String x2=S.readLine();
                 y=Integer.parseInt(x2);
   
               z=x>y?1:0;
               if(z==1)
               System.out.println("x is largest");
               else
               System.out.print("y is largest");
           }
           catch(Exception e)
          {
   
          }    
   }
   }

