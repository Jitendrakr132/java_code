class thread1 extends Thread 
{
    public void run()
    {
        System.out.println("thread A is running ");
        System.out.println("thread prarity "Thread.currentThread().getPriority());
    
    }
}
class Test2

{
    public static void main(String[] args)
    {
        thread1 r1=new thread1();
        int n=Thread.currentThread().setPriority(5);
        System.out.println(n);

        r1.start();
    }
}