class demo
{
    void area(int x)
    {
      System.out.println("Area of circle = "+(3.14*x*x));
    }
    void area(int x,int y)
    {
   System.out.println("Area of rectangle ="+(2*(x+y)));
    }
}
class myclass {
    public static void main(String[] args)
    {
       demo d=new demo();
       d.area(4);
       d.area(5, 6);
}
}