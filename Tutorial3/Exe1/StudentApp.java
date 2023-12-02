package Exe1;
class Student{
	private static int max = 100;
	private int studentID;
	private String name;
	private String degree;
	private String mobile;
	
	public  Student(String name, String degree, String mobile) {
		this.name=name;
		this.degree=degree;
		this.mobile=mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public void print() {
		System.out.println("Student ID: "+ getNextStudentID());
		System.out.println("Name: "+ name);
		System.out.println("Degree: "+ degree);
		System.out.println("Mobile: "+ mobile);
	}
	
	public static int getNextStudentID() {
		return max++;
	}
}

public class StudentApp {

	public static void main(String[] args) {
		Student [] students = new Student[5];
		
		students[0] = new Student("Anne","CS","123456");
		students[1] = new Student("John","IT","123456");
		students[2] = new Student("David","Eng","123456");
		students[3] = new Student("Sara","QS","123456");
		students[4] = new Student("Michal","Physical","123456");
		
		for(Student student : students) {
			student.print();
			System.out.print("\n");
		}
	}

}
