import java.util.*;
class Car 
{
    String carName;
    String carDirection;
    int position;
    Car()
    {
        carName="tata";
        carDirection="east";
        position=10;
    }
    void turn()
    {
        if(carDirection=="east")
            carDirection="south";
        else if(carDirection=="west")
            carDirection="east";
        else if(carDirection=="north")
            carDirection="west";
        else 
            carDirection="north";
    }
    void turn(String dir)
    {
        carDirection=dir;
    }
    void changePosition(int distance)
    {
        position=distance;
    }
    void display()
    {
        System.out.println("car name is"+carName);
        System.out.println("car direction is"+carDirection);
        System.out.println("car position is"+position);
    }
}
class CarDetails 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Car car=new Car();
        int num=0;
        while(num!=5)
        {
            System.out.println("1.turnright\n2.turn\n3.change positon\n4.display\n5.exit");
            System.out.println("Enter your choice");
            num=sc.nextInt();
            if(num==1)
            {
                car.turn();
            }
            else if(num==2)
            {
                car.turn("west");
            }
            else if(num==3)
            {
                car.changePosition(30);
            }
            else 
            {
                car.display();
            }
        }
    }    
}
