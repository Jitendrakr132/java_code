class bird
{
    String beak="yes";
    String feather="yes";
}
class fly_bird extends bird
{
  void fly()
  {
    System.out.println("Flying Bird having Beak " +beak+ " feather " +feather);
    System.out.println("Flying Bird can Fly");
  }
}
class Nonfly_bird extends bird
{

 void fly()
    {
        System.out.println("Non Flying Bird having Beak"+beak+ "feather no");
        System.out.println("Non Flying Bird can't fly");
    }
}
class Crow extends fly_bird
{
  String black="yes";
  
  void disp()
  {
    
  System.out.println("Crow is a Flying Bird  color black "+black);
  }
}

class sparrow extends fly_bird
{
    String grey="yes";
   
    void show()
    {
        
    System.out.println("Sparrow is a Non Flying Bird color grey  "+grey);
    }

}
public class Gusu_in {
    public static void main(String[] args) {
        Crow c=new Crow();
        c.fly();
        c.disp();
        sparrow s=new sparrow();
        s.fly();
        s.show();

    }
    
}
