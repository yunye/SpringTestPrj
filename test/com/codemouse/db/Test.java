package com.codemouse.db;

import java.util.Date;
import java.util.Vector;

public class Test {
	public static void main(String[] args) {
		Date begin = new Date();
		Vector<Integer> vector = new Vector<Integer>();
		for (int i = 0; i < 100000; i++) {
			int a = (int) (Math.random() * 100000);
			Integer A = new Integer(a);
			vector.add(0, A);
		}
		TESTVector(vector);
		Date end = new Date(); 
		long times = (end.getTime() - begin.getTime()) / 1000;
		System.out.println(times);
	}

	private static void TESTVector(Vector<Integer> v) {
		Vector<Integer> ToDel = new Vector<Integer>();
		for (int i = 0; i < v.size(); i++) {
			Integer current = v.elementAt(i);
			if (ToDel.indexOf(current) == -1) {
				ToDel.add(0, current);
			} else {
				ToDel.remove(current);
			}
		}
		for (int i = 0; i < v.size(); i++) {
			Integer current = v.elementAt(i);
			if (ToDel.indexOf(current) != -1) {
				v.remove(current);
			}
		}
		//System.out.println(v.toString());
	}
}
