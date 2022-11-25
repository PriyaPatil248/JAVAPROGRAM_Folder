interface a
{
    final public int emp_id=42;
 }
  class b
{
    public String emp_name="Priya Patil";
 }
   class c extends b implements a
    {
        public void display()
     {
         long emp_salary=90000;
         System.out.println("Employee Id is : "+emp_id);
         System.out.println("Employee Name is : "+emp_name);
         System.out.println("Employee Salary is : "+emp_salary);
     }
     public static void main(String[]args)
      {
       c c1 = new c();
        c1.display();
      }
  }
