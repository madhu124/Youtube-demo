package Vakula.main;

import java.util.Scanner;

import Vakula.DaoImpl.StudentDAoImpl;


public class StudentDetails {

	static Scanner sc= new Scanner(System.in);
	static StudentDAoImpl sdao = new StudentDAoImpl();
public static void menu(){
	
	while(true){
		System.out.println("|---------------------|");
		System.out.println("| STUDENT DETAILS MENU ");
		System.out.println("|---------------------|");
	    System.out.println("|  1. ADD STUDENT     |");
	    System.out.println("|  2. EDIT STUDENT     |");
	    System.out.println("|  3. VIEW STUDENT     |");
	    System.out.println("|  4. DELETE STUDENT   |");
	    System.out.println("|  5. BACK     |");
	    System.out.println("------------------------");
        System.out.println("ENTER YOUR CHOICE ?");
	int choice =sc.nextInt();
	switch(choice)
	{
	case 1: sdao.addStudent();
	        break;
	        
	case 2: System.out.println("Enter student Number");
	        int sno1= sc.nextInt();
	        sdao.editStudent(sno1);
	         break;
	case 3: System.out.println(" Enter Student Number");
	         int sno= sc.nextInt();
	         sdao.viewStudent(sno);
	         
	        break;
	case 4: System.out.println("Enter student number");
	        int sno2= sc.nextInt();
	        sdao.deleteStudent(sno2);
	         break;
	         
	case 5: StudentManag.main(null);
	default : System.out.println("Please select choice range 1-5 only");
	
	}
	}
	
	
}
}
