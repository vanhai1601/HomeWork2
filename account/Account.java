package account;

public class Account {
	private double balance;
	private int transactions;

	public Account(double balance) {
		if (balance > 0) {
			this.balance = balance;
		}
		this.transactions = 0;
	}

	public void deposit(double amount) {
		balance += amount;
		transactions++;
	}

	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			transactions++;
		} else {
			System.out.println("So tien trong tai khoan khong du");
		}
	}

	public void endMonthCharge() {

	}

	public void endMonth() {
		endMonthCharge();
		System.out.println("Balance: " + balance);
		System.out.println("Transactinos: " + transactions);
		transactions = 0;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getTransactions() {
		return transactions;
	}

	public void setTransactions(int transactions) {
		this.transactions = transactions;
	}

}
