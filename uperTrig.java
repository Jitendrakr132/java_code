import java.util.Scanner;

public class uperTrig {
    public static void main(String[] args) {
         int[][] a=new int[5][5];
         Scanner in= new Scanner(System.in);

         System.out.println("Enter the matrix ");

         for(int i=0;i<2;i++)
         {
            for(int j=0;j<2;j++)
            {
                a[i][j]=in.nextInt();
            }

        }
        for(int i=0;i<2;i++)
         {
            for(int j=0;j<2;j++)
            {
                a[1][0]=0;
                System.out.print(+a[i][j]+" ");

            }
            System.out.println();
    }
    
 }
}
