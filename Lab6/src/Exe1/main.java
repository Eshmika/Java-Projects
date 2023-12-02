package Exe1;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		if(al.isEmpty()) {
			System.out.println("List is empty...");
		}
		
		for(int i=0; i<10; i++) {
			System.out.println("Enter the number "+(i+1));
			int value = sc.nextInt();
			al.add(value);
		}
		
		int tot = 0;
		
		
		for(Integer x : al) {
			tot = tot + x;						
		}
		
		System.out.println("Total is: "+ tot);
		
	}

}
