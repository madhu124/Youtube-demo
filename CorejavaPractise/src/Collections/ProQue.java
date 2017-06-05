package Collections;

import java.util.PriorityQueue;

public class ProQue {

	
	public static void main(String[] args){
		PriorityQueue pq=new PriorityQueue();
		pq.add(10);
		pq.add(30);
		pq.add(40);
		pq.add(23);
		System.out.println(pq);
		pq.remove();
	
		System.out.println(pq);
	    pq.remove(40);
		System.out.println(pq);
	
	
	}
}
