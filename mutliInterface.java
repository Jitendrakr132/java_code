interface raj
{
    void add();

}
interface rahul extends raj
{
    void sub();
}
class Ankit implements rahul
{
    @Override
    public void add()
    {
        int a=10,b=20;
        System.out.println("sum is = "+(a+b));
    }
    @Override

    public void sub()
    {
        int x=30,y=10;

        System.out.println("Subtraction = "+(x-y));
    }
}
class mutliInterface {
    public static void main(String[] args) {
        
        rahul h=new rahul();
        h.add();
        h.sub();
    }
    
}
