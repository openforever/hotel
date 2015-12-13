package cn.edu.jlu.hotelms.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Tools {
	/**
	 * ����ַ����Ƿ�Ϊ��(null,"","null")
	 * @param s
	 * @return ��Ϊ���򷵻�true�����򷵻�false
	 */
	public static boolean notEmpty(String s){
		return s!=null && !"".equals(s) && !"null".equals(s);
	}
	
	/**
	 * ����ַ����Ƿ�Ϊ��(null,"","null")
	 * @param s
	 * @return Ϊ���򷵻�true�������򷵻�false
	 */
	public static boolean isEmpty(String s){
		return s==null || "".equals(s) || "null".equals(s);
	}
	
	/**
	 * �ַ���ת��Ϊ�ַ�������
	 * @param str �ַ���
	 * @param splitRegex �ָ���
	 * @return
	 */
	public static String[] str2StrArray(String str,String splitRegex){
		if(isEmpty(str)){
			return null;
		}
		return str.split(splitRegex);
	}
	
	/**
	 * ��Ĭ�ϵķָ���(,)���ַ���ת��Ϊ�ַ�������
	 * @param str	�ַ���
	 * @return
	 */
	public static String[] str2StrArray(String str){
		return str2StrArray(str,",\\s*");
	}
	
	/**
	 * ����yyyy-MM-dd HH:mm:ss�ĸ�ʽ������ת�ַ���
	 * @param date
	 * @return yyyy-MM-dd HH:mm:ss
	 */
	public static String date2Str(Date date){
		return date2Str(date,"yyyy-MM-dd HH:mm:ss");
	}
	
	/**
	 * ����yyyy-MM-dd HH:mm:ss�ĸ�ʽ���ַ���ת����
	 * @param date
	 * @return
	 */
	public static Date str2Date(String date){
		if(notEmpty(date)){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			try {
				return sdf.parse(date);
			} catch (ParseException e) {
				
				e.printStackTrace();
			}
			return new Date();
		}else{
			return null;
		}
	}
	
	/**
	 * ���ղ���format�ĸ�ʽ������ת�ַ���
	 * @param date
	 * @param format
	 * @return
	 */
	public static String date2Str(Date date,String format){
		if(date!=null){
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			return sdf.format(date);
		}else{
			return "";
		}
	}
	/**
	 * ����һ��Int �е�list�ļ��� Ȼ����������е�����ת���� 1,2,3,4  ��ʽ���ַ���
	 * @param integers
	 * @return
	 */
	public static String getStringByList(List<Integer> integers){
		String ss = "";
		for (int i = 0; i < integers.size()-1; i++) {
			ss = ss+integers.get(i)+",";
		}
		ss=ss+integers.get(integers.size()-1);
		return ss;
	}
	/**
	 * <br>
	 * <b>���ܣ�</b>�õ���������һ������ 0ʱ0��0��<br>
	 * <b>���ߣ�</b>���<br>
	 * <b>���ڣ�</b>2014-11-17 <br>
	 * <br>
	 * @return ��������һ������  ����Ϊ���һ��
	 */
	@SuppressWarnings("static-access")
	public static Date getMon(){
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int weekDay = calendar.get(calendar.DAY_OF_WEEK)-1;
		if(weekDay==0){
			weekDay = 7;
		}
	/*	System.out.println(weekDay);
		System.out.println(calendar.get(calendar.DATE));*/
		calendar.set(Calendar.DATE, calendar.get(calendar.DATE)-weekDay+1);
	/*	System.out.println(calendar.get(calendar.DATE));*/
		calendar.set(calendar.HOUR_OF_DAY, 0);
		calendar.set(calendar.MINUTE, 0);
		calendar.set(calendar.SECOND, 0);
		calendar.set(calendar.MILLISECOND, 0);
		date = calendar.getTime();
		return date;
	}
	/**
	 * <br>
	 * <b>���ܣ�</b>���ݸ�����ʱ��õ���������һ������ 0ʱ0��0��<br>
	 * <b>���ߣ�</b>���<br>
	 * <b>���ڣ�</b>2014-11-18 <br>
	 * <br>
	 * @return ��������һ������  ����Ϊ���һ��
	 */
	@SuppressWarnings("static-access")
	public static Date getMon(Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int weekDay = calendar.get(calendar.DAY_OF_WEEK)-1;
		if(weekDay==0){
			weekDay = 7;
		}
	/*	System.out.println(weekDay);
		System.out.println(calendar.get(calendar.DATE));*/
		calendar.set(Calendar.DATE, calendar.get(calendar.DATE)-weekDay+1);
	/*	System.out.println(calendar.get(calendar.DATE));*/
		calendar.set(calendar.HOUR_OF_DAY, 0);
		calendar.set(calendar.MINUTE, 0);
		calendar.set(calendar.SECOND, 0);
		calendar.set(calendar.MILLISECOND, 0);
		date = calendar.getTime();
		return date;
	}
	/**
	 * <br>
	 * <b>���ܣ�</b>����һ�����ڵõ���һ���������� �����ַ�������ʽ�ŵ�������  yyyy-mm-dd<br>
	 * <b>���ߣ�</b>���<br>
	 * <b>���ڣ�</b>2014-11-18<br>
	 * <br>
	 * @return ��������һ������  ����Ϊ���һ��
	 */
	public static List<String> getAllDateThisWeek(Date date){
		//System.err.println(date);
		List<String> dates = new ArrayList<String>();
		date = getMon(date);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(calendar.DATE, -1);
		for (int i = 0; i < 7; i++) {
			
			calendar.add(calendar.DATE, 1);
			date = calendar.getTime();
			String date1=date2Str(date, "yyyy-MM-dd");
			dates.add(date1);
		}
		return dates;
	}
}
