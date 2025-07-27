public class Thiskey {

    int a;
    Thiskey(int a)
    {
        this.a=a;
    }
    void show()
    {
        System.out.println(a);
    }

    public static void main(String[] args) {
        
        Thiskey f=new Thiskey(100);
        f.show();
    }
}
   /* void show()
    {
        System.out.println(this);
    }
    public static void main(String[] args) {
        Thiskey m=new Thiskey();
        System.out.println(m);
        m.show();
    }
    
} */

