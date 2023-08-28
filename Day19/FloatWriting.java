import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class FloatWriting 
{
    public static void main(String args[]) throws Exception
    {
        /*float[] f={1.2f,3.4f,6.7f};
        FileOutputStream fos=new FileOutputStream("./float.txt");
        DataOutputStream oos=new DataOutputStream(fos);
        oos.writeInt(f.length);
        for(float x:f)
        {
            oos.writeFloat(x);
        }
        oos.close();
        fos.close();
        */
        FileInputStream fis=new FileInputStream("./float.txt");
        DataInputStream dis=new DataInputStream(fis);
        int length=dis.readInt();
        float data;
        for(int i=0;i<length;i++)
        {
            data=dis.readFloat();
            System.out.println(data);
        }
        dis.close();
        fis.close();
    }    
}
