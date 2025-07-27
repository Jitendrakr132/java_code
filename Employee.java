class Emp
{
    String name,address;
    int age;
    Emp(String s,String a,int d)
    {
        name=s;
        address=a;
        age=d;
    }

    void display()
    {
        System.out.println("Emp_name "+name+" Emp_address "+address+" Emp_age "+age);
    }


}
class manager extends Emp
{
    String deprt;
    double salr;
    manager(String s,String a,int d,String de,double p)

    {
        super(s,a,d);
        deprt=de;
        salr=p;
    }

    void show()
    {
    
        System.out.println("Emp_name "+name+" Emp_address "+address+" Emp_age "+age+" Department "+deprt+" salary "+salr);
    }
}
class worker extends Emp
{
    int w_day;
    double d_sal;
    worker(String s,String a,int d,int w,double c)

    {
        super(s,a,d);
        w_day=w;
        d_sal=c;
    }

    void disp()
    {
        super.display();
        System.out.println("Emp_name "+name+" Emp_address "+address+" Emp_age "+age+" work day "+w_day+" total salary "+d_sal);
    }
    

}
public class Employee {
    public static void main(String[] args) {
        manager m=new manager("jitu", "bihar", 23, "BCA", 7400);
        worker r=new worker("sittu", "patna",25 , 30, 5600);
        m.show();
        r.disp();
    }
    
}
