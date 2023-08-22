class reversewords
{
    public static void main(String args[])
    {
        String h="hello world";
        String[] b;
        b=h.split(" ");
        StringBuffer n=new StringBuffer();
        for(int i=b.length-1;i>=0;i--)
        {
            n.append(b[i]);
            n.append(" ");
        }
        System.out.println(n);
    }
}