class Student
{
    int roll,marks;
    String name;
    void input()
    {
        System.out.println("Enter the name");
    }
}
class ankit extends Student
    {
        void disp()
        {
            roll=1;name="jitu";
            marks=40;

            System.out.println(roll+" "+name+" "+marks);
        }
    public static void main(String[] args)
    {
        ankit obj=new ankit();
        obj.input();
        obj.disp();
    }

}
