class Book 
{
    int bookid;
    int pages;
    int price;
    public void set(int i,int p,int pr)
    {
        bookid=i;
        pages=p;
        price=pr;
    }
    public void show()
    {
        System.out.println("bbok id is"+bookid);
        System.out.println("pages are"+pages);
        System.out.println("price is"+price);
    }
    public int getprice()
    {
        return price;
    }
}
class bookmain 
{
    public static void main(String args[])
    {
        Book b1=new Book();
        Book b2=new Book();
        b1.set(161, 100, 100);
        b2.set(160, 101, 1000); 
        if(b1.getprice()>b2.getprice())
        {
            System.out.println("Book1 has highest price");
        }
        else 
        {
            System.out.println("Book2 has highest price");
        }
    }    
}
