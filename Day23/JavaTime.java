import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

class JavaTime
{
    public static void main(String args[])
    {
        ZonedDateTime zdt=ZonedDateTime.now();
        System.out.println(zdt);
        OffsetDateTime odt=OffsetDateTime.now();
        System.out.println(odt);
        ZonedDateTime zdt1=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(zdt1);
        MonthDay md=MonthDay.now();

        Period p=Period.of(2,2,10);
        System.out.println(p.addTo(LocalDate.now()));
        Instant i=Instant.now();
        System.out.println(i);
    

    }    
}
