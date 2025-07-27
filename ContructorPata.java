class A
{
    int a;
    String name;
    double d;
    A(int x,String s,double f)
    {
        a=x;
        name=s;
        d=f;
    }
    void Show()
    {
        System.out.println(a+" "+name+" "+d);
    }
}

class ContructorPata 
{
    public static void main(String[] args) {
        
    A r=new A(101,"jitendra kumar",45.4);
     r.Show();
    }
    
}
