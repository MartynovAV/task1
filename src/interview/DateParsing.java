package interview;
//https://www.mkyong.com/java/how-to-convert-string-to-date-java/
// https://www.mkyong.com/java8/java-8-how-to-convert-string-to-localdate/
//https://www.javatpoint.com/java-string-to-date

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class DateParsing {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        String dateInString = "17.09.1986";
        try {
            Date date = formatter.parse(dateInString);
            System.out.println(date);
            System.out.println(formatter.format(date));

        } catch (ParseException e) {
            e.printStackTrace();
        }



    }
}
