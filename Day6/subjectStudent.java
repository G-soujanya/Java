import java.lang.*;
class subject 
{
    private String subid;
    private String name;
    private int maxmarks;
    private int marksobtain;
    public String getSubid()
    {
        return subid;
    }
    public String getName()
    {
        return name;
    }
    public int getMaxmarks()
    {
        return maxmarks;
    }
    public int getMarksobtain()
    {
        return marksobtain;
    }
    public void setMaxmarks(int m)
    {
        maxmarks=m;
    }
    public void setMarksObtain(int m)
    {
        marksobtain=m;
    }
    public subject(String i,String n)
    {
        subid=i;
        name=n;
    }
    public subject(String i,String n,int m)
    {
        subid=i;
        name=n;
        maxmarks=m;
    }
    public subject(String i,String n,int m,int ma)
    {
        subid=i;
        name=n;
        maxmarks=m;
        marksobtain=ma;
    }
    boolean isQualified()
    {
        return marksobtain>=maxmarks/10*4;
    }
    public String toString()
    {
        return "subject is"+subid+"name"+name+"max marks"+maxmarks+"marks obtained"+marksobtain;
    }
}
class student 
{
    private String rollno;
    private String name;
    private String dept;
    private String[] subjects;
    public String getRollno()
    {
        return rollno;
    }
    public String getName()
    {
        return name;
    }
    public String getDept()
    {
        return dept;
    }
    public void getSubjects()
    {
        for(String s:subjects)
            System.out.println(s);
    }
    public void setSubject(String[] s)
    {
        subjects=s;
    }
    public student(String r,String n,String d,String[] s)
    {
        rollno=r;
        name=n;
        dept=d;
        subjects=s;
    }
    public String toString()
    {
        return "roll no"+rollno+"name"+name+"dept"+dept;
    }
}
class subjectStudent 
{
    public static void main(String args[])
    {
        subject subs[]=new subject[3];
        subs[0]=new subject("s101","ds",100);
        subs[1]=new subject("s102","algorithms",100);
        subs[2]=new subject("s103","os",100);
        for(subject s:subs)
            System.out.println(s);
        student s[]=new student[2];
        String sub[]={"ds","coa","cn"};
        String sub1[]={"dsa","coe","cns"};
        s[0]=new student("r180161","soujanya","cse",sub);
        s[1]=new student("r180162","suguna","csm",sub1);
        for(student s1:s)
            System.out.println(s1);
    }
}
