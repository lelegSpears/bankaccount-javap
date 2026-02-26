package entities;

public class Account {
	private int numero;
	private String holder;
	protected double balance;
	
	public Account() {

	}

	public Account(int numero, String holder, double balance) {
		numero = numero;
		holder = holder;
		balance = balance;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		numero = numero;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
}

