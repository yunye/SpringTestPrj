package com.codemouse.net.multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerPc {
	private static final String name = "Server PC";
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		System.out.println(name + ":");
		ServerSocket server = new ServerSocket(10002);
		while(true){
			Socket client = server.accept();
			BufferedReader in = new BufferedReader(new InputStreamReader(client
					.getInputStream()));
			PrintWriter out = new PrintWriter(client.getOutputStream());
			
			while(true){
				String str = in.readLine();
				System.out.println(str);
				out.println(name + " has received ... [" + str +  "]");
				out.flush();
				if(str.equals("end")){
					break;
				}
			}
			client.close();
		}
	}

}
