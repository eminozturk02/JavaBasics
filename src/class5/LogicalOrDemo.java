package class5;

import java.util.Scanner;

public class LogicalOrDemo  {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner dayOr = new Scanner(System.in);
			System.out.println("Please enter Today's day");
			int day = dayOr.nextInt();
			if (day>=1 || day<=5) {
				System.out.println("It is weekday");	
			} else if (day==6 || day==7) {
				System.out.println("It is weekend");
			
			} else {
				System.out.println("word you entered is not a day!");
	}
}
	}
