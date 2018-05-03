package time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public static void main(String[] args) throws ParseException {
//		SimpleDateFormat dateFormat = new SimpleDateFormat(
//		"yyyy-MM-dd");
//		Date tempDate = dateFormat.parse("2011-06-01");
//		Date newDate = dateFormat.parse("2011-05-15");
//		System.out.println(minutesBetweenByDay(newDate, tempDate));
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"yyyy-mm-dd HH:mm:ss");
		Date startDate = dateFormat.parse("2012-12-24 17:45:49");
		Date endDate = dateFormat.parse("2012-12-24 17:48:58 ");
		System.out.println(secondesBetween(startDate, endDate));
	}

	public static int secondesBetween(Date startDate, Date endDate) {
		Calendar startCalendar = Calendar.getInstance();
		Calendar endCalendar = Calendar.getInstance();
		startCalendar.setTime(startDate);
		endCalendar.setTime(endDate);
		setTimeToMidnight(startCalendar);
		setTimeToMidnight(endCalendar);
		//获取毫秒
		long startMinutes = startCalendar.getTimeInMillis();
		//获取毫秒
		long endMinutes = endCalendar.getTimeInMillis();
		long intervalMs = endMinutes - startMinutes;
		return millisecondsToSecondes(intervalMs);
	}
	public static int minutesBetween(Date startDate, Date endDate) {
		Calendar startCalendar = Calendar.getInstance();
		Calendar endCalendar = Calendar.getInstance();
		startCalendar.setTime(startDate);
		endCalendar.setTime(endDate);
		setTimeToMidnight(startCalendar);
		setTimeToMidnight(endCalendar);
		//获取毫秒
		long startMinutes = startCalendar.getTimeInMillis();
		//获取毫秒
		long endMinutes = endCalendar.getTimeInMillis();
		long intervalMs = endMinutes - startMinutes;
		return millisecondsToMinutes(intervalMs);
	}
	public static int minutesBetweenByDay(Date startDate, Date endDate) {
		Calendar startCalendar = Calendar.getInstance();
		Calendar endCalendar = Calendar.getInstance();
		startCalendar.setTime(startDate);
		endCalendar.setTime(endDate);
		setTimeToMidnight(startCalendar);
		setTimeToMidnight(endCalendar);
		//获取毫秒
		long startMinutes = startCalendar.getTimeInMillis();
		//获取毫秒
		long endMinutes = endCalendar.getTimeInMillis();
		long intervalMs = endMinutes - startMinutes;
		return millisecondsToDay(intervalMs);
	}
	/**
	 * 毫秒转换为秒
	 * @param intervalMs
	 * @return
	 */
	private static int millisecondsToSecondes(long intervalMs) {
		return (int) intervalMs / 1000;
	}
	/**
	 * 毫秒转换为分
	 * @param intervalMs
	 * @return
	 */
	private static int millisecondsToMinutes(long intervalMs) {
		return (int) (intervalMs / (1000 * 60));
	}
	/**
	 * 毫秒转换为天
	 * @param intervalMs
	 * @return
	 */
	private static int millisecondsToDay(long intervalMs) {
		return (int) (intervalMs / (1000 * 60*60*24));
	}
	/**
	 * 设置毫秒上的加减
	 * @param calendar
	 */
	private static void setTimeToMidnight(Calendar calendar) {
		calendar.set(Calendar.MILLISECOND, 0);
	}
	public static String getString(Date date,String pattern) {
		if(date==null){
			return null;
		}
		if(pattern==null || pattern.trim().equals("")){
			return getString(date);
		}
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		return dateFormat.format(date);
	}
	public static String getString(Date date) {
		if(date==null){
			return null;
		}
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return dateFormat.format(date);
	}
	public static Date parse(String str,String pattern) throws ParseException {
		if(str==null || str.trim().equals("")){
			return null;
		}
		SimpleDateFormat dateFormat;
		if(pattern!=null){
			dateFormat = new SimpleDateFormat(pattern);
		}else{
			dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		}
		return dateFormat.parse(str);
	}
}
