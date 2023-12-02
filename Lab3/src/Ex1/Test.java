package Ex1;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Kamal";
		s1.ditno = "IT123";
		s1.address = "Kaduwela";
		
		Student s2 = new Student();
		s2.name = "Nimal";
		s2.ditno = "IT246";
		s2.address = "Malabe";
		
		System.out.println("Name : "+s1.name+"\nDit no : "+s1.ditno+"\nAddress : "+s1.address);
		System.out.println("Name : "+s2.name+"\nDit no : "+s2.ditno+"\nAddress : "+s2.address);
	}

}
