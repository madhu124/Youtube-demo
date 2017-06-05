package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map myMap=new Hashtable();
//add values
 myMap.put(100, "s1");
 myMap.put(200, "s2");
 myMap.put(800, "s3");
 myMap.put(400, "s4");
 myMap.put(500, "s5");

 System.out.println(" intially size is " +myMap.size());

 //remove values 
 
 myMap.remove(400);
 System.out.println("after removing size is " +myMap.size());
 
 //get values
 Set s1= myMap.keySet();
 Iterator<Integer> it1= s1.iterator();
 
while(it1.hasNext()){
	int temp=it1.next();
	System.out.print(temp);
	System.out.print("---");
System.out.println(myMap.get(temp));
	
}	
	}

}
