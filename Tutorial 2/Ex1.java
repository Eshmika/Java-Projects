import java.util.Scanner;
// ishara.w@sliit.lk
class Student{
	private int subject1;
	private int subject2;
	private int subject3;
	private double avg;
	private String studentID;
	private String studentName;
	
	public Student(String sid, String sname) {
		this.studentID=sid;
		this.studentName=sname;
		this.subject1=0;
		this.subject2=0;
		this.subject3=0;
	}
	
	public void calculateAvg() {
		this.avg = (subject1+subject2+subject3)/3.0;
		
	}
	
	public void display() {
		System.out.println("Student ID is: "+ this.studentID);
		System.out.println("Student Name is: "+ this.studentName);
		System.out.println("Student Average is: "+ this.avg);
	}
	
	public void setSubject1(int sub1) {
		this.subject1=sub1;
	}
	
	public void setSubject2(int sub2) {
		this.subject1=sub2;
	}
	
	public void setSubject3(int sub3) {
		this.subject1=sub3;
	}
}
public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter student ID: ");
		String id=sc.nextLine();		
		
		System.out.println("Enter name Stdent name: ");
		String name=sc.nextLine();
		
		Student st = new Student (id,name);
		
		System.out.println("Enter suject 1 mark:");
		int mark1 = sc.nextInt();
		st.setSubject1(mark1);
		
		System.out.println("Enter suject 2 mark:");
		int mark2 = sc.nextInt();
		st.setSubject2(mark2);
		
		System.out.println("Enter suject 3 mark:");
		int mark3 = sc.nextInt();
		st.setSubject3(mark3);
		
		st.calculateAvg();
		st.display();
	}
}
