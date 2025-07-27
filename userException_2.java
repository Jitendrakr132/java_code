class InvalidageException extends Exception
{
    InvalidageException(String mgs)
    {
        System.out.println(mgs);
    }
}
class userException_2
{
    public static void main(String[] args) {
        try
        {
            vote(12);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
    public static void vote(int age) throws InvalidageException
    {
       if(age<18)
       {
        throw new InvalidageException("Not eligiable for voting");
       }
       else
       {
        System.out.println("Eligiable for voting ");
       }
    }
}