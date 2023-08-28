import java.io.DataOutputStream;
import java.io.FileOutputStream;

class Student 
{
    int rollno;
    String name;
    String branch;
    float avg;
}
class DataStreamDemo 
{
    public static void main(String args[]) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("./Data.txt");
        DataOutputStream d=new DataOutputStream(fos);
        Student s=new Student();
        s.rollno=161;
        s.name="Soujanya";
        s.branch="CSE";
        s.avg=80.4f;
        d.writeInt(s.rollno);
        d.writeUTF(s.name);
        d.writeFloat(s.avg);
        d.writeUTF(s.branch);
        fos.close();
        d.close();
    }    
}
