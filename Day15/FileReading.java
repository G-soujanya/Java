import java.io.*;
class FileReading 
{
    public static void main(String args[]) throws Exception
    {
        try(FileReader fis=new FileReader("./t.txt"))
        {
            /*byte b[]=new byte[fis.available()];
            fis.read(b);
            String s=new String(b);
            System.out.println(s);*/
            int x;
            /*do
            {
                x=fis.read();
                if(x!=-1)
                System.out.println((char)x);
            }while(x!=-1);*/
            while((x=fis.read())!=-1)
            {
                System.out.print((char)x);
            }
        }
    }
}
