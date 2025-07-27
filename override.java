class shape
{
    void draw()
    {
        System.out.println("Can't say shape image");
    }
}
class square extends shape
{
    void draw()
    {
        super.draw();
        System.out.println("Square shape");
    }
}
public class override {
    public static void main(String[] args)
    {
       square a=new square();
       a.draw();
       a.draw();
    }
    
}
