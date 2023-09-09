class AlphabetOffPyramid 
{
    public static void main(String args[])
    {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5-i;j++)
            {
                System.out.print(" ");
            }
            char c='A';
            for(int j=0;j<2*i+1;j++)
            {
                if(j<=(i/2)+1)
                {
                System.out.print(c);
                c++;
                }
                else 
                {
                System.out.print(c);
                c--;
                }
            }
            System.out.println("");
        }
    }    
}
