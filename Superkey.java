
class D 
{
    void show()
    {
        System.out.println("Super class");
    }
}
class B extends D
{
    void disp()
    {
        super.show();
        System.out.println("Child class");
    }
}
public class Superkey {
    public static void main(String[] args) {
        B s=new B();
        s.disp();
    }
    
}
