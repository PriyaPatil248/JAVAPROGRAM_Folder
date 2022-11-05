class overload
{
   void area(int l,float b)
   {
      System.out.println("Area of rectangle is="+(l*b));
   }
    void area(float r)
   {
      float c=3.14f*r*r;
      System.out.println("Area of circle is="+c);
   }
    void area(int a)
   {
      System.out.println("Area of square is="+(a*a));
   }
   public static void main (String args [])
   {
      overload f=new overload();
      f.area(4,4.5f);
      f.area(2,3f);
      f.area(3);
   }
}
