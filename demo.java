class A
{
    void input()
    {
        System.out.println("Hello");
    }
}
class B extends A
{
    void show()
    {
        System.out.println("Jitendra ");
    }
}
class C extends A
{
    void display()
    {
        System.out.println("Jittu ");
    }
}
class demo
{
    public static void main(String[] args)
    {
        B r=new B();
        C r1=new C();
        r.show();
        r.input();
        r1.input();
        r1.display();

    }
}