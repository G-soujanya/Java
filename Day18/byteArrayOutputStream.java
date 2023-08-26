import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

class byteArrayOutputStream 
{
    public static void main(String args[]) throws Exception
    {
        ByteArrayOutputStream bos=new ByteArrayOutputStream(20);
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');
        /*byte[] b=bos.toByteArray();
        for(byte x:b)
        System.out.println((char)x);*/
        bos.writeTo(new FileOutputStream("./t.txt"));
        bos.close();

    }    
}
