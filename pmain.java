package P1;
class A 
{
    void display()
    {
        System.out.println("I am in non - public class A the object of this class is mode in subclass B");
    }
}
public class B extends A
{
    public void display()
    {
        System.out.println("I am in public class B which override the display method of class A ");
    
    System.out.println("Both classes A and B are in the same file");

    }
    public void creatobsubclass()
    {
        A a1=new A();
        a1.display();
    }
}
