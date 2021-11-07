package class11;

public class Humans {

	String name;
	int age;
	double height;
	double weight;
	char gender;
	String bloodType;
	 void eat() {
		 System.out.println(name+"eats a lot");
	 }
	 void sleep() {
		 System.out.println(name+" is sleeping");
	 }
	void walk() {
   System.out.println(name+" with bloodtype "+bloodType+"is walking");
	}
	
	void sendMemes() {
		if(name.equals("sebestain")) {
			System.out.println("sending memes");
		}
	}
}
