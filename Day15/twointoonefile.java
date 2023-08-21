import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

class twointoonefile 
{
    public static void main(String args[])
    {
        try
        {
        FileInputStream fis1=new FileInputStream("./source1.txt");
        FileInputStream fis2=new FileInputStream("./source2.txt");
        SequenceInputStream sis=new SequenceInputStream(fis1, fis2);
        FileOutputStream fos=new FileOutputStream("Destination.txt");
        int x;
        while((x=sis.read())!=-1)
        {
            fos.write(x);
        }
        fos.close();
        sis.close();
        fis2.close();
        fis1.close();
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
