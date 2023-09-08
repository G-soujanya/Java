import java.util.*;
class Run 
{

    String name;
    int distance;
    Scanner sc=new Scanner(System.in);
    void get()
    {
        name=sc.next();
        distance=sc.nextInt();
    }
    void display()
    {
        System.out.println("name is"+name);
        System.out.println("Distance is"+distance);
    }
}
class runner 
{
    public static void main(String args[])
    {
        Run r=new Run();
        r.get();
        r.display();
        Run r1=new Run();
        r1.get();
        r1.display();
        if(r.distance>r1.distance)
        {
            System.out.println("runner who coverev highest distance is"+r.name);
        }
        else 
            System.out.println("runner who coverev highest distance is"+r1.name);
    }    
}
