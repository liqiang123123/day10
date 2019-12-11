package com.lq.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class MyTest {

	@Test
	public void test1() throws ParseException{
		SimpleDateFormat  sdf=new SimpleDateFormat("yyyy-MM-dd");
		int age = DateUtils.getAge(sdf.parse("1999-05-13"));
		Date dateByMonthInit = DateUtils.getDateByMonthInit(sdf.parse("2019-12-12"));
		System.out.println(dateByMonthInit);
		Date dateByMonthLast = DateUtils.getDateByMonthLast(sdf.parse("2019-12-11"));
		System.out.println(dateByMonthLast);
		int daysByFuture = DateUtils.getDaysByFuture(sdf.parse("2020-01-01"));
		System.out.println(daysByFuture);
		int dateByMonthInit2 = DateUtils.getDaysByDeparted(sdf.parse("2019-12-01"));
		System.out.println(dateByMonthInit2);
	}
}
 