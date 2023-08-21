import java.io.*;
class copyingFile 
{
    public static void main(String args[])
    {
        try
        {
            FileInputStream fis=new FileInputStream("./source1.txt");
            byte[] b=new byte[fis.available()];
            fis.read(b);
            String s=new String(b);
            s=s.toLowerCase();
            fis.close();
            FileOutputStream fos= new FileOutputStream("./source2.txt");
            fos.write(s.getBytes());
            fos.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }

    }    
}
