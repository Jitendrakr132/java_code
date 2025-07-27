import java.util.Scanner;

interface  client
{
    void input();
    void output();
}
class InterfaceQ implements client
{
    String name;
    double sal;

    public void input()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name ");
        name=s.nextLine();

        System.out.println("Enter the salary");

        sal=s.nextDouble();
    }
    public void output()
    {
        System.out.println(name+" "+sal);
    }
    
    public static void main(String[] args) {
        client d=new InterfaceQ();
         d.input();

         d.output();
    }
}
