import java.lang.*;
class Names 
{
    static void showList(int start,String ...s)
    {
        for(int i=0;i<s.length;i++)
        {
            System.out.println(start+". "+s[i]);
            start++;
        }
    }
    public static void main(String args[])
    {
        String a[]={"soujanya","suguna","nithya"};
        showList(5,a);
    }    
}
