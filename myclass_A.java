abstract class A 
{
    int x;
    void input(int x1)
    {
        x=x1;
    }
    abstract void display();
    abstract void mydisplay();
}
abstract class B extends A
{
    
    public void display()
    {
        System.out.println("Hello jitendra ");
    }

}

class D extends B
{
    
    void mydisplay()
    {
    System.out.println("Hello");
    }
}
 class myclass_A {
    public static void main(String[] args) {
        D d1=new D();
        d1.input(6);
        d1.display();
        d1.mydisplay();
    }
    
}
