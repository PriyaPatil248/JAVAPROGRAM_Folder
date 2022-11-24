public class try1
{
    public static void main(String []arg)
    {
       try
        {
           int[]myNumbers={1,2,3};
           System.out.println(myNumbers[10]);
         }
        catch(Exception e)
          {
            System.out.println("Something wents Wrong.");
          }
     }
}