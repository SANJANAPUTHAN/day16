package MultithreadedServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client { 
	public static void main(String[] args) throws Exception
	{ 
		Socket socket = new Socket("localhost", 1234);
		try  
		{
			BufferedReader br=null;
			PrintWriter out=null;
			BufferedReader in=null;
			while(true) 
			{
				br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String msg1=br.readLine();
				System.out.println("Message from server....");
				System.out.println(msg1);
				out=new PrintWriter(socket.getOutputStream(),true);
				in=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter a message.....");
				String message=in.readLine();
				out.println(message);
		    }
		} 
		catch (Exception e)
		{ 
			   e.printStackTrace(); 
		} 
	} 
}
