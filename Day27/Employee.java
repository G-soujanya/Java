import java.util.*;
class Employe 
{
    int number;
    float compensation;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        number=sc.nextInt();
        compensation=sc.nextInt();
    }
    void display()
    {
        System.out.println("number is"+number);
        System.out.println("compensation is"+compensation);
    }
}
class Employee 
{
    public static void main(String args[])
    {
        Employe e=new Employe();
        e.input();
        e.display();
    }    
}
