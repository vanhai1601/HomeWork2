package account;

public class AccountTest {
	public static void main(String[] args) {
		Account account1 = new Fee(2000);
		System.out.println("Fee:");
		account1.deposit(2000);
		account1.withdraw(500);
		account1.withdraw(1000);
		account1.deposit(1500);
		account1.withdraw(2000);
		account1.endMonth();
		
		System.out.println("\nNickdeNDime:");
		Account account2 = new NickleNDime(1000);
		account2.withdraw(500);
		account2.deposit(2000);
		account2.withdraw(1000);
		account2.withdraw(700);
		account2.endMonth();
		System.out.println();
		
		System.out.println("\nGambler:");
		Account account3 = new Gambler(1500);
		account3.withdraw(500);
		account3.withdraw(700);
		account3.endMonth();
		System.out.println();
	}
}
