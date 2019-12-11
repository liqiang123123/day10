package com.lq.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {

	/**
	 * 方法1：根据传入的日期获取年龄
	 * @param src
	 * @return
	 */
	//示例:
	public static int getAge (Date src) {
		
		long time2 = src.getTime();
		Date date=new Date();
		long time3 = date.getTime();
		long time = (time3-time2)/(1000*60*60*24);
		System.out.println(time);
		return  (int) time;
		
	}
	
	
	
	/**
	 * 方法2：根据传入的参数获取该日期的月初日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-01 00:00:00”
	 * @param src
	 * @return
	 */
	//示例:
	public static Date getDateByMonthInit (Date src) {
		Calendar instance = Calendar.getInstance();
		int year = instance.get(Calendar.YEAR);
		int month = instance.get(Calendar.MONTH);
		int day = instance.get(Calendar.DAY_OF_YEAR);
		instance.set(Calendar.YEAR, year);
		instance.set(Calendar.MONTH, month);
		instance.set(Calendar.DAY_OF_YEAR, day);
		instance.set(Calendar.HOUR, 0);
		instance.set(Calendar.SECOND, 0);
		instance.set(Calendar.MINUTE, 0);
		instance.set(Calendar.MILLISECOND, 0);
		return instance.getTime();
	}
	
	/**
	 * 方法3 :根据传入的参数获取该日器的月末日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-30 23:59:59”，注意月大月小以及闰年

	 */
	//示例:
	public static Date getDateByMonthLast(Date src) {
		Calendar instance = Calendar.getInstance();
		instance.setTime(src);
		int nowYear = instance.get(Calendar.YEAR);
		int nowMonth = instance.get(Calendar.MONTH);
		instance.set(Calendar.YEAR, nowYear);
		instance.set(Calendar.MONTH, nowMonth);
		instance.set(Calendar.DAY_OF_YEAR, 30);
		instance.set(Calendar.HOUR, 23);
		instance.set(Calendar.SECOND, 59);
		instance.set(Calendar.MINUTE, 59);
		return instance.getTime();
		
	}

	
	/**
	 * 方法4：求未来日期离今天还剩的天数
	 * @param future
	 * @return
	 */
	//示例:
	public static int getDaysByFuture (Date future) {
		Date now=new Date();
		return (int)((future.getTime()-now.getTime())/(1000*60*60*24));
	}
	
	
	/**
	 * 方法5：求过去日期离今天过去的天数
	 * @param departed
	 * @return
	 */
	//示例:
	public static int getDaysByDeparted (Date departed) {
		Date now=new Date();
		return (int)((now.getTime()-departed.getTime())/(1000*60*60*24));
	}




}
