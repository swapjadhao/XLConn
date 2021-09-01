package SQLConnection;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Date D= new Date();
	System.out.println(D.toString());
	SimpleDateFormat SDF= new SimpleDateFormat("M/dd/yyyy");
	SimpleDateFormat SDF1= new SimpleDateFormat("dd/M/yyy");
	System.out.println(SDF);
	System.out.println(SDF.format(D));
	System.out.println(SDF1.format(D));
	
	Calendar Cal= Calendar.getInstance();
	System.out.println(SDF.format(Cal.getTime()));
	System.out.println(SDF.format(Cal.getFirstDayOfWeek()));
	System.out.println(Cal.get(Calendar.DATE));
	System.out.println(Cal.get(Calendar.HOUR));
	System.out.println(Cal.get(Calendar.YEAR));
	
	}

}
