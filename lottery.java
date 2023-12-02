import java.util.Random;
import java.util.Scanner;

class lotery{
	private int lotteryNum[]=new int[5];
	
	lotery() {
		Random ran = new Random();
		
		for(int i=0; i<5; i++) {
			lotteryNum[i] = ran.nextInt(10);
		}
	}
	
	public int compareNum(int userNum[]) {
		int matchDigits = 0;
		for(int i=0; i<5; i++) {
			if(this.lotteryNum[i]==userNum[i]) {
				matchDigits ++;
			}
		}
		return matchDigits;
	}
	
	public int[] getlotery() {
		return this.lotteryNum;
	}
}

public class lottery {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userNum[] = new int [5];
		System.out.println("Enter your five lottery numbers: ");
		for(int i=0; i<5; i++) {
			userNum[i] = sc.nextInt();
		}
		
		lotery l1 = new lotery();
		
		int matchingVal = l1.compareNum(userNum);
		
		System.out.println("User's Numbers: ");
		for(int i=0; i<5; i++) {
			System.out.print(" "+ userNum[i]);
		}
		
		int lotteryNum[] = l1.getlotery();
		System.out.println("\nLottery's Numbers: ");
		for(int i=0; i<5; i++) {
			System.out.print(" "+ lotteryNum[i]);
		}
		
		System.out.print("\nNumber of matching digits: "+ matchingVal);
		
		System.out.print("\nMatching digits: ");		
		for(int i=0; i<5; i++) {
			if(lotteryNum[i]==userNum[i]) {
				System.out.print(lotteryNum[i]+" ");
			}
		}
		
	}
}
