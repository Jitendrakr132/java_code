abstract class animal
{
    animal()
    {
        System.out.println("An animal -----");
    }
    public abstract void Sound();
}
class Dog extends animal
{
    Dog()
    {
        super();
    }
    public void Sound()
    {
        System.out.println("Dog is barking");
    }
}
class lion extends animal
{
    public void Sound()
    {
        System.out.println("lion is Loar");
    }
}
 
 class abstract_p {
    public static void main(String[] args)
    {
       Dog d=new Dog();
       lion l =new lion();
       l.Sound();
       d.Sound();
    }
    
}
