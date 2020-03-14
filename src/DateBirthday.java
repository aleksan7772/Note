import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateBirthday
{
    public static void main(String[] args)
    {
        Date date = new Date();// Текущая дата и время
        System.out.println(date);
        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar.getTime());
        calendar.set(calendar.DAY_OF_MONTH, 4);
        calendar.set(calendar.MONTH, 9);
        calendar.set(calendar.YEAR, 1990);
        calendar.set(1990, 9, 4);
        long millis = date.getTime() - calendar.getTimeInMillis();// секунды
//        System.out.println(millis);
        int days = (int) (millis / (24 * 60 * 60 * 1000));// дни
        System.out.println(days);

//        Main6 main6 = new Main6();//Вызов другово класса
//        main6.ascString();
    }


}
