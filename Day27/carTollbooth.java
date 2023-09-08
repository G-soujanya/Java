import java.util.*;
class Tollbooth 
{
    int totalNoOfCars;
    int totalAmount;
    Tollbooth()
    {
        totalAmount=0;
        totalNoOfCars=0;
    }
    void payingCar()
    {
        totalNoOfCars+=1;
        totalAmount+=50;
    }
    void noPayCars()
    {
        totalNoOfCars+=1;
    }
    void display()
    {
        System.out.println("total number of cars passing toolbooth"+totalNoOfCars);
        System.out.println("total amount collected"+totalAmount);
    }
}
class carTollbooth 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Tollbooth t=new Tollbooth();
        int num=0;
        while(num!=4)
        {
            System.out.println("1.payingcar\n2.nopaycars\n3.display\n4.exit");
            System.out.println("Enter your choice");
            num=sc.nextInt();
            if(num==1)
            {   
                t.payingCar();
            }
            else if(num==2)
            {
                t.noPayCars();
            }
            else 
            {
                t.display();
            }
        }

    }    
}
