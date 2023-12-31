package Exe3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

	      int maxSubjects;
	      int [] marks = new int[5];
	      int total=0;
	      double avg;
	      
	      try {
	    	  Scanner sc = new Scanner(System.in);
	    	  System.out.print("Max Subject: ");
	    	  maxSubjects = sc.nextInt();
	    	  
	    	  for(int i=0; i<maxSubjects; i++) {
	    		  System.out.print("Marks: ");
	    		  marks[i]=sc.nextInt();
	    		  total = total+ marks[i];
	    	  } 
	    	  
	    	  avg = total /maxSubjects;
	    	  System.out.println("Average Mark is"+avg);
	    	  
	      
	      } catch (InputMismatchException e) {
	    	  System.out.println(e);
	      }catch (ArithmeticException e) {
	    	  System.out.println(e);
	      }catch (ArrayIndexOutOfBoundsException e) {
	    	  System.out.println(e);
	      }
	      
	      finally {
	         System.out.println("This code will be gurrentied to run");
	      }
	    
	      System.out.println("The end");

	  }
}
