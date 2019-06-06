package DataTypes.primitiveTypes;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Callable;

public class Calender_Intro {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, 2019);
        calendar.set(Calendar.MONTH, 5);
       calendar.set(Calendar.DATE, 14);

        Date date = new Date(calendar.getTimeInMillis());
        System.out.println(date);

        Calendar now = Calendar.getInstance();
        System.out.println("12 Hour format :" + now.get(Calendar.HOUR));
        System.out.println("Minute format :" + now.get(Calendar.MINUTE));




    }
}
