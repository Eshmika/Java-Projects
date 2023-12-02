package Exe1;

class ToyCat extends Cat {
	public ToyCat() {
		System.out.println("ToyCat Constructor");
	}
	  String manufacturer;
	  public ToyCat(String name, String manufacturer) {
	     super(name);
	     this.manufacturer = manufacturer;
	  }
	  public void display() {
	     super.display();
	     System.out.println("I am from " + manufacturer + ".");
	  }
	}