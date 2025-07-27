class A 
{
    int a,b,pr;
    A(int x,int y)
    {
        a=x;
        b=y;
    }

    void display()
    {
        System.out.println("parameter is = "+2*(a+b));
    }
    // void parameter()
    // {
    //     System.out.println("parameter is = "+2*(a+b));
    // }
}
class B extends A
{
    int p;
    B(int x,int y,int z)
    {
        super(x, y);
        p=z;
    }
    void display()
    {
        
        super.display();
        System.out.println("volume is = "+(a*b*p));
    }
    // void valume()
    // {
    //     System.out.println("Valume is = "+(a*b*p));
    // }
}
class Gnsu
{
    public static void main(String[] args) {
        B f=new B(3, 4, 8);
        f.display();
        // f.parameter();
        // f.valume();
    }
}