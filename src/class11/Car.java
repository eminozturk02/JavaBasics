package class11;

public class Car {
String make;
String model;
String color;
String year;
double milage;

void moveForward() {
	System.out.println("Moving forward");
	//applyBreaks(); if we have this in here then you don't need ayshasCar.applyBreaks;
}
void applyBreaks() {
	System.out.println("Applying breaks");
}

public static void main(String[] args) {
	Car ayshasCar= new Car();
	//ayshasCar.moveForward();
	ayshasCar.make="Tesla";
	ayshasCar.model="S";
	ayshasCar.color="Black";
	System.out.println("Ayshas car is "+ayshasCar.make);
	System.out.println("Ayshas car model is "+ayshasCar.model);
	System.out.println("Ayshas car color is "+ayshasCar.color);
	ayshasCar.moveForward();
	ayshasCar.applyBreaks();
	
}
}
