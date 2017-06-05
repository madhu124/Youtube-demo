package collections;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListVect {
	
	public static void main(String[] args){
		/*for all the list collections that id arraylist,linkedlist,vector
		 * has same methods 
		 */
		
		
	//arrayList declaration
		//ArrayList mylist=new ArrayList();
		//List mylist=new ArrayList();
		List mylist=new LinkedList();
		//List mylist=new Vector();
		//insert values
mylist.add("vakula");	
mylist.add(100);
mylist.add(15);
mylist.add(10);

      // getvalues

/*char b=(Character)mylist.get(2);
System.out.println("character value is " +b);*/

//size of arraylist
int i=mylist.size();
System.out.println("size of arraylist is" +i);

//Insert inbetween

	mylist.add(2, 10.5);
System.out.println("element at index 2 is" +mylist.get(2));
System.out.println("new size of mylist is " +mylist.size());

//to print all elements

for( i=0 ;i< mylist.size();i++){
	
	System.out.println( i+ "element is " +mylist.get(i));	
}
//restrict to some datatypes and this concepts is called generics

		List<String> myStringlist= new ArrayList<String>(); //only for Strings
		myStringlist.add("vakula");
		// myStringlist.add(100); we cannot add anything other than Strings similarly others
	System.out.println("-------------------");	
		List<Integer> myIntlist= new ArrayList<Integer>(); // only add inetgers
		
	myIntlist.add(10);
	myIntlist.add(15);
	myIntlist.add(45);
	//mylist.addAll(myIntlist);
    mylist.addAll(0, myIntlist);
	for( i=0 ;i< mylist.size();i++){
		
		System.out.println( i+ "element is " +mylist.get(i));	
	}
	System.out.println(mylist.indexOf(10));
	
	System.out.println("-------------------");	
	mylist.removeAll(myIntlist);
for( i=0 ;i< mylist.size();i++){
		
		System.out.println( i+ "element is " +mylist.get(i));	
		
	}
System.out.println("-------------------");	

mylist.set(1, "hfjynhv");
System.out.println(mylist.get(1));
	}

}
