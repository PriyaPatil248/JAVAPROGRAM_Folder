class stud
{
    private int rollno=69;
    private String name="Priya";
    private float per=87.50f;
    void display()
    {
       System.out.println("Student rollno is="+rollno);
       System.out.println("Student name is="+name);
       System.out.println("Student percentage is="+per);
    }
    public static void main (String args [] )
    {
       stud s=new stud();
       s.display();
    }
}
