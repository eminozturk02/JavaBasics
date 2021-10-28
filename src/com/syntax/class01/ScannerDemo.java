package com.syntax.class01;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abc";
str="xyz";

Scanner scan=new Scanner(System.in); 
String name=scan.next();//it will capture value from console

System.out.println("hello"+name);
System.out.println("please enter your age");
int age=scan.nextInt();
System.out.println(name+"you are"+age+"years old");

		
	}

}
