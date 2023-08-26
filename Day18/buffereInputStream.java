import java.io.*;
class buffereInputStream 
{
    public static void main(String args[]) throws Exception
    {
        FileInputStream fis=new FileInputStream("t.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        /*int x;
        while((x=bis.read())!=-1)
        {
            System.out.println((char)x);
        }
        System.out.println("File"+fis.markSupported());
        System.out.println("buffered"+bis.markSupported());*/
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        bis.mark(10);
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        bis.reset();
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        
    }    
}
