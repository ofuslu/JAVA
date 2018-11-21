
public class EncapsulationClass {

	public static void main(String[] args) {
		
		Car porshe = new Car();
		porshe.setModel("911");
		String model = porshe.getModel();
		System.out.println(model);
		
		porshe.setModel("Cayane");
		String model1 = porshe.getModel();
		System.out.println(model1);
		
		System.out.println("----------------------------------------------");
		
		BankAccount mikeAccount = new BankAccount();
        mikeAccount.setAccountNumber("5555555");
        mikeAccount.setBalance(2.5);
        mikeAccount.setCustomerName("mike");
        
        mikeAccount.withdrawal(100.0);
        
        mikeAccount.deposit(150.000);
        mikeAccount.withdrawal(50.0);
        
        System.out.println(mikeAccount.getCustomerName());
		

	}

}
