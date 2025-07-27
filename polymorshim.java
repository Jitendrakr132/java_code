public class polymorshim {

    void add()
    {
        int a=10,b=5,c;
        c=a+b;
        System.out.println("Addition is = "+c);
    }
    void add(int a,int b)
      {
        int c;
        c=a+b;
        System.out.println("Addition is  = "+c);
      }
      void add(int a,double b)
      {
        double c;
        c=a+b;
        System.out.println("Addition is = "+c);
      }

      public static void main (String[] args)
      {
        polymorshim ojb=new polymorshim();
        ojb.add();
        ojb.add(10,20);
        ojb.add(30, 45.50);
      }
    
}
