import java.lang.*;
import java.util.*;
class SortingArray 
{
    public static void main(String args[])
    {
        String arr[]={"java","python","ada"};
        java.util.Arrays.sort(arr);
        for(String x:arr)
            System.out.println(x);
    }    
}
