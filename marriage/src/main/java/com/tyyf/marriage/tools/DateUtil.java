package com.tyyf.marriage.tools;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class DateUtil {
	
	private static SimpleDateFormat dateFormat = null;
	static java.text.SimpleDateFormat sdfLong = new java.text.SimpleDateFormat("yyyy-MM-dd");
    static 
    {
    	dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setLenient(false);
    }

    public static boolean isValidDate(String s)
    {
        try
        {
             dateFormat.parse(s);
             return true;
         }
        catch (Exception e)
        {
            // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
            return false;
        }
    }

    // 下面这个方法则可以将一个日期按照你指定的格式输出
    public static String formatDate(Date d)
    {
        return dateFormat.format(d);
    }
    
    // 获得当天0点时间  
    public static Date getTimesmorning() {  
        Calendar cal = Calendar.getInstance();  
        cal.set(Calendar.HOUR_OF_DAY, 0);  
        cal.set(Calendar.SECOND, 0);  
        cal.set(Calendar.MINUTE, 0);  
        cal.set(Calendar.MILLISECOND, 0);  
        return cal.getTime();  
  
  
    }  
    // 获得昨天0点时间  
    public static Date getYesterdaymorning() {  
        Calendar cal = Calendar.getInstance();  
        cal.setTimeInMillis(getTimesmorning().getTime()-3600*24*1000);  
        return cal.getTime();  
    }  
    // 获得当天近7天时间  
    public static Date getWeekFromNow() {  
        Calendar cal = Calendar.getInstance();  
        cal.setTimeInMillis( getTimesmorning().getTime()-3600*24*1000*7);  
        return cal.getTime();  
    }  
  
    // 获得当天24点时间  
    public static Date getTimesnight() {  
        Calendar cal = Calendar.getInstance();  
        cal.set(Calendar.HOUR_OF_DAY, 24);  
        cal.set(Calendar.SECOND, 0);  
        cal.set(Calendar.MINUTE, 0);  
        cal.set(Calendar.MILLISECOND, 0);  
        return cal.getTime();  
    }  
  
    // 获得本周一0点时间  
    public static Date getTimesWeekmorning() {  
        Calendar cal = Calendar.getInstance();  
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONDAY), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);  
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);  
        return cal.getTime();  
    }  
  
    // 获得本周日24点时间  
    public static Date getTimesWeeknight() {  
        Calendar cal = Calendar.getInstance();  
        cal.setTime(getTimesWeekmorning());  
        cal.add(Calendar.DAY_OF_WEEK, 7);  
        return cal.getTime();  
    }  
  
    // 获得本月第一天0点时间  
    public static Date getTimesMonthmorning() {  
        Calendar cal = Calendar.getInstance();  
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONDAY), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);  
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));  
        return cal.getTime();  
    }  
  
    // 获得本月最后一天24点时间  
    public static Date getTimesMonthnight() {  
        Calendar cal = Calendar.getInstance();  
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONDAY), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);  
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));  
        cal.set(Calendar.HOUR_OF_DAY, 24);  
        return cal.getTime();  
    }  
  
    public static Date getLastMonthStartMorning() {  
        Calendar cal = Calendar.getInstance();  
        cal.setTime(getTimesMonthmorning());  
        cal.add(Calendar.MONTH, -1);  
        return cal.getTime();  
    }  
  
    public static Date getCurrentQuarterStartTime() {  
        Calendar c = Calendar.getInstance();  
        int currentMonth = c.get(Calendar.MONTH) + 1;  
        SimpleDateFormat longSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        SimpleDateFormat shortSdf = new SimpleDateFormat("yyyy-MM-dd");  
        Date now = null;  
        try {  
            if (currentMonth >= 1 && currentMonth <= 3)  
                c.set(Calendar.MONTH, 0);  
            else if (currentMonth >= 4 && currentMonth <= 6)  
                c.set(Calendar.MONTH, 3);  
            else if (currentMonth >= 7 && currentMonth <= 9)  
                c.set(Calendar.MONTH, 4);  
            else if (currentMonth >= 10 && currentMonth <= 12)  
                c.set(Calendar.MONTH, 9);  
            c.set(Calendar.DATE, 1);  
            now = longSdf.parse(shortSdf.format(c.getTime()) + " 00:00:00");  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return now;  
    }  
  
    /** 
     * 当前季度的结束时间，即2012-03-31 23:59:59 
     * 
     * @return 
     */  
    public static Date getCurrentQuarterEndTime() {  
        Calendar cal = Calendar.getInstance();  
        cal.setTime(getCurrentQuarterStartTime());  
        cal.add(Calendar.MONTH, 3);  
        return cal.getTime();  
    }  
  
  
    public static Date getCurrentYearStartTime() {  
        Calendar cal = Calendar.getInstance();  
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONDAY), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);  
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.YEAR));  
        return cal.getTime();  
    }  
  
    public static Date getCurrentYearEndTime() {  
        Calendar cal = Calendar.getInstance();  
        cal.setTime(getCurrentYearStartTime());  
        cal.add(Calendar.YEAR, 1);  
        return cal.getTime();  
    }  
  
    public static Date getLastYearStartTime() {  
        Calendar cal = Calendar.getInstance();  
        cal.setTime(getCurrentYearStartTime());  
        cal.add(Calendar.YEAR, -1);  
        return cal.getTime();  
    } 
    
    public static Date geLastWeekMonday() {  
        Calendar cal = Calendar.getInstance();  
        cal.setTime(getTimesWeekmorning());  
        cal.add(Calendar.DATE, -7);  
        return cal.getTime();  
    }  
    
    /***
	 * 计算两个时间差
	 * @param dateStart 开始时间
	 * @param dateStop结束时间
	 * @return
	 */
	public static final String computeTimeDifference(String str1,String str2){
		 DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	        Date one;  
	        Date two;  
	        long day = 0;  
	        long hour = 0;  
	        long min = 0;  
	        long sec = 0;  
	        try {  
	            one = df.parse(str1);  
	            two = df.parse(str2);  
	            long time1 = one.getTime();  
	            long time2 = two.getTime();  
	            long diff ;  
	            if(time1<time2) {  
	                diff = time2 - time1;  
	            } else {  
	                diff = time1 - time2;  
	            }  
	            day = diff / (24 * 60 * 60 * 1000);  
	            hour = (diff / (60 * 60 * 1000) - day * 24);  
	            min = ((diff / (60 * 1000)) - day * 24 * 60 - hour * 60);  
	            sec = (diff/1000-day*24*60*60-hour*60*60-min*60);  
	        } catch (ParseException e) {  
	            e.printStackTrace();  
	        }  
	        return hour + ":" + min + ":" + sec ;  
	    }  
	
	/**
	 * 取得系统当前日期，返回默认日期格式的字符串。
	 * 
	 * @param strFormat
	 * @return
	 */
	public static String nowDate(String strFormat) {
		java.util.Date date = new java.util.Date();
		return getDateParser(strFormat).format(date);
	}
	
	private static HashMap<Object, Object> parsers = new HashMap<Object, Object>();
	
	private static SimpleDateFormat getDateParser(String pattern) {
		Object parser = parsers.get(pattern);
		if (parser == null) {
			parser = new SimpleDateFormat(pattern);
			parsers.put(pattern, parser);
		}
		return (SimpleDateFormat) parser;
	}
	
	/**
	 * @Example:2008-05-15
	 * @return:String
	 * @throws:java.lang.Exception
	 */
	public static String getDateLong(Date date) {
		String nowDate = "";
		try {
			if (date != null)
				nowDate = sdfLong.format(date);
			return nowDate;
		} catch (Exception e) {
			System.out.println("Error at getDate:" + e.getMessage());
			return "";
		}
	}
	
	/**
	 * 日期时间的 加减
	 * 
	 * @param dat
	 *            日期时间 null默认为当前时间
	 * @param type
	 *            时间间隔的类型 Calendar.DATE Calendar.MINUTE(分), Calendar.HOUR
	 *            Calendar.MONTH 之类的
	 * @param days
	 *            退移的值
	 * @return
	 */
	public static Date dateAddDays(Date dat, int type, int days) {
		if (null == dat) {
			dat = new Date();
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(dat);
		cal.add(type, days);
		Date date = cal.getTime();
		return date;
	}
}
