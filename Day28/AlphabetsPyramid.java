class AlphabetsPyramid 
{
    public static void main(String args[])
    {
        char c='A';
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print(c);
            }
            c++;
            System.out.println("");
        }
    }    
}
