
class A extends Thread
{
    public void run()
    {
            System.out.println("I am in thread A ");
            System.out.println("Thread Id of thread A "+Thread.currentThread().getId());
            System.out.println("Priority of thread A "+Thread.currentThread().getPriority());
    }
}
class B extends Thread
{
    public void run()
    {
        System.out.println("Priority  of thread  B "+Thread.currentThread().getPriority());
    }
}
public class threadpriority {
    public static void main(String[] args) {
        A a1=new A();
        B b1 =new B();
        b1.setPriority(Thread.MIN_PRIORITY);
        a1.start();
        b1.start();
    }
    
}
