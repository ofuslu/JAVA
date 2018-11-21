
public class dog2 {
	public String name;
	public int age;
	public String breed;
	public String color;
	
	public dog2() {
		name="Hunter";
		age=15;
		breed="rex";
;
	}
	
	public dog2(String name, int age, String breed, String color) {
		this.name=name;
		this.age=age;
		this.breed=breed;
		this.color=color;
	}
	
	
	public void bark() {
		System.out.println(name + " is barking");
	}
	
	public void eat() {
		System.out.println(name + " is eating");
	}
	
	public void wagTail() {
		System.out.println(name + " is wagging tail");
	}
}
