class a extends Thread
{
    public void run()
       {
             System.out.println("Number from 1 to 10");
             for(int i=1; i<11; i++)
             {
                 System.out.println(i);
             }
        }
}
class b extends Thread
{
     public void run()
      {
          System.out.println("Numbers from 11 to 20");
           for(int i=11; i<21; i++)
           {
              System.out.println(i);
            }
       }
    public static void main(String args[])
     {
        a a1= new a();
        a1.run();
        b b1=new b();
        b1.run();
      }
}