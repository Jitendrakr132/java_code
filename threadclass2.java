
class A extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("I am in Thread A " +i);
            if(i==2)
              stop();
        }
}
    
}
class B extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("I am in Thread B "+ i);

            if(i==3)
             Thread.yield();
        }
    }
}
class C extends Thread
{
    public void run()
    {
        for(int i =0;i<5;i++)
        { 
        System.out.println("I am in Thread C " +i);
        if(i==3)
        try{
            sleep(3000);
        }
        catch(Exception e)
        {

        }
        }
    }
}
class threadclass2
{
    public static void main(String[] args)
    {
        A a1=new A();
        B b1=new B();
        C c1=new C();
        a1.start();
        b1.start();
        c1.start();
        
    
    }
}