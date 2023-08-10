import java.lang.*;
class Patternpi
{
    public static void main(String arg[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i+j>5)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for(int k=i-1;k>0;k--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        int count=0;
        for(int i=4;i>=0;i--)
        {
            for(int j=1;j<=5;j++)
            {
                if(j>count)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            count++;
            for(int k=i;k>=0;k--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}