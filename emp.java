
class emp
{
   int emp_id;
   String emp_name;
   int emp_salary;
   emp()
   {
       emp_id=1;
       emp_name="Priya";
       emp_salary=50000;
   }
   void set()
   {
       System.out.println("Employee id is="+emp_id);
       System.out.println("Employee name is="+emp_name);
       System.out.println("Employee salary is="+emp_salary);
   }
   public static void main(String arg[])
   {
       emp emp1=new emp();
       emp1.set();
   }
}

