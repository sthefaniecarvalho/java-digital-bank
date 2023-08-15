package digitalBank;

public abstract class Account implements IConta{

	private static final int AGENCIA_PADRAO = 1;

	private static int SEQUENCIAL = 1;
	
	protected int agency;
	protected int number;
	protected double balance;
	protected Customer customer;
	
	public Account(Customer customer) {
		this.agency = Account.AGENCIA_PADRAO;
		this.number = SEQUENCIAL++;
		this.customer = customer;
		
	}
	
	public int getAgency() {
		return agency;

	}
	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public void withdraw(double amount) {
		this.balance -= amount;
		
	}

	@Override
	public void deposit(double amount) {
		this.balance += amount;
		
	}

	@Override
	public void transfer(double amount, Account account) {
		this.withdraw(amount);
		account.deposit(amount);
	}
	
	protected void printInfo() {
		System.out.println("Name: " + this.customer.getName());
		System.out.println("Agency: " + this.agency);
		System.out.println("Number: " + this.number);
		System.out.printf("Balance: %.2f", this.balance);
	}

	

}
