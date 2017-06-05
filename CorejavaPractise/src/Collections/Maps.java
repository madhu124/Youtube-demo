package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class Maps {

	public static void main(String[] args) {

		HashMap hm=new HashMap();
		hm.put(1, "abc");
		hm.put(2, 10);
		hm.put(3, null);
		hm.put(4, new Integer(10));
		hm.put(null,200);
	
		System.out.println(hm);
		Set s=hm.keySet();
		System.out.println("key values are "+s);
		Collection c= hm.values();
		System.out.println("values are "+c);
		
		Hashtable ht=new Hashtable();
		ht.put(4, "abc");
		ht.put(1, 100);
		ht.put(2, "abc");
		/*ht.put(3, null);
		ht.put(null, "200");*/
		
		
		System.out.println(ht);
		System.out.println("hash table doen't allows null values");
		
		
		
	}

}
