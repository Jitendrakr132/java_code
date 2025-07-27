interface CustomerRaj 
{
    int amt=5;
    void purchase();
}
class sellerSanju implements CustomerRaj
{
    @Override
    public void purchase()
    {
        System.out.println("Rajneeds "+amt+"kg rice");
    }
}
class check
{
    public static void main(String[] args) {
        CustomerRaj c=new sellerSanju();
        c.purchase();
    }
}
