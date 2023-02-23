package Practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Calender {

	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());

		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sd = new SimpleDateFormat("HH_mm_ss_dd_MM_yyyy");
		String date = sd.format(d);
		
		System.out.println(date);
	}
	
	

}
