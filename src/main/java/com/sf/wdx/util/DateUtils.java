package com.sf.wdx.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 描述：日期工具类
 * @author 80002888
 * @date   2018年8月30日
 */
public class DateUtils {

	/**
	 * 同步锁1
	 */
	private static final Object LOCK_1 = new Object();
	
	/**
	 * 同步锁2
	 */
	private static final Object LOCK_2 = new Object();
	
	/**
	 * 日期转字符串
	 *	@ReturnType	String 
	 *	@Date	2018年8月30日	上午9:53:06
	 *  @Param  @param date
	 *  @Param  @param pattern
	 *  @Param  @return
	 */
	public static String date2String(Date date, String pattern){
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		synchronized (LOCK_1) {
			return sdf.format(date);
		}
	}
	
	/**
	 * 字符串转日期
	 *	@ReturnType	Date 
	 *	@Date	2018年8月30日	上午9:53:28
	 *  @Param  @param string
	 *  @Param  @param pattern
	 *  @Param  @return
	 *  @Param  @throws Exception
	 */
	public static Date string2Date(String string, String pattern) throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		synchronized (LOCK_2) {
			return sdf.parse(string);
		}
	}
	
}
