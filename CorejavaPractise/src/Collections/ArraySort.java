package Collections;

import java.util.Arrays;
import java.util.*;

public class ArraySort {

	public static void main(String[] args) {
		int[] arr={60,20,30,40};
		Arrays.sort(arr);

		for(int i:arr){
			System.out.println(i);
		}
	
	ArrayList ls=new ArrayList();
	ls.add(10);
	ls.add(6);
	ls.add(9);
	ls.add(2);
	System.out.println("Before sorting"+ls);
	Collections.sort(ls);
	System.out.println("After sorting "+ls);
	}

}
