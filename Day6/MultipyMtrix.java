import java.lang.*;
class MultipyMtrix 
{
    public static void main(String arg[])
    {
        int a[][]={{1,2,3},{4,5,6},{6,7,8}};
        int b[][]={{1,2,3},{4,5,6},{6,7,8}};
        int c[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    c[i][j]+=a[i][k]+b[k][j];
                }
            }
        }
        for(int x=0;x<3;x++)
            {
            for(int j=0;j<3;j++)
            {
                System.out.print(c[x][j]+" ");
            }
            System.out.println("");
            }
    }
        
}
