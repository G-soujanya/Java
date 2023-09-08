import java.util.*;
class Result 
{
    Scanner sc=new Scanner(System.in);
    int rollno;
    String name;
    int[] marks=new int[3];
    void input()
    {
        System.out.println("enter the three subject marks");
        for(int i=0;i<3;i++)
        {
            int num;
            num=sc.nextInt();
            marks[i]=num;
        }
    }
    void show()
    {
        System.out.println("roll no is"+rollno);
        System.out.println("name is"+name);
        System.out.println("marks are");
        for(int i=0;i<3;i++)
        {
            System.out.println(marks[i]);
        }
    }
    int total()
    {
        int total=0;
        for(int i=0;i<3;i++)
        {
            total+=marks[i];
        }
        return total;
    }
    double avg()
    {
        return total()/3;
    }
}
class resultmain 
{
    public static void main(String args[])
    {
        Result r=new Result();
        r.input();
        System.out.println("total marks are"+r.total());
        System.out.println("average marks are"+r.avg());
        r.show();
    }    
}

