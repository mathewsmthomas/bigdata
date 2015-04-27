import java.util.Calendar;
import java.util.GregorianCalendar;


public class WeekEnd {
	
	public static boolean isWeekend(String ts)
	{
	    int year = Integer.parseInt(ts.substring(0, 4));
	    int month = Integer.parseInt(ts.substring(5, 7));
	    int day = Integer.parseInt(ts.substring(7, 9));
	    Calendar cal = new GregorianCalendar(year, month - 1, day);
	    int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
	    return (Calendar.SUNDAY == dayOfWeek || Calendar.SATURDAY == dayOfWeek);
	}

	
	public static void main(String args[]){
		WeekEnd we = new WeekEnd();
		System.out.println(we.isWeekend("2015-03-15"));
	}
}
