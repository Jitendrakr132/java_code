import java.util.Scanner;

class myclass
{
    int count=0,rem;
    void find_digit(int num,int digit)
    {
        while(num>0)
        {
            rem=num%10;
            if(rem==digit)
            {
                count+=1;
            }
            num=num/10;
        }
        System.out.println("Occurance is = "+count);
    }
}

class occurance {
    public static void main(String[] args) {
        int n,dig;
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the Number ");
        n=s.nextInt();

        System.out.println("Enter the Digit ");

        dig=s.nextInt();

        myclass m=new myclass();
        m.find_digit(n, dig);
    }
    
}
