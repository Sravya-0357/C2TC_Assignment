package Assignment_3.entityclassassignment1;


public class Executor {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount(2334, 20000.56);
		CheckingAccount ca = new CheckingAccount(6557, 34570.67);
		
		Transaction t = new Transaction();
		
		sa.getAccountDetails();
		t.performTransaction(sa, "deposit", 3000);
		t.performTransaction(sa, "withdraw", 4000);
		
		ca.getBalance();
		
		System.out.println("Total account: "+ Bank.getTotalAccounts());

	}

}