package Assignment_3.entityclassassignment1;

class CheckingAccount extends Account{

	public CheckingAccount(long accNo, double balance) {
		super(accNo, balance);
	}

	@Override
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