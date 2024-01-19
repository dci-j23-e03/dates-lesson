import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        GregorianCalendar calendar = new GregorianCalendar(2010, Calendar.FEBRUARY, 20, 1, 10, 22);
        System.out.println(sdf.format(calendar.getTime()));
        System.out.println("Year: " + calendar.get(1));

        calendar.add(Calendar.YEAR, 15);
        calendar.add(Calendar.DAY_OF_MONTH, -10);
        System.out.println(sdf.format(calendar.getTime()));

        Calendar calendar1 = new GregorianCalendar(1999, Calendar.APRIL, 12);

        System.out.println(calendar.before(calendar1) ? sdf.format(calendar.getTime()) + " is before " + sdf.format(calendar1.getTime())
                : sdf.format(calendar.getTime()) + " is after " + sdf.format(calendar1.getTime()));
    }
}
