import java.lang.*;
class commanLineAdd 
{
    public static void main(String args[])
    {
        int sum=0;
        for(String x:args)
        {
            if(x.matches("[0-9\\.]+"))
            sum+=Double.parseDouble(x);
        }
        System.out.println(sum);
    }    
} 
