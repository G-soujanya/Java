import java.util.Arrays;

class angrams 
{
    public static void main(String args[])
    {
        String str1="listen";
        String str2="silent";
        char[] c1=str1.toCharArray();
        char[] c2=str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1,c2))
        System.out.println("angrams");
        else
        System.out.println("not angrams");
    }
}
