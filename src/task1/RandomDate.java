package task1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class RandomDate {

    public static Date randDate () {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //Previous year
        int yearPrev=calendar.get(Calendar.YEAR)-1;

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, yearPrev);
        cal.set(Calendar.DAY_OF_YEAR, 1);
        Date start = cal.getTime();

        cal.set(Calendar.YEAR, yearPrev);
        cal.set(Calendar.MONTH, 11); // 11 = december
        cal.set(Calendar.DAY_OF_MONTH, 31); // new years eve
        Date end = cal.getTime();

        long startMillis = start.getTime();
        long endMillis = end.getTime();
        long randomMillisSinceEpoch = ThreadLocalRandom
                .current()
                .nextLong(startMillis, endMillis);
        return new Date(randomMillisSinceEpoch);
    }

    public static String randomDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = randDate();
        return dateFormat.format(date);
    }
}
