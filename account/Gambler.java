package account;

import java.util.Random;

public class Gambler extends Account {

	public Gambler(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	Random random = new Random();

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		int value = random.nextInt(100) + 1;
		if (value >= 49) {
			setBalance(getBalance() - 2 * amount);
			setTransactions(getTransactions() + 1);
		} else {
			setTransactions(getTransactions() + 1);
		}
	}

}
