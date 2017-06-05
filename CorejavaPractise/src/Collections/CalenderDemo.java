package Collections;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CalenderDemo {

	public static void main(String[] args){
		Calendar cl=  Calendar.getInstance();
		
		
		int d= cl.get(Calendar.DATE);
		int m= cl.get(Calendar.MONTH);
		++m;
		int y= cl.get(Calendar.YEAR);
		
		System.out.println(d +"/"+ m+"/"+y);
		System.out.println("---time--------");
		int h= cl.get(Calendar.HOUR);
		int mm= cl.get(Calendar.MINUTE);
		int ss= cl.get(Calendar.SECOND);
		System.out.println(h +"-"+ mm+"-"+ss);
		 
		

		 System.out.println("----Date Class-----");
Date date= new Date();

System.out.println(date);
 DateFormat df= DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG
		 ,Locale.US);
String result=df.format(date);		
System.out.println(result);		
	}
}
