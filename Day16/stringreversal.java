class stringreversal 
{
    public static void main(String args[])
    {
        String h="hello world";
        StringBuffer n=new StringBuffer();
        for(int i=h.length()-1;i>=0;i--)
        {
            n.append(h.charAt(i));
        }
        System.out.println(n);
    }    
}
