package digitalBank;

public class SavingsAccount extends Account{

	public SavingsAccount(Customer customer) {
		super(customer);
	}

	@Override
	public void printStatement() {
		System.out.println("*** Statement Savings Account ***");
		printInfo();
	}
}
