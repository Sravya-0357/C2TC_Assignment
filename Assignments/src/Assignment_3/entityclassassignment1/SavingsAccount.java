package Assignment_3.entityclassassignment1;

public class SavingsAccount extends Account{

	public SavingsAccount(long accNo, double balance) {
		super(accNo, balance);
	}
	
	@Override // overridding the abstract class abstract method
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	@Override
	public void withdraw(double amount)
	{
		if (balance > 0 && amount < balance)
		{
			balance -= amount;
		}
	}
	
	@Override
	public double getBalance()
	{
		return balance;
	}
}