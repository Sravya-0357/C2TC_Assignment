package Assignment_3.entityclassassignment1;

public class Bank {
	
	private static int totalAccounts = 0;
	
	public static int getTotalAccounts()
	{
		return totalAccounts;
	}
	
	public static void totalAddedAccount()
	{
		totalAccounts ++;
	}
}