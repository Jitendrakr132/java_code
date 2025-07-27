interface Fish {
        public  String fins="yes";
        public void canswim();    
} 
 interface Mammal
  {
    public String Lunbs="yes";
}
class Whale implements Fish,Mammal
{
    
  public void canswim()
    {
        System.out.println("Fish "+fins+" "+ "Lungs   "+Lunbs);
        System.out.println("Whale  can swim ");
    }

}

public class GnsuInheritance {
    public static void main(String[] args) {
        Whale a=new Whale();
        a.canswim();
        
    }
    
}
