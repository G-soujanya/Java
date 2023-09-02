import java.util.*;
import java.util.spi.LocaleNameProvider;
import java.time.*;
import java.time.temporal.*;
class JodaTimeDemo 
{
    public static void main(String args[])
    {
        /*Date d=new Date();
        d.setHours(21);
        System.out.println(d);*/
        LocalDate dt=LocalDate.now();
        System.out.println(dt);
        LocalDate dt1=LocalDate.now(Clock.systemDefaultZone());
        System.out.println(dt1);
        LocalDate dt3=LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(dt3);
        LocalDate d=LocalDate.of(2023,Month.MARCH,10);
        System.out.println(d);
        LocalDate d1=LocalDate.ofEpochDay(100);
        System.out.println(d1);
        LocalDate d2=LocalDate.parse("2020-01-03");
        System.out.println(d2);
        LocalDate d2modified=d2.plusMonths(2);
        System.out.println(d2modified);
    };
        
}
