
public class Main2 {

	public static void main(String[] args) {
		
		Student s1 = new Student("Mike", 17, 'M', 2016, "Java");
		Student s2 = new Student("Anna", 18, 'F', 2018, "JS");
		Student s3 = new Student("Sofana", 24, 'F', 2017, "TypeScript");
		
		System.out.println(s1.name +" "+ s1.age+ " "+s1.gender+" "+s1.year+" "+s1.course);
		s1.attendLab();
		s1.attendLecture();
		s1.submitAssignment();
		
		System.out.println("---------------------------------------------------------------");
		
		System.out.println(s2.name +" "+ s2.age+ " "+s2.gender+" "+s2.year+" "+s2.course);
		s2.attendLab();
		s2.attendLecture();
		s2.submitAssignment();
		
		System.out.println("---------------------------------------------------------------");
		
		System.out.println(s3.name +" "+ s3.age+ " "+s3.gender+" "+s3.year+" "+s3.course);
		s3.attendLab();
		s3.attendLecture();
		s3.submitAssignment();
		
		

	}

}
