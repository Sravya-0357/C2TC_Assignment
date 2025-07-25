package Assignment_3.entityclassassignment1;

public abstract class Account {
	private long accNo;
	protected double balance;
	
	public abstract void deposit(double amount);//abstract method declaration
	public abstract void withdraw(double amount);
	public abstract double getBalance();
	
	public Account(long accNo, double balance)//parameterized constructor
	{
		this.accNo = accNo;
		this.balance = balance;
		Bank.totalAddedAccount();
	}
	
	public void getAccountDetails()//concrete method (implementing functionality)
	{
		System.out.println("Account number: "+accNo);
		System.out.println("Balance amount: "+balance);
	}
}