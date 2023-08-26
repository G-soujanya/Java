import java.io.ByteArrayInputStream;

class byteArrayInputStream 
{
    public static void main(String args[]) throws Exception
    {
        byte b[]={'a','b','c','d','e','f','g','h','i','j','k','l','m'};
        ByteArrayInputStream bis=new ByteArrayInputStream(b);
        /*int x;
        while((x=bis.read())!=-1)
        {
            System.out.print((char)x);
        }*/ 
        String str=new String(bis.readAllBytes());
        System.out.println(str);
        System.out.println(bis.markSupported());
        bis.close();
    }    
}
