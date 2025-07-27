import java.util.Scanner;
public class inputIn {

    int n1,n2;
    int add,sub,multi,div,rem;
    public static void main(String[] args)
    {
         inputIn obj=new inputIn();
         obj.input();
        obj.process();
         obj.show();
    }
    void input()
    {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the number");
        n1=r.nextInt();
        n2=r.nextInt();

    }

    void process()
    {
        add=n1+n2;
        sub=n1-n2;
        multi=n1*n2;
        div=n1/n2;
        rem=n1%n2;
    }
    void show()
    {
        System.out.println("Addition is = "+add);
        System.out.println("Subtracation is = "+sub);
        System.out.println("Multiply is = "+multi);
        System.out.println("Division is = "+div);
        System.out.println("Remaider is = "+rem);
    }
    
}
