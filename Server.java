package day16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
public Server() {
	ServerSocket ss;
	PrintWriter out;
	BufferedReader in,br;
	Socket s = null;
	try
	{
		ss=new ServerSocket(2000);	
		System.out.println("Server Ready...");
		while(true)
		{
			
			s=ss.accept();
			System.out.println(s);
			out=new PrintWriter(s.getOutputStream(),true);
			in=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a message...");
			String msg=in.readLine();
			out.println(msg);
			br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			String str=br.readLine();
			System.out.println("Meassage from client...."+str);
			
			
		
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
public static void main(String[] args) {
	new Server();
}
}
