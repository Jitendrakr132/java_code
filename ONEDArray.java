 import java.util.*;
 class ONEDArray {
    public static void main(String[] args)
    {
        int[] arr=new int[5];

        Scanner in=new Scanner(System.in);
        System.out.println("Enter the  5 no of array");


        for(int i=0;i<5;i++)
        {
          arr[i]=in.nextInt();
        }

        for(int i=0;i<5;i++)
        {
            System.out.println("array element "+arr[i]);
        }
    }
    
}
