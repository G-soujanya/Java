class onesTwosPyramid 
{
    public static void main(String args[])
    {
        for(int i=0;i<5;i++)
        {
            if(i%2==1)
            {
            for(int j=0;j<i+1;j++)
            {
                System.out.print((j%2));
            }
            }
            else 
            {
                for(int j=0;j<i+1;j++)
                {
                System.out.print(((j+1)%2));
                }
            }
            System.out.println("");
        }
    }    
}
