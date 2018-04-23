package com.zx.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
	public static String getSecondTimestamp(){ 
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
		} 
}
