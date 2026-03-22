
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}


abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    protected double balance;

   
    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

   
    abstract double calculateInterest();

    public int getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    
    void display() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount implements Loanable {
    SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.05; 
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan applied: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance > 5000;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.02; 
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan applied: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance > 10000;
    }
}
public class Seventh {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount(101, "Rahul", 8000);
        BankAccount acc2 = new CurrentAccount(102, "Sita", 15000);
        acc1.display();
        acc1.deposit(2000);
        acc1.withdraw(1000);
        System.out.println("Interest: " + acc1.calculateInterest());

        System.out.println();

        acc2.display();
        acc2.deposit(3000);
        acc2.withdraw(2000);
        System.out.println("Interest: " + acc2.calculateInterest());
        System.out.println();
        Loanable loan1 = (Loanable) acc1;
        loan1.applyForLoan(50000);
        System.out.println("Eligible: " + loan1.calculateLoanEligibility());
        Loanable loan2 = (Loanable) acc2;
        loan2.applyForLoan(100000);
        System.out.println("Eligible: " + loan2.calculateLoanEligibility());
    }
}