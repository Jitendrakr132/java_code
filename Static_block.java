public class Static_block {
    public static void main(String[] args) {
        
        Static_block d=new Static_block();

    }
    Static_block()
    {
        System.out.println("Contructor");
    }
    {
        System.out.println("Instance block");
    }

    static{
        System.out.println("Static block");
    }
    
}
