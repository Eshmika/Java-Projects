package Exe1;

class Cat extends Animal {
	public Cat() {
		System.out.println("Cat Constructor");
	}
	  public Cat(String name) {
	      super(name);
	   }
	  public String speak() {
	      return "Meow Meow";
	  }
	}