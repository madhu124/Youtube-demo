package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class AddObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Student> st1=new ArrayList<Student>();
Student s1=new Student(100,"A1");
Student s2=new Student(200,"A2");
st1.add(s1);
st1.add(s2);
st1.add(s1);
st1.add(new Student(300,"A3"));
for(int i=0;i<st1.size();i++){
	Student x=st1.get(i);
	System.out.println(x);
	
}
System.out.println("--------------");

List list=new ArrayList();
list.add(new Object());
list.add("hi");
list.add(100);
System.out.println(list.get(1));
System.out.println("--------------");

//Set<Student> studentSet=new HashSet<Student>();
Set<Student> studentSet=new LinkedHashSet<Student>();

studentSet.add(s1);
studentSet.add(s2);
studentSet.add(new Student(300,"A3"));
studentSet.add(s1);

Iterator<Student> it=studentSet.iterator();
while(it.hasNext()){
	Student x1= it.next();
	System.out.println(x1);
}


	}

}
