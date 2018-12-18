package TestPaypal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.junit.Test;

/**
 * Calendar转String
 * @author Administrator
 *
 */
public class TimeUtis {

	
	
	private final static Date date=new Date();
	
	
	public static void main(String[] args) {
		Thread th=new Thread();
		try {
			th.sleep(10000);
			System.out.println(date);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static String getTimeFmt(Calendar time){
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		TimeZone utc = TimeZone.getTimeZone("UTC");
		sdf.setTimeZone(utc);
		String timeFmt = sdf.format(time.getTime());
		//System.out.println(dateStr);
		return timeFmt;
	}
	
	@Test
	public void run() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar startTime = Calendar.getInstance();
		startTime.setTime(new Date());
		System.out.println(sdf.format(startTime.getTime()));
		startTime.add(Calendar.MINUTE, 30);
		System.out.println(sdf.format(startTime.getTime()));
		//System.out.println(12312);
//		String time="2017-10-17T09:43:35Z";
//		System.out.println(time);
//		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
//		TimeZone utc = TimeZone.getTimeZone("GMT");
//		sd.setTimeZone(utc);
//		System.out.println(time);
//		Date parse = sd.parse(time);
//		System.out.println(parse);
//		
//		Calendar endtime=Calendar.getInstance();
//		endtime.setTime(parse);
//		endtime.add(Calendar.SECOND, -1);
//		System.out.println(sd.format(endtime.getTime()));
		
		//System.out.println(sd.parse(time));
		
		
		
		
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");   
//        String d = "2008-10-13 15:20:25";   
//        try {   
//            System.out.println(sdf.parse(d));   
//        } catch (Exception e) {   
//        }   
//		
		
		
		
		
		
		
//		startTime.add(Calendar.MONTH, -6);
//		Calendar endTime = Calendar.getInstance();
//		endTime.setTime(new Date());
//		endTime.add(Calendar.MINUTE, -10);
		
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
//		TimeZone utc = TimeZone.getTimeZone("UTC");
//		sdf.setTimeZone(utc);
//		String timeFmt = sdf.format(endTime.getTime());
//		System.out.println("����ʱ��"+timeFmt);
		
		
//		String input = "2011-08-11T01:23:45.678Z";
//		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
//		f.setTimeZone(utc);
//		GregorianCalendar cal = new GregorianCalendar(utc);
//		cal.setTime(f.parse(input));
//		System.out.println(cal.getTime());
		
		
//		Calendar calendar = Calendar.getInstance();
//
//		SimpleDateFormat fds = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
//		String dateStr = fds.format(calendar.getTime());
//		System.out.println(dateStr);
		
		
	}
	@Test
	public void run3(){
		int i=1;
		i++;
		++i;
		System.out.println(i++);
	}
}
