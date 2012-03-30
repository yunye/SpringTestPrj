package com.codemouse.net.multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiUsers extends Thread {
	private Socket client;

	public MultiUsers(Socket client) {
		this.client = client;
	}

	public void run() {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(
					this.client.getInputStream()));
			PrintWriter out = new PrintWriter(this.client.getOutputStream());
			
			while(true){
				String str = in.readLine();
				System.out.println(str);
				out.println("server has received: " + str);
				out.flush();
				if(str.equals("end")) break;
			}
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		System.out.println("Multi user Server: ");
		ServerSocket serverSocket = new ServerSocket(10002);
		while (true) {
			Socket client = serverSocket.accept();
			MultiUsers user = new MultiUsers(client);
			user.start();
		}
	}
}
