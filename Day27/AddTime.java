class Time 
{
    int hours;
    int minutes;
    int seconds;
    Time()
    {
        hours=0;
        minutes=0;
        seconds=0;
    }
    Time(int h,int m,int s)
    {
        hours=h;
        minutes=m;
        seconds=s;
    }
    static Time add(Time t1,Time t2)
    {
        Time tadded=new Time();
        tadded.hours=t1.hours+t2.hours;
        tadded.seconds=t1.seconds+t2.seconds;
        tadded.minutes=t1.minutes+t2.minutes;
        if(tadded.seconds>59)
        {
            tadded.seconds=tadded.seconds-60;
            tadded.minutes+=1;
        }
        return tadded;
    }
}
class AddTime 
{
    public static void main(String args[])
    {
        Time t11=new Time(10, 10, 90);
        Time t22=new Time();
        Time t33;
        t33=Time.add(t11,t22);
        System.out.println("hours are"+t33.hours);
        System.out.println("minutes are"+t33.minutes);
        System.out.println("seconds are"+t33.seconds);

    }    
}
