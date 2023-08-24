package date_time.task1;

import java.util.Date;

public class DateTest2 {
    public static void main(String[] args) {
        Date date = new Date(100, 4, 12);

        Date current = new Date();
        Date date2 = new Date(110, 9, 27);

        boolean result = date.before(date2);
        System.out.println(result);

        result = date.after(date2);
        System.out.println(result);

    }


}
