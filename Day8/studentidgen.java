import java.lang.*;
class student 
{
    private String rollNo;
    private static int count=1;
    private String generateRollNo()
    {
        String rn="univ-2020-"+count;
        count++;
        return rn;
    }
    public student()
    {
        rollNo=generateRollNo();
    }
    public String getRollNo()
    {
        return rollNo;
    }
}
class studentidgen 
{
    public static void main(String arg[])
    {
        student s=new student();
        System.out.println(s.getRollNo());
    }    
}
