abstract class programming{
    public abstract void Developer();
    public abstract void Rank();
}
class HTML extends programming
{
    @Override
    public void Developer()
    {
        System.out.println("Tim bernerse lee");
    }
    public void Rank()
    {
        System.out.println("3 rd");
    }
}
class java extends programming
{      
    @Override
    public void Developer()
    {
        System.out.println("Gems");
    }
    public void Rank()
   {
    System.out.println("1st");
   }
}
public class Abtract {
    public static void main(String[] args) {
        java j=new java();
        j.Developer();
        j.Rank();
        HTML h=new HTML();
        h.Developer();
        h.Rank();
    }
    
}
