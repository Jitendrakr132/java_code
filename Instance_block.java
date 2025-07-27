class A {
    int a,b;
    A()
    {
        a=30; b=40;
        System.out.println("Constructor block "+a+" "+b+" " +(a+b));
    }
    {
        a=20; b=60;
        System.out.println("Instance block "+(a+b));
    }
   static
   {
    System.err.println("6");
   }
    
}
public class Instance_block {

    public static void main(String[] args) {
        A n=new A();
       
    }
}
