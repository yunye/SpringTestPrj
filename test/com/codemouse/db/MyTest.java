package com.codemouse.db;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class MyTest {
	public static void main(String[] args) {
		
		MyTest myTest = new MyTest();
		Vector<Integer> vector = myTest.initVector(100000);
		myTest.testVector(vector);
	}
	
	/**
	 * 初始化Vector集合.
	 * @param size
	 * @return
	 */
	private Vector<Integer> initVector(int size){
		Vector<Integer> vector = new Vector<Integer>(size);
		for (int i = 0; i < size; i++) {
			Integer ele = new Integer((int) (Math.random() * 100000));
			vector.add(ele);
		}
		return vector;
	}
	
	/**
	 * 打印Vector集合中“出现了偶数次的随机数”
	 * @param v
	 */
	private void testVector(Vector<Integer> v) {
		//记录每个随机数出现的次数
		Map<Integer, Integer> counterMap = new HashMap<Integer, Integer>();
		for(Integer ele: v){
			int counter = 1;
			if(counterMap.containsKey(ele)){
				counter = counterMap.get(ele).intValue() + 1;
			}
			counterMap.put(ele, counter);
		}
		
		StringBuffer buffer = new StringBuffer();
		//查找出现了偶数次的随机数
		for(Map.Entry<Integer, Integer> entry: counterMap.entrySet()){
			Integer ele = entry.getKey();
			int counter = entry.getValue().intValue();
			if(counter % 2 == 0){
				buffer.append(ele.toString()).append(",");
			}
		}
		String result = buffer.substring(0, buffer.lastIndexOf(",")).toString();
		
		System.out.println(result);
	}
}
