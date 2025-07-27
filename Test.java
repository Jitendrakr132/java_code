class A {
    int a,b,c;

    void Add()
    {
        a=10;b=20;
        c=a+b;
        System.out.println("Sum is = "+c);
    }
    void Sub()
    {
        a=30;b=20;
        c=a-b;
        System.out.println("Subtraction is = "+c);
    }
}
class B extends A
{
    void multi()
    {
        a=30; b=3;
        c=a*b;
        System.out.println("Multiply is ="+c);
    }

    void div()
    {
        a=50;b=5;
        c=a/b;
        System.out.println("Division is = "+c);
    }
}
class C extends B
{
    void rem()
    {
        a=20;b=3;
        c=a%b;
        System.out.println("Remaider is = "+c);
    }
}
class Test
{
    public static void main(String[] args)
    {
        C obj=new C();
        obj.rem();
        obj.Add();
        obj.Sub();
        obj.div();
        obj.multi();
    }
}
