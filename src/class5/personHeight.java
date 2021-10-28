package class5;

import java.util.Scanner;

public class personHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner height = new Scanner(System.in);
		System.out.println("Please enter your height");
		int num = height.nextInt();
		if (num < 60) {
			System.out.println(num + "inch height is short");
		} else if (num >= 60 && num < 72) {
			System.out.println(num + "inch is medium height");
		} else if (num > 72) {
			System.out.println(num + " inch is tall height");
		}

	}

}
