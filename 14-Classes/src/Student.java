
public class Student {
	public String name;
	public int age;
	public char gender;
	public int year;
	public String course;
	public static String university = "Cybertek University";
	
	public Student(String name, int age, char gender, int year, String course) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
		
	}
	
	public void attendLecture() {
		System.out.println(name + " is Attandence Check at "+university);
	}
	
	public void submitAssignment() {
		System.out.println(name + " is Submit Assignment at "+university);
	}
	
	public void attendLab() {
		System.out.println(name + " is Attandence Lab at "+university);
	}
	
	
	
}
