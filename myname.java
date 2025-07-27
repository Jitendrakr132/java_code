class myclass
{
    void shape(int x)
    {
        System.out.println("Square of area "+(x*x));
    }
    void shape(int x,int y)
    {
        System.out.println("rectangle of area "+(x*y));
    }
    void shape(int x,int y,int z)
    {
        System.out.println("rectagular of area "+(x*y*z));
    }
}
public class myname {
    
    public static void main(String[] args) {
        myclass m=new myclass();
        m.shape(5);
        //m.shape(4,5);
        //m.shape(6,5 ,7 );

    }
}
