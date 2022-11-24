public class match
{
    public static void main(String []args)
    {
       try
        {
          int a=2,b=0;
          System.out.println("Result="+(a/b));
        }
       catch(ArrayStoreException e)
        {
           System.out.println(e);
        }
       catch(Exception e)
        {
           System.out.println(e);
        }
    }
}