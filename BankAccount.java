import java.util.Random;

public class BankAccount {
	private String accountnumber;
	private double checkingbalance;
	private double savingsbalance;
	public static int numberofaccounts;
	public static double amountstored;
	
	private static String generateID() {
		String init = "";
		Random r = new Random();
		for(int i = 0; i < 10; i++) {
			init += r.nextInt(10);
		}
		return init;
	}
	public BankAccount() {
		BankAccount.numberofaccounts += 1;
		this.checkingbalance = 0;
		this.savingsbalance = 0;
		this.accountnumber = BankAccount.generateID();
	}
	
	public double getCheckingBalance() {
		return this.checkingbalance;
	}
	
	public double getSavingsBalance() {
		return this.savingsbalance;
	}
	
	public void depositMoney(double amount, String account) {
		if(account.equals("savings")) {
			this.savingsbalance += amount;
		}
		else if(account.equals("checking")) {
			this.checkingbalance += amount;
		}
		BankAccount.amountstored += amount;	
	}
	
	public void withdrawMoney(double amount, String account) {
		boolean hasMoney = false;
		if(account.equals("savings")) {
			if(this.savingsbalance - amount >= 0) {
				hasMoney = true;
				this.savingsbalance -= amount;
			}
		}
		else if(account.equals("checking")) {
			if(this.checkingbalance - amount >= 0) {
				hasMoney = true;
				this.checkingbalance -= amount;
			}
		}
		if(hasMoney) {
			BankAccount.amountstored -= amount;
		}
	}
	
	public void displayBalance() {
		System.out.println("Savings: " + this.savingsbalance + " Checking: " + this.checkingbalance);
	}
	
	public static void main(String[] args){
		BankAccount ex = new BankAccount();
		ex.depositMoney(30, "savings");
		ex.depositMoney(10, "checking");
		ex.displayBalance();
		System.out.println(ex.accountnumber);
	}
}
