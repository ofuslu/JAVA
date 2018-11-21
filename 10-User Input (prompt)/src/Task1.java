import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int counter = 1;
		
		while(counter <= 10) {
			System.out.println("Enter number #"+counter+":");
			
			if(scanner.hasNextInt()) {
				counter++;
				sum = sum + scanner.nextInt();
			}else {
				System.out.println("Invalid number");
			}
			
			scanner.nextLine();
			
		}
		System.out.println("Your total is: " + sum);
		scanner.close();

	}

}
