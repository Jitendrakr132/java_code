class A implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        System.out.println("I am in thread A " +i);
    }
}
public class threadinterface {
    public static void main(String[] args) {
        A a1=new A();
        Thread b1=new Thread(a1);
        b1.start();
    }
    
}
