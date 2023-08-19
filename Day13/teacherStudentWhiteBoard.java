import java.lang.*;
class board
{
    String text;
    int noofstudents=0;
    int count=0;
    synchronized public void write(String s)
    {
        System.out.println("Teacher is writing "+s);
        while(count!=0)
        {
            try{wait();}catch(Exception e){};
        }
        text=s;
        count=noofstudents;
        notifyAll();
    }
    synchronized public String read()
    {
        while(count==0)
        {
            try{wait();}catch(Exception e){};
        }
        String t=text;
        count--; 
        if(count==0)
            notify();
        return t;
    }
    public void attandance()
    {
        noofstudents++;
    }
}
class teacher extends Thread
{
    board b1;
    public teacher(board b)
    {
        b1=b;
    }
    String[] s={"java is programming language","java object oriented language","java is faster than pythin","end"};
    public void run()
    {
        for(int i=0;i<s.length;i++)
        {
            b1.write(s[i]);
        }
    }
}
class student extends Thread 
{
    String name;
    board c1;
    public student(String n,board b)
    {
        name=n;
        c1=b;
    }
    public void run()
    {
        String s;
        c1.attandance();
        do
        {
            s=c1.read();
            System.out.println(name+"Reading"+s);
            System.out.flush();
        }while(!s.equals("end"));
    }
}
class teacherStudentWhiteBoard 
{
    public static void main(String args[])
    {
        board b=new board();
        teacher t=new teacher(b);
        student s1=new student("1.john",b);
        student s2=new student("2.ajay",b);
        student s3=new student("3.kloob",b);
        student s4=new student("4.smith",b);
        t.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }   
}
