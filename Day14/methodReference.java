interface mylambda
{
    public int display(String r,String str);
}
class methodReference 
{
   /*public static void reverse(String str)
    {
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }*/
    public methodReference(String a)
    {
        System.out.println(a.toUpperCase());
    }
    public static void main(String args[])
    {
        /*mylambda m=System.out::println;
        m.display("helle");*/
        /*mylambda m1=methodReference::reverse;
        m1.display("soujanya");*/
        /*mylambda m=methodReference::new;
        m.display("soujanya");*/
        mylambda ma=String::compareTo;
        int t=ma.display("hello","hello");
        System.out.println(t);
    }    
}
