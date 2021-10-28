package class5;

import java.util.Scanner;

public class threeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner numbers=new Scanner(System.in);
System.out.println("please enter first number");
int a=numbers.nextInt();
System.out.println("please enter second number");
int b=numbers.nextInt();
System.out.println("please enter third number");
int c=numbers.nextInt();
if(a>b && a>c) {
	
	System.out.println(a+"is the lagest number");
}else if(b>a && b>c){
	System.out.println(b+"is the largest number");
}else if (c>a&&c>b) {
	
	System.out.println(c+"is the largest number");
}else {
	System.out.println("All numbers are the same");
}
	}

}
