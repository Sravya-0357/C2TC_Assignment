package Assignment_6.entityclassassignment1;
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(101, 5000);

        account.displayBalance();

        try {
            account.deposit(2000);
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            account.displayBalance();
        }

        try {
            account.withdraw(8000);
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            account.displayBalance();
        }

        try {
            account.withdraw(3000);
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            account.displayBalance();
        }
    }
}
