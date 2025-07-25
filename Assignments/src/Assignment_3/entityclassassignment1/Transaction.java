package Assignment_3.entityclassassignment1;

public class Transaction {

	private final double transactionFee = 10.0;
	
	public final void performTransaction(Account account, String type, double amount)
	{
		System.out.println("\nPerforming transaction "+ type +" on "+ amount);
		
		if (type.equalsIgnoreCase("deposit"))
		{
			account.deposit(amount);
		}
		else if(type.equalsIgnoreCase("withdraw"))
		{
			account.withdraw(amount + transactionFee);
		}
		else
		{
			System.out.println("invalid transaction");
		}
		System.out.println("->Transaction fee: "+transactionFee);
		System.out.println("->Balance: "+ account.balance);
	}
	
}