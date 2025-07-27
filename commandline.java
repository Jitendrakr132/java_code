 class commandline {

    public static void main(String args[])
    {
        int count=0,i=0;
        String S;
        count=args.length;
        System.out.println("Total Argruments in the commandLine ="+count);
        System.out.println("The Arguments are");

        while (i<count)
         {
         S=args[i];
         i=i+1;
         System.out.println(S);   
        }
    }  
}
