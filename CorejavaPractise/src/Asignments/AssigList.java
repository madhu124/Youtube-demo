package Asignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class AssigList {

	public static void main(String[] args) {
		/*
		 * Hp.add("cus1"); Hp.add("cus2"); Hp.add("cus3"); Hp.add("cus4");
		 * Hp.add("cus5");
		 */
		String arrH[] = { "cus1", "cus2", "cus3", "cus4", "cus5" };

		ArrayList common = new ArrayList();
		/*
		 * Ind.add("cus6"); Ind.add("cus5"); Ind.add("cus7"); Ind.add("cus3");
		 * Ind.add("cus2");
		 */
		String arrI[] = { "cus6", "cus5", "cus7", "cus3", "cus2" };

		for (int i = 0; i < arrH.length; i++) {
			for (int j = 0; j < arrI.length; j++) {
				if (arrH[i] == arrI[j]) {
					common.add(arrH[i]);

				}

			}

		}

		System.out.println(common);
		Iterator it = common.iterator();
		System.out.println("-----------------Common Customers are------------");
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("-------Using RetainAll Method------------");
		ArrayList Hp = new ArrayList();
		Hp.add("emp1");
		Hp.add("emp2");
		Hp.add("emp3");
		Hp.add("emp4");
		Hp.add("emp5");

		LinkedList Ind = new LinkedList();
		Ind.add("emp6");
		Ind.add("emp5");
		Ind.add("emp7");
		Ind.add("emp3");
		Ind.add("emp2");

		Ind.retainAll(Hp);
		System.out.println(Ind);

		Iterator it1 = Ind.iterator();
		System.out.println("-----------------Common Customers are------------");
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		
	}

}
