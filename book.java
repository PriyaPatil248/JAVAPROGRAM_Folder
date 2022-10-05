class book
{
    int book_id;
    String book_name;
    int book_pageno;
    String book_authorname;
    book()
    {
 	book_id=14;
 	book_name="Agni-pankh";
	book_pageno=1;
	book_authorname="Dr.Abdual Kalam";
    }
    void set()
    {
  	System.out.println("Book id is="+book_id);	
  	System.out.println("Book name is="+book_name);
  	System.out.println("Book pageno is="+book_pageno);
  	System.out.println("Book authorname is="+book_authorname);
    }
    public static void main(String arg[])
    {
  	book book1=new book();
	book1.set();
    }
}
