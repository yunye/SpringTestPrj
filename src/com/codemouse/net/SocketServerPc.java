package com.codemouse.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerPc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(10002);
			Socket client = server.accept();
			BufferedReader in = new BufferedReader(new InputStreamReader(client
					.getInputStream()));
			PrintWriter out = new PrintWriter(client.getOutputStream());
			
			while(true){
				String str = in.readLine();
				System.out.println(str);
				out.println("has receive ... ");
				out.flush();
				if(str.equals("end")){
					break;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
