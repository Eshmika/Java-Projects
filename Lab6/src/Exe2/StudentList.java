package Exe2;

import java.util.ArrayList;

public class StudentList {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		
		Student s1 = new Student(12,"Kamal",3.2);
		Student s2 = new Student(13,"ABC",2.7);
		Student s3 = new Student(14,"Kl",2.5);
		al.add(s1);
		al.add(s2);
		al.add(s3);
				
		for(Student x : al) {
			System.out.println("Student ID: "+ x.studentID);
			System.out.println("Student name: "+ x.name);
			System.out.println("Student gpa: "+ x.GPA);
			System.out.println("");
		}

		
	}
}
