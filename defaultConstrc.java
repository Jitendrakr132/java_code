class a{
    int a;
    String b; 
    boolean c;
     a() // Default Constructor
     {
       a=100;
       b="jitendra";
       c=true;
     }
     void show()
     {
        System.out.println(a+" "+b+" "+c);
     }
}
class defaultConstrc {
    public static void main(String[] args) {
        a r=new a();
        r.show();

    }
}
