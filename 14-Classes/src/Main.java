
public class Main {

	public static void main(String[] args) {
		
		Dog dog1= new Dog();
		dog1.name = "Bubbly";
		dog1.age = 5;
		dog1.breed = "Poodle";
		dog1.color = "white";
		
		System.out.println(dog1.name + " : " + dog1.age + " : "+ dog1.breed + " : " + dog1.color);
		
		dog1.bark();
		dog1.eat();
		dog1.wagTail();
		
		
		Dog dog5 = new Dog();
		dog5.name = "Casper";
		dog5.age = 2;
		dog5.breed = "Cas";
		dog5.color = "white";
		
		Dog dog3 = new Dog();
		dog3.name = "Snow White";
		dog3.age = 3;
		dog3.breed = "Casy";
		dog3.color = "black";
		
		System.out.println("--------------------------");
		
		dog2 dog = new dog2();
		dog.name = "Snow White";
		dog.age = 3;
		dog.breed = "Casy";
		dog.color = "black";
		
		System.out.println(dog.name + " : " + dog.age + " : "+ dog.breed + " : " + dog.color);
		
		System.out.println("--------------------------");
		
		System.out.println(dog.name + dog.age + ":" + dog.breed + ":" + dog.color);
		
		dog2 dog2 = new dog2();
		System.out.println(dog2.name + dog2.age + ":" + dog2.breed + ":" + dog2.color);
		
		dog2 dog7 = new dog2("Rusty", 20 ,"Bulldog","Black");
		System.out.println(dog7.name + dog7.age + ":" + dog7.breed + ":" + dog7.color);

	}

}
