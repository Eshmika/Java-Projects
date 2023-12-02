package Exe2;

public class Box implements ICompute{
	   private int length, width, height;
	   private int volume;
	   
	public Box(int length, int width, int height) {
		
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public int calculate() {
		volume = width*height*length;
		System.out.println("Volume is: "+volume);
		return 0;
	}
	
	public void display() {
		System.out.println("");
	}
	   
}
