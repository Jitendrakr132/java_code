import java.util.Scanner;
class Students
{
    public static void main(String[] args) {
        String str2;
        int[] mark=new int[3];
        int[] roll=new int[5];
        String[] str=new String[5];
        Scanner f=new Scanner(System.in);

        System.out.println("Enter the 5 Students names");
        for(int n=0;n<5;n++)
        {
            str[n]=f.nextLine();
        }
          
        System.out.println("Enter the 5 Students Roll no ");
        for(int j=0;j<5;j++)
        {
            roll[j]=f.nextInt();
        }

        System.out.println("Enter the 3 Subjects marks");
        for(int m=0;m<3;m++)
        {
        mark[m]=f.nextInt();
        }

        System.out.println("Find roll number");
        int r=f.nextInt();
        boolean found=false;
        for(int l=0;l<5;l++)
        {
            if(roll[l]==r)
            {
                System.out.println("roll no "+roll[l]);
                found=true;
                break;
            }
        }
        if(!found)
        {
            System.out.println("Roll no is not found");
        }

        System.out.println("Find the name ");
         str2=f.nextLine();
        boolean nfound=false;

        for(int k=0;k<5;k++)
        {
            if(str[k].equals(str2))
            {
                System.out.println("Student name "+str[k]);
                nfound=true;
                break;
            }
        }
        if(!nfound)
        {
            System.out.println("Name is not found");
        }
       
        }
       
}
