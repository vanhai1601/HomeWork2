package account;

public class NickleNDime extends Account {

	public NickleNDime(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void endMonthCharge() {
		// TODO Auto-generated method stub
		setBalance(getBalance() - getTransactions()*0.5);
	}
}
