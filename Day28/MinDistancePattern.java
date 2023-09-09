class MinDistancePattern 
{
    public static void main(String args[])
    {
        for(int i=0;i<7;i++)
        {
            for(int j=0;j<7;j++)
            {
                int m1=Math.min(i, j);
                int m2=Math.min(7-i-1,7-j-1);
                System.out.print(4-Math.min(m1,m2));
            }
            System.out.println("");
        }
    }    
}
