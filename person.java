class person
{
   String name="Priya";
   String address="A/P-Kale,Tal-Karad ,Dist-Satara";
   void show() 
   {
      System.out.println("Name of person:"+name);
      System.out.println("Address of person:"+address);
   } 
}
class student extends person
{
   int rollno=66;
   String course="BCS-III";
   void info1()
   {
      show();
      System.out.println("student roll no is"+rollno);
      System.out.println("student course"+course);
   } 
}
class Teacher extends person
{
   int departmentsal=50000;
   void info2()
   {
      System.out.println("Departement salary is"+departmentsal);
   }
   public static void main(String arg[])
   {
      student s=new student();
      Teacher t=new Teacher();
      s.info1();
      t.info2();
   }
}
