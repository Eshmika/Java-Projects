package Exe2;

public class Person implements ICompute{
	   private String name;
	   private double basicSal;
	   private double otRate;
	   private double otHrs;
	   private double netSal;
	   
	
	public Person(String name, double basicSal, double otRate, double otHrs) {
		this.name = name;
		this.basicSal = basicSal;
		this.otRate = otRate;
		this.otHrs = otHrs;		
	}
	   
	public int calculate() {
		netSal = basicSal+(otHrs*otRate);
		System.out.println("Person Net Salary: "+netSal);
		return 0;
	}
	
	public void display() {
		System.out.println("Display Person Name: "+name);
	}
}