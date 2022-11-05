import java.util.*;
class stack
{
    public static void main (String arg [])
    {
        Stack<String>s=new Stack<String>();
        s.add("a");
        s.add("a");
        s.add("a");
        Iterator<String>i=s.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
     }
}
