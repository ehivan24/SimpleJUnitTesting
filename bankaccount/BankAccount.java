package bankaccount;

public class BankAccount {

	private int balance;
	
	public BankAccount(int i) {
		balance = i;
	}
	public BankAccount(){
	}

	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance){
		this.balance = balance;
	}
	
	public void deposit(int i) {
		balance += i;
	}
	public void withdraw(int i) {
		balance -= i;
		if(balance < 0)balance -= 5;
	}
}

