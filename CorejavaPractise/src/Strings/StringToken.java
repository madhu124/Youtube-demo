package Strings;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1= "Hello every one almost core java is completing soon";

StringTokenizer st= new StringTokenizer(s1, " ");

while(st.hasMoreTokens()){
	System.out.println(st.nextToken());
}
	
	}

}
