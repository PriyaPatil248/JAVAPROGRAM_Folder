import java.util.*;
class Reverse_No
{
   public static void main(String arg[])
    {
      int n, rev=0;
      System.out.println("Enter Number to reverse");
      Scanner in=new Scanner(System.in);
      n=in.nextInt();
      while(n!=0)
      {
         rev=rev*10;
         rev=rev+n%10;
         n=n/10;
       }
   System.out.println("Reverse Number is : "+rev);
     }
}
