import java.util.StringTokenizer;

class TokenizerDemo 
{
    public static void main(String args[])
    {
        String data="name= vijay address=delhi";
        StringTokenizer stk=new StringTokenizer(data,"=");
        String s;
        while(stk.hasMoreTokens())
        {
            s=stk.nextToken();
            System.out.println(s);
        }
    }    
}
