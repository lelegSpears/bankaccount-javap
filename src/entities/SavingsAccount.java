package entities;

public class SavingsAccount extends Account{
	private double interestRate;
	
	public SavingsAccount() {
		
	}

	public SavingsAccount(double interestRate) {
		this.interestRate = interestRate;
	}

	public SavingsAccount(int numero, String holder, double balance, double interestRate) {
		super(numero, holder, balance);
		this.interestRate = interestRate;
	}
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		Balance += Balance * interestRate;
	}
}

