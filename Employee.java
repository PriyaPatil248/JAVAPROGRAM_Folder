class Employee
{
    int id;
    String name;
    Employee()
    {
      id=66;
      name="Priya";
    }
    void get1()
    {
       System.out.println("Employee id is:"+id);
       System.out.println("Employee name is:"+name);
    }
 }
 class Information extends Employee
{
   int salary;
   String designation;
   Information()
   {
      salary=50000;
      designation="Post Graduate";
   }
   void get2()
   {
     get1();
     System.out.println("Employee salary is:"+salary);
     System.out.println("Employee designation is:"+designation);
   }
   public static void main(String arg[])
   {
       Information I=new Information();
       I.get2();
   }
}
