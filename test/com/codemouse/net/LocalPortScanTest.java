package com.codemouse.net;

import java.io.IOException;
import java.net.ServerSocket;

import org.junit.Test;


public class LocalPortScanTest {
	@Test
	public void testLocalPortSacn(){
		for(int i = 0; i <= 1024; i++){
			testPort(i);
		}
		System.out.println("Completed.");
	}
	

	private void testPort(int port){
		try {
			@SuppressWarnings("unused")
			ServerSocket socket = new ServerSocket(port);
		} catch (IOException e) {
			System.out.println("port is inuse: " + port);
		}
	}
}
