import java.io.DataInputStream;
import java.io.FileInputStream;

import javax.xml.crypto.Data;

class Student
{
    int rollno;
    String name;
    String branch;
    float avg;
}
class DataInputStreamDemo 
{
    public static void main(String args[]) throws Exception
    {
        FileInputStream fis=new FileInputStream("./Data.txt");
        DataInputStream d=new DataInputStream(fis);
        Student s=new Student();
        s.rollno=d.readInt();
        s.name=d.readUTF();
        s.avg=d.readFloat();
        s.branch=d.readUTF();
        
        System.out.println(s.rollno+" "+s.name+" "+s.branch+" "+s.avg);
        fis.close();
        d.close();
    }    
}
