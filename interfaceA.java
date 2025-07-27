class myclass
{
    int l,b,r;
    myclass(int a,int d,int c)
    {
        l=a;
        b=d;
        r=c;
    }
    void Area(int r)
    {
        System.out.println("Area of circle "+(r*r));
    }
    void Area(int l,int b)
    {
        System.out.println("Area is rectangle "+(l*b));
    }
}
class interfaceA
{
    public static void main(String[] args) {
        myclass m=new myclass(5, 4, 7);
        m.Area(5);
        m.Area(6, 8);
    }
}