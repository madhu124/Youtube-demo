package Collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Lists {

	public static void main(String[] args) {
ArrayList ls=new ArrayList();
ls.add(10);
ls.add(new Integer(23));
ls.add(33);
ls.add(44);
ls.add(55);
System.out.println(ls);
System.out.println("Insertion order is preserved and allows duplicates");
System.out.println("forward direction");
 ListIterator it1= ls.listIterator();
while(it1.hasNext()){
	System.out.println(it1.next());
}
System.out.println("------using iterator-----");
Iterator it2=ls.iterator();
while(it2.hasNext()){
	System.out.println(it2.next());
}

System.out.println("---------linked list-------");
LinkedList list=new LinkedList();
list.add(10);
list.add(new Integer(30));
list.add(18);
list.add(58);
list.add("vakula");
System.out.println("List elements are" +list);
list.addFirst(100);
list.addLast("200");
System.out.println("after adding elements  list is " +list);
Iterator it= list.iterator();
while(it.hasNext()){
	System.out.println(it.next());
}

System.out.println("-------Vector---------");

Vector v=new Vector();
int arr[]={10,20,30,40,10};

for(int i=0;i<arr.length;i++){
	v.add(arr[i]);
	
}
System.out.println("vector elements are "+ v);
System.out.println("-----vector element by element----------");
for(int i=0;i<v.size();i++){
	System.out.println(v.get(i));
}

System.out.println("----Using enumeration element by element---");

Enumeration e=v.elements();
while(e.hasMoreElements()){
	System.out.println(e.nextElement());
}


	}

}
