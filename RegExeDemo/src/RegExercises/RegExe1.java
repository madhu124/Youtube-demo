package RegExercises;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegExe1 {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("enter input string");
String name=sc.next();
while(!Pattern.matches("[a-zA-Z0-9]", name)){
	System.err.println("given string not matched please provide correct input");

name=sc.next();

}
System.out.println("your string is correct input");
	}

}
