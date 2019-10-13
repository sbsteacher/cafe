package com.doheum.cafe;

public class CustomUtil {
	//문자열값 하나 받을꺼임, 리턴 정수값	
	public static int parseStringToInt(String target, int defaultValue) {
		int result = 0;
		
		try {
			result = Integer.parseInt(target);			
		} catch(Exception e) {
			result = defaultValue;
			//e.printStackTrace();
		} finally {
			
		}
				
		return result;
	}
}
