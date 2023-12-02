package Exe2;
class Feet{
	private int feet;
	private int inches;
	
	public Feet(int feet, int inches) {
		this.feet = feet;
		this.inches = inches;
	}
	
	public Feet(Feet obj) {
		this.feet = obj.feet;
		this.inches = obj.inches;
	}
	
	public void add (Feet f1, Feet f2) {
		this.feet = f1.feet + f2.feet;
		this.inches = f1.inches + f2.inches;
		
		if(this.inches >= 12) {
			this.feet = this.feet + (this.inches/12);
			this.inches = this.inches % 12;
		}
	}
	
	public void add (Feet f1) {
		this.feet = this.feet + f1.feet;
		this.inches = this.inches + f1.inches;
		
		if(this.inches >= 12) {
			this.feet = this.feet + (this.inches/12);
			this.inches = this.inches % 12;
		}
	}
	
	public static Feet add (Feet f1, Feet f2, Feet f3) {
		int totFeet = f1.feet + f2.feet + f3.feet;
		int totInches = f1.inches + f2.inches + f3.inches;
		
		if(totInches >= 12) {
			totFeet = totFeet + (totInches/12);
			totInches = totInches % 12;
		}
		
		return new Feet (totFeet,totInches);
	}
		
	public void print() {
		System.out.println(feet + "'" + inches + "\"");
	}
	
	public void print(String msg) {
		System.out.println(msg + " " + feet + "'" + inches + "\"");
	}
	
	public static void print(Feet f) {
		System.out.println(f.feet + "'" + f.inches + "\"");
	}
}

public class FeetTest {

	public static void main(String[] args) {
		Feet len1 = new Feet(5,6);
		Feet len2 = new Feet(6,7);
		
		len1.print();
		len2.print();
		
		len1.print("Length is: ");
		Feet len3 = new Feet (len1);
		
		len3.add(len2);
		len3.print();
		
	}
}
	
