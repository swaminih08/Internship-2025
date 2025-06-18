package Day3.java;

public class BankAccount {
	int accountNumber;
	String accountHolder;
	double balance;
	
	public BankAccount(int accNo, String holder, double initialBalance) {
		accountNumber=accNo;
		accountHolder=holder;
		balance=initialBalance;
		
	}
	public void Withdraw(double amount)
	{
		if(amount<=balance)
		{
			balance-=amount;
			System.out.println("Withdraw : "+amount+"Reamaining balance : "+balance);
		}
		else
		{
			System.out.println("Insufficient balance ");
		}
	}
	public static void main(String[] args) {
		BankAccount acc=new BankAccount(101,"swamini",100000);
		acc.Withdraw(300);
		acc.Withdraw(1500);

	}

}
