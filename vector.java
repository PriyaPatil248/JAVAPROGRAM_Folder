import java.util.*;
class vector
{
    public static void main (String arg [])
    {
        Vector v=new Vector();
        v.add("abc");
        v.add("pqr");
        v.add(10);
        Iterator i=v.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
     }
}
