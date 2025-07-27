import java.util.Scanner;

public class seriesA {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the term sum of series : ");
        int n=s.nextInt();
        System.out.print("Enter the base value : ");
        int x=s.nextInt();
            
        double nr=1,dr=1,term=0,sum=0;

        
        for(int i=0;i<n;i++)
        {
            term=nr/dr;
            sum=sum+term;
            nr=nr*x;
            dr=dr*i;
        }
        System.out.print("Sum of "+n+"term ="+sum);
    }
    
}
