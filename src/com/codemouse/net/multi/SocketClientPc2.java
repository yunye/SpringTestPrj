package com.codemouse.net.multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketClientPc2 {
	private static final String name = "Client PC 2#";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(name + ":");
		try {
			Socket server = new Socket(InetAddress.getLocalHost(), 10002);
			BufferedReader in = new BufferedReader(new InputStreamReader(server
					.getInputStream()));
			PrintWriter out = new PrintWriter(server.getOutputStream());
			BufferedReader wt = new BufferedReader(new InputStreamReader(
					System.in));
			
			while(true){
				String str = wt.readLine();
				out.println(str);
				out.flush();
				if(str.equals("end")){
					break;
				}
				System.out.println(in.readLine());
			}
			server.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
