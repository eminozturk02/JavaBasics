package class11;

public class DogTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Dog zemasDog=new Dog();
        
        Dog alonasDog=new Dog();
        alonasDog.name="Lexy";
        alonasDog.breed="american hound";
        alonasDog.colors="Black";
        alonasDog.height=2.5;
        alonasDog.age=10;
        alonasDog.gender='M';
        
        
        System.out.println("My Dog Name is "+alonasDog.name);
        System.out.println("His Breed is "+alonasDog.breed);
        System.out.println("His color is "+alonasDog.colors);
        
        Dog jimmaysDog=new Dog();
        jimmaysDog.name="Teddy";
        jimmaysDog.breed="Labrador Retriever";
        jimmaysDog.colors="Golden";
        jimmaysDog.height=5;
        jimmaysDog.age=5;
        jimmaysDog.gender='M';
        
        
        System.out.println("My Dog Name is "+jimmaysDog.name);
        System.out.println("His Breed is "+jimmaysDog.breed);
        System.out.println("His color is "+jimmaysDog.colors);
        
        Dog arwasDog=new Dog();
        arwasDog.name="manroe";
        
        System.out.println("Arwas Dog name is "+arwasDog.name);
	}

}
