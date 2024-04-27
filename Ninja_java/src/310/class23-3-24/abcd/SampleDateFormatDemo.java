package abcd;
import java.util.*;
import java.text.*;

public class SampleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date d = simpleDateFormat.parse("15-08-1947");
        System.out.println("parsedDate: " + d);
    }
}
