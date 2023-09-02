import java.util.*;
class CalenderDemo 
{
    public static void main(String args[])
    {
        GregorianCalendar gc=new GregorianCalendar();
        System.out.println(gc.isLeapYear(2020));
        System.out.println(gc.get(Calendar.DATE));
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
        System.out.println(gc.get(Calendar.DAY_OF_YEAR));
        TimeZone tz=gc.getTimeZone();
        System.out.println(tz);
Object getDisplayName;
System.out.println(tz.getDisplayName());
System.out.println(tz.getID());
    }    
}
