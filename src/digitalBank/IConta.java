package digitalBank;

public interface IConta {
	
	void withdraw(double ammount);
	
	void deposit(double ammount);
	
	void transfer(double ammount, Account account);
	
	void printStatement();

}
