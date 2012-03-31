package com.codemouse.net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import org.junit.Test;
import org.springframework.ui.context.Theme;


public class SocketBaseTest {
	
	@Test
	public void testSocket() throws UnknownHostException, IOException{
		String hostName = "localhost";
		int port = 8123;
		InetAddress address = null;
		Socket socket = new Socket(hostName, port);
		address = socket.getInetAddress();
		System.out.println(address);
		socket.close();
	}
	
	
}
