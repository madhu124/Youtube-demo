package Practice;

import java.util.Scanner;

public class Widening1 {
	public void f1(Object o1)
	{
	System.out.println("Inside f1 with object as argument");
	}
	public void f1(String s)
	{
	System.out.println("Inside f1 with String as argument");
	}
	public static void main(String[] args)
	{
		

        Scanner scan = new Scanner(System.in);	
        String s=scan.nextLine();

        System.out.println("String: " + s);

	}

	

}