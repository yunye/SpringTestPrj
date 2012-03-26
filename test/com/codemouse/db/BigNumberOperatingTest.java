package com.codemouse.db;

import org.junit.Test;

public class BigNumberOperatingTest {
	@Test
	public void testAddTwoBigNumber(){
		//int a = 999999999 , b = 999999999;
		int a = Integer.MAX_VALUE , b = Integer.MAX_VALUE;
		String result = this.add(String.valueOf(a), String.valueOf(b));
		System.out.println(a + " + " + b + " = " + (a + b) + " (standard)");
		System.out.println(a + " + " + b + " = " + result);
	}
	private String add(String num1, String num2){
		int len = num1.length() >= num2.length()? num1.length() : num2.length();
		String rs = ""; 
		boolean isJW = false;
		for(int i = 0; i < len; i++){
			int x = 0, y = 0;
			if(i < num1.length()){
				x = Integer.parseInt(String.valueOf(num1.charAt(num1.length() - i - 1)));
			}
			if(i < num2.length()){
				y = Integer.parseInt(String.valueOf(num2.charAt(num2.length() - i - 1)));
			}
			int sum = x + y;
			if(isJW){
				sum += 1;
			}
			if(sum >= 10){
				isJW = true;
				sum = sum - 10;
			}else{
				isJW = false;
			}
			rs = sum + rs;
			if(i == len -1 && isJW){
				rs = 1 + rs;
			}
		}
		return rs;
	}
}
