package Collections;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int element,pos,choice;
System.out.println("-------------------------------");
System.out.println("-------Stack Operation---------");
System.out.println("-------------------------------");
System.out.println("| 1.push an element           |");
System.out.println("| 2.pop an element            |");
System.out.println("| 3.search an element         |");
System.out.println("| 4.exit                      |");
System.out.println("-------------------------------");
System.out.println("Enter your choice");
Stack stack=new Stack();
choice=sc.nextInt();
switch(choice){
case 1:System.out.println("eneter stacvk element");
     element=sc.nextInt();
     stack.push(element);
     System.out.println(stack);
     break;
     
case 2: stack.pop();
        System.out.println("Stack elements " +stack);
        break;
        
        
        
case 3:System.out.println("Enter the search element");
       element=sc.nextInt();
       pos=stack.search(element);
       System.out.println("your element available at " +pos);
       break;
       
case 4:System.exit(0);
break;
default:System.out.println("please select choice range from 1-4 only");
break;
}


	}

}
