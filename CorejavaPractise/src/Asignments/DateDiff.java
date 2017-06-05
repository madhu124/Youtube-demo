package Asignments;

import java.util.Date;

public class DateDiff {

	public static void main(String[] args) {

		Date d1 = new Date();
		long t1= d1.getTime();
		System.out.println("End date in milli seconds " +t1);
		
		Date d2 = new Date("1/1/2011");
		long t2= d2.getTime();
		System.out.println("Start date in milli seconds "+t2);
		long t=t1-t2;
		
		System.out.println("Difference in milli seconds " +t);
		long sec=(60*60*24*1000);
		long d= t/sec ;
		System.out.println("Difference between start and end date in days "+d);
		
		
	}

}
