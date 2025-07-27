class myfact
{

   int fact=1,num;

  void input(int x)
 {
  num=x;
  }
void confact()
{
for(int i=num;i>1;i--)
{
fact*=i;
}
System.out.println("Factorial is = "+fact);
}
}
 class Mymain
{
public static void main(String[] args)
{
 
 myfact m=new myfact();
 m.input(6);
m.confact();
}
}