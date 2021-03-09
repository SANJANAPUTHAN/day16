package day16;

import java.net.InetAddress;

public class InetDemo {
public static void main(String[] args) throws Exception {
	InetAddress inet=InetAddress.getByName("www.google.com");
	System.out.println(inet.getHostAddress());
	
	InetAddress inetall[]=InetAddress.getAllByName("www.irctc.co.in");
	for(InetAddress add:inetall)
	{
		System.out.println(add.getHostName()+" "+add.getHostAddress());
	}
	
	InetAddress address=InetAddress.getByAddress(new byte[] {103,18,30,80});
	System.out.println(address.getHostName());
	
}
}
