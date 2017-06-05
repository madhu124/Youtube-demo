package Vakula.DaoImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import Vakula.Student.Student;
import Vakula.StudentDao.StudentDAo;

public class StudentDAoImpl implements StudentDAo {
	static Scanner sc = new Scanner(System.in);

	@Override
	public void addStudent() {
		try {

			boolean flag = true;
			ArrayList<Student> students = new ArrayList<Student>();
			FileOutputStream fos = new FileOutputStream("student.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			while (flag) {
				System.out.println("Enter Student Number");
				int sno = sc.nextInt();
				System.out.println("Enter Student Name");
				String name = sc.next();
				System.out.println("Enter Course Name");
				String cname = sc.next();
				System.out.println("Enter course fee");
				double fee = sc.nextDouble();
				Student s = new Student(sno, name, cname, fee);
				students.add(s);
				System.out.println("Do you want more records press 1 else type any number ?");
				int choice = sc.nextInt();
				if (choice == 1) {
					flag = true;
				} else {
					flag = false;
				}
			}
			oos.writeObject(students);
			System.out.println("Student Object Writing completed");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void editStudent(int sno1) {
		// TODO Auto-generated method stub
		try {
			File f1 = new File("student.txt");
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f1));
			ArrayList<Student> students = (ArrayList<Student>) ois.readObject();
			Iterator<Student> it = students.iterator();
			while (it.hasNext()) {
				Student s = it.next();
				if (s.sno == sno1) {
					s.setSno(sno1);
					System.out.println("Enter student name");
					String name = sc.next();
					s.setSname(name);
					System.out.println("Enter Student course");
					String cname = sc.next();
					s.setCourse(cname);
					System.out.println("Enter student fee");
					double sfee = sc.nextDouble();
					s.setFees(sfee);

				}

				else {
					students.add(s);
				}

			}

			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f1));
			oos.writeObject(students);
			System.out.println("Student record updated");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deleteStudent(int sno) {
		// TODO Auto-generated method stub

		try {
			File f = new File("student.txt");
			File f1 = null;
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));

			ArrayList<Student> students = (ArrayList<Student>) ois.readObject();

			for (Student s : students) {

				if (s.sno == sno) {
					System.out.println("recoed deleted");
				} else {

					f1 = new File("temp.txt");
					ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f1));
					oos.writeObject(students);

					f1.renameTo(f);
				}

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void viewStudent(int sno1) {

		try {
			File f1 = new File("student.txt");
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f1));
			List<Student> students = (List<Student>) ois.readObject();

			for (Student s : students) {

				if (s.sno == sno1) {
					System.out.println("number is " + s.getSno());
					System.out.println("name is " + s.getSname());
					System.out.println("course  is " + s.getCourse());
					System.out.println("fees is " + s.getFees());
				}

				else {
					System.out.println("no record found");
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
