class F {
      int x;
    void setdata(int a)
    {
       x=a;
    }
    int getdata()
    {
        return x;
    }
}
public class Encaps {
    public static void main(String[] args) {
        F n=new F();
        n.setdata(6);
        System.out.println(n.getdata());
    }
    
}
