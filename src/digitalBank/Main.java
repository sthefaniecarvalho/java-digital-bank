package digitalBank;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.setName("Ana");
		
		Customer customer2 = new Customer();
		customer2.setName("Julia");
		
		Account ca = new CheckingAccount(customer1);
		ca.deposit(100);
		
		Account sa = new SavingsAccount(customer2);
		sa.deposit(400);
		sa.transfer(200, ca);
		
		ca.printStatement();
		System.out.println("\n");
		sa.printStatement();
	}

}
