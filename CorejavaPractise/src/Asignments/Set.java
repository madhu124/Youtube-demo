package Asignments;

import java.util.HashSet;
import java.util.Iterator;

public class Set {

	
	public static void main(String[] args){
		HashSet hs=new HashSet();
	hs.add(10);
	hs.add("vakula");
hs.add(10);
hs.add(new Integer(30));
hs.add("abc");
System.out.println(hs);
System.out.println(hs.contains("abc"));
System.out.println("Set doesnt follow any order");
	

Iterator it= hs.iterator();

while(it.hasNext()){
	System.out.println(it.next());
}

String s="madam";
String rev="";
int length = s.length();

for ( int i = length - 1; i >= 0; i-- )
   rev = rev + s.charAt(i);

if (s.equals(rev))
   System.out.println("Entered string is a palindrome.");
else
   System.out.println("Entered string is not a palindrome.");
	
}
}