package day16;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringDemo {
public static void main(String[] args) {
	String s="Hello";
	String s1=new String("World");
	
	String temp=s;
	s=s+s1;
	System.out.println(s);
	System.out.println(s1);
	System.out.println(temp);
	
	StringBuilder sb=new StringBuilder("hello");
	System.out.println(sb);
	sb.append("world");
	System.out.println(sb);
	
	
	StringBuffer sbf=new StringBuffer("hello");
	System.out.println(sbf);
	sbf.append("world");
	System.out.println(sbf);
	
	StringJoiner sj=new StringJoiner(",");
	sj.add("hello");
	sj.add("world");
	System.out.println(sj);
	
	StringJoiner sjf=new StringJoiner(",", "(", ")");
	sjf.add("hello");
	sjf.add("world");
	System.out.println(sjf);
	
	StringTokenizer token=new StringTokenizer(sjf.toString(),",");
	while(token.hasMoreElements()) {
		System.out.println(token.nextToken());
	}
	
}
}
