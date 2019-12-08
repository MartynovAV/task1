package task1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class RandomDate {

    public static long [] startEndTimeMillis () {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //Previous year
        int yearPrev=calendar.get(Calendar.YEAR)-1;

        Calendar cal = Calendar.getInstance();
        cal.set(yearPrev,0,1,0,0,0);
        Date start = cal.getTime();
        cal.set(yearPrev,11,31,24,0,0);
        Date end = cal.getTime();

        long startMillis = start.getTime();
        long endMillis = end.getTime();
        long [] startEndTimeMillis ={startMillis,endMillis};
        return startEndTimeMillis;
    }

    public static String randomDateTime(long [] startEndTime) {
        long startMillis=startEndTime[0];
        long endMillis=startEndTime[1];
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        long randomMillisSinceEpoch = ThreadLocalRandom
                .current()
                .nextLong(startMillis, endMillis);
        Date date = new Date(randomMillisSinceEpoch);
        return dateFormat.format(date);
    }
}
