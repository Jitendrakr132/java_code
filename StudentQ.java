import javax.swing.GroupLayout.ParallelGroup;
  //Q.4 Write a suitable program to implement the class diagrams. Take the help of constructors to
//assign the values.
 abstract class Student
 {
    String name;
    int roll;
    int vid;

    Student(String s,int r,int v)
    {
        name=s;
        roll=r;
        vid=v;
    }
     public abstract void getdetails();

    public abstract void getfees();

 }
 class UG extends Student
 {
    UG(String s,int r,int v)
    {
        super(s, r, v);
    }
        String course="B.tech";
        int  fee=70000;
        public void getdetails()
        {
            System.out.println("Student name "+name+ "Roll No "+roll+ "Student vid "+vid+ "Student Course "+course);
        }
        public void getfees()
        {
         System.out.println("Student fees "+fee);
        }
 }
 class PG extends Student
 {
    PG(String s,int r,int v)
    {
        super(s,r,v);
    }
    String course="M.tech";
    int fee=25000;
    public void getdetails()
        {
            System.out.println("Student name " +name+ "Roll No " +roll+ "Student vid " +vid+ "Student Course " +course);
        }
        public void getfees()
        {
         System.out.println("Student fees " +fee);
        }

 }
 class StudentQ {
    public static void main(String[] args) {
        PG p=new PG("jitu",28,45);
        p.getdetails();
        p.getfees();
        UG u=new UG("amit",67,89);
        u.getdetails();
        u.getfees();
        
    }
    
}
