import java.lang.*;
class stu 
{
    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;
    public int total()
    {
        return m1+m2+m3;
    }
    public int average()
    {
        return total()/3;
    }
    public char grade()
    {
        if(average()>60)
        {
            return 'A';
        }
        else 
            return 'B';
    }
    public String details()
    {
        return "name "+name+"course "+course+"roll "+roll;
    }
}
class student 
{
    public static void main(String arg[])
    {
        stu c=new stu();
        c.roll=161;
        c.name="suguna";
        c.course="csm";
        c.m1=70;
        c.m2=80;
        c.m3=65;
        System.out.println("Total "+c.total());
        System.out.println("Average "+c.average());
        System.out.println("Grade "+c.grade());
        System.out.println("Details are"+c.details());
    }
}
