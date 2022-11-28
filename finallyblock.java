public class finallyblock
{
    public static void main(String args[])
    {
     try
         {
            int[]myNumbers={1,2,3};
             System.out.println(myNumbers[1]);
          }
      catch(Exception e)
         {
            System.out.println("Something wents Wrong");
         }
         finally
        {
           System.out.println("the 'try catch' is finished");
         }
     }
}
