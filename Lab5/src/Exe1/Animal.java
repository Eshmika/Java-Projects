package Exe1;

public abstract class Animal {
	private String name;
	   public Animal(String name) {
	       this.name = name;
	   }
	  
	   public Animal() {
		   System.out.println("Animal Constructor");
	   }
	   
	   abstract public String speak();
	   
	   public void display() {
		      System.out.println("My name is " + this.name + ".  " + this.speak() + ".");
		  }
}