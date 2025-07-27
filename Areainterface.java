interface cal {
    public float pi=3.14f;
    
} 
interface Area
{
      
    public  void areaC();
    public void areaR(); 
}
class myclass implements cal,Area
{
    int x,y,r;
    myclass(int x1,int y1,int r1)
    {
        x=x1;
        y=y1;
        r=r1;
    }
    public void areaC()
    {
        System.out.println(("ARea of circle "+(pi*x*x)));
    }
    public void areaR(){
        System.out.println("ARea of rectangle "+(x*y));
    }
}
public class Areainterface {
    public static void main(String[] args) {
        myclass c=new myclass(5, 6, 2);
        c.areaC();
        c.areaR();

    }
    
}
