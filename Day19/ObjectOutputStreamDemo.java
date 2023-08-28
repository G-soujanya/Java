import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
    int rollno;
    String name;
    String branch;
    Student(){};
}
class ObjectOutputStreamDemo 
{
    public static void main(String args[]) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("./f.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        Student s=new Student();
        s.rollno=161;
        s.name="soujanya";
        s.branch="cse";
        oos.writeObject(s);
    }    
}
