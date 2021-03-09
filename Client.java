package day16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
public Client() {

	Socket s;
	BufferedReader br,in;
	PrintWriter out = null;
	try
	{
		while(true)
		{
			s=new Socket("localhost",2000);
			br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			String msg1=br.readLine();
			System.out.println("Message from server....");
			System.out.println(msg1);
			out=new PrintWriter(s.getOutputStream(),true);
			in=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a message.....");
			String message=in.readLine();
			out.println(message);
		}
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public static void main(String[] args) {
	new Client();
}
}
