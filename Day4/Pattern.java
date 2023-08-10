import java.lang.*;
class Pattern
{
    public static void main(String arg[])
    {
        int count=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.format("%02d ",count);
                count++;
            }
            System.out.println("");
        }
    }
}