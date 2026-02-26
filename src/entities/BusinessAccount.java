package entities;

public class BusinessAccount extends Account{
	private double loanLimit;
	
	public BusinessAccount() {
		
	}

	public BusinessAccount(int numero, String holder, double balance, double loanLimit) {
		super(numero, holder, balance);
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount <=loanLimit) {
			Balance += amount - 10;
		}
	}
	
}

