package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Set<String> mySet=new HashSet<String>();
//Set mySet=new LinkedHashSet();
Set mySet=new TreeSet();


//add elemnts
mySet.add(1);
mySet.add(4);
mySet.add(3);
System.out.println(mySet.size());

//remove values
//mySet.remove("C");
 //System.out.println(mySet.size());
 
 //print values
 //mySet.add("C");
 System.out.println(mySet.size());

 Iterator it= mySet.iterator();
 
/*System.out.println(it.next());
System.out.println(it.next());
//System.out.println(it.next());
System.out.println(it.hasNext());*/


for(int i=0;i<mySet.size();i++){
	System.out.println(it.hasNext());

System.out.println(it.next());


	}

}
}
