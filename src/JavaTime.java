import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;

public class JavaTime {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        LocalDate date = LocalDate.of(1999, 2, 12);

        System.out.println(currentDate.isBefore(date) ? currentDate + " is before " + date
                : currentDate + " is after " + date);

        System.out.println("Year: " + date.getYear());
        Year thisYear = Year.now();
        System.out.println(currentDate.isLeapYear() ? "leap year" : "not a leap year");
        if (thisYear.getValue() == currentDate.getYear()) {
            System.out.println("Years are the same");
        }

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy MMMM dd");
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd");
        System.out.println(currentDate);
        System.out.println(dtf.format(currentDate));

        LocalDate parsedDate =  LocalDate.parse("2024 January 21", dtf);
        System.out.println(dtf.format(parsedDate));

        Instant timestamp = Instant.now();
        System.out.println("Timestamp: " + timestamp.getEpochSecond());
        LocalDateTime currentDateTime2 = LocalDateTime.ofInstant(timestamp, ZoneId.of("Australia/Darwin"));
        System.out.println(currentDateTime2);
    }
}
