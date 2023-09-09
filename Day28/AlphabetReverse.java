class AlphabetReverse 
{
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            char c='E';
            for(int j=i;j>0;j--)
            {
                System.out.print((char)(c-j+1));
            }
            System.out.println("");
        }
    }    
}
