import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

 class Student
 {
    int rollno;
    String name;
    String branch;
 }
class PrintStreamReading 
{
    public static void main(String args[]) throws Exception
    {
        FileInputStream fis=new FileInputStream("./Data.txt");
        BufferedReader b=new BufferedReader(new InputStreamReader(fis));
        Student s=new Student();
        s.rollno=Integer.parseInt(b.readLine());
        s.name=b.readLine();
        s.branch=b.readLine();
        System.out.println(s.rollno+" "+s.name+" "+s.branch);
    }    
}
