import java.io.FileOutputStream;
import java.io.PrintStream;

class Student 
{
    int rollno;
    String name;
    String branch;
}
class PrintStreamDemo 
{
    public static void main(String args[]) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("./Data.txt");
        PrintStream p=new PrintStream(fos);
        Student s=new Student();
        s.rollno=161;
        s.name="soujanya";
        s.branch="CSE";
        p.println(s.rollno);
        p.println(s.name);
        p.println(s.branch);
        p.close();
        fos.close();
    }    
}
