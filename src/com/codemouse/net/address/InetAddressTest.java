package com.codemouse.net.address;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
	public static void main(String[] args){
		String host = "172.19.4.85";
		InetAddress address = null;
		try {
			address = InetAddress.getByName(host);
		} catch (UnknownHostException e) {
			System.out.println("I can't find " + host);
			e.printStackTrace();
		}
		System.out.println(address.getHostName() + " = " + address.getHostAddress());
	}
}
