package Assignment_6.entityclassassignment1;
public class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be greater than zero.");
        }
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be greater than zero.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds! Available balance: ₹" + balance);
        }
        balance -= amount;
        System.out.println("Withdrew: ₹" + amount);
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber + " | Current Balance: ₹" + balance);
    }
}
