import java.util.Scanner;

public class assendingOr {
    public static void main(String[] args) {
        
        int n,temp;
        int[] arr=new int[20];
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the number");
           n=s.nextInt();
           System.out.println("Enter the "+n+ "number");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
            if(arr[i]>arr[j])
            {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            }
            }
        }
        System.out.println("Assending order ");
        for(int i=0;i<n;i++)
        {
            System.out.println(+arr[i]);
        }
    }
    
}
