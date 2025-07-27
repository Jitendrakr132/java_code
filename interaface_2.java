interface constant
 {
    public float pi=3.14f;
}
interface methodes
{
    public void arearcircle();
    public void arearectangle();
}
class myclass implements constant,methodes
{
    int a,b;
    myclass(int x,int y)
    {
      a=x;
      b=y;
    }
   public void arearcircle()
    {
        System.out.println("Area of circle "+(pi*a*a));
    }
    public void arearectangle()
    {
        System.out.println("Area of rectangle"+(a*b));
    }
}
public class interaface_2 {
    public static void main(String[] args) {
        myclass obj=new myclass(4, 6);
        obj.arearcircle();
        obj.arearectangle();
    }
    
}
