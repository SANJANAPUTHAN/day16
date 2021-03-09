package day16;

public class StringFormattingDemo {
public static void main(String[] args) {
	met(1,2,3,4,5);
	
	System.out.printf("%-15s%-15s%s","Column1","Column2","Column3");
	System.out.printf("\nInteger value.....%06d....%s...%.3f....",300,"Sanjana",9.0987888);
}

public static void met(int... i)
{
	for(int ii:i)
	{
		System.out.println(ii);
	}
}
}