import java.io.DataInputStream;

class myclass {
    int num,fact=1;
    myclass(int x)
    {
         num=x;
    }
    void Fact()
    {
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial is ="+fact);
    }
}
class factorial2
{
    public static void main(String[] args)
    {
        DataInputStream in=new DataInputStream(System.in);
        System.out.println("Enter the number");
        try
        {
        String h=in.readLine();
        int m=Integer.parseInt(h);

        myclass n=new myclass(m);
        n.Fact();
        }
         catch(Exception e)
         {
            
         }
    }
}
