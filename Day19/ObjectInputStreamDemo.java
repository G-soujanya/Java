import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Student implements Serializable
{
    int rollno;
    String name;
    String branch;
    Student(){};
}
class ObjectInputStreamDemo 
{
    public static void main(String args[]) throws Exception
    {
        FileInputStream fis=new FileInputStream("./f.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Student s;
        s=(Student)ois.readObject();
        System.out.println(s.rollno+" "+s.name+" "+s.branch);
        fis.close();
        ois.close();
    }    
}
