import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date currentDate = new Date();
        System.out.println(currentDate);
        System.out.println(currentDate.getTime());

        Date newDate = new Date(currentDate.getTime() + 1000);
        System.out.println(newDate);

        if (currentDate.before(newDate)) {
            System.out.println("currentDate is before newDate");
        } else if (currentDate.after(newDate)) {
            System.out.println("currentDate is after newDate");
        } else {
            System.out.println("Dates are equal");
        }

        if (currentDate.compareTo(newDate) < 0) {
            System.out.println("currentDate is before newDate");
        } else if (currentDate.compareTo(newDate) > 0) {
            System.out.println("currentDate is after newDate");
        } else {
            System.out.println("Dates are equal");
        }

        SimpleDateFormat sdf = new SimpleDateFormat("G yyyy MMMM dd HH:mm:ss:S");
        System.out.println(sdf.format(currentDate));
    }
}