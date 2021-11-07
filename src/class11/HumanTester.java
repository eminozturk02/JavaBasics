package class11;

public class HumanTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Humans tamana=new Humans();
tamana.name="Tamana";
tamana.age=16;
tamana.height=5.8;
tamana.weight=30;
tamana.gender='F';
tamana.bloodType="A+";

tamana.eat();
tamana.sleep();
tamana.walk();
tamana.sendMemes();

Humans sebestain=new Humans();
sebestain.name="sebestain";
sebestain.age=18;
sebestain.height=6.2;
sebestain.weight=100;
sebestain.gender='M';
sebestain.bloodType="A-";
sebestain.eat();
sebestain.sleep();
sebestain.walk();
sebestain.sendMemes();
System.out.println(sebestain.age);




	}

}
