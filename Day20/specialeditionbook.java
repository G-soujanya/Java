class Book
{
    int bno;
    String bname;
    int price;
    public Book(int i,String n,int p)
    {
        bno=i;
        bname=n;
        price=p;
    }
    public void display()
    {
        System.out.println("book number is"+bno);
        System.out.println("book name is"+bname);
        System.out.println("book price is"+price);
    }
}
class SpecialEditionBook extends Book
{
    int discount;
    public SpecialEditionBook(int i,String n,int p,int d)
    {
        super(i,n,p);
        discount=d;
    }
    public void display()
    {
        super.display();
        System.out.println("discount is"+discount);
    }
}
class specialeditionbook 
{
    public static void main(String args[])
    {
        SpecialEditionBook s=new SpecialEditionBook(161, "as",100,10);
        s.display();
    }  
}
