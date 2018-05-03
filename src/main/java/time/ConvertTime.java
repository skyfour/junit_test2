package time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertTime {
    public static void main(String[] args) {
        Date d = new Date(203000);
        System.out.println(d);
        Date date = new Date(600);
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        String dateStr = sdf.format(date);
        System.out.println(dateStr);
    }
}
