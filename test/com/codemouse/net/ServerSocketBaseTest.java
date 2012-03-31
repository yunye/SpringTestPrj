package com.codemouse.net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import org.junit.Test;
import org.springframework.ui.context.Theme;


public class ServerSocketBaseTest {
	
	@Test
	public void testServerSocket() throws UnknownHostException, IOException{
		int port = 8123;
		ServerSocket server = new ServerSocket(port);
		while(true){
			Socket socket = server.accept();
			InetAddress address = socket.getInetAddress();
			System.out.println("Connection made to " + socket);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			socket.close();
		}
	}
}
