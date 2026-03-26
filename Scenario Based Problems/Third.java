class Account {
    int Account_Number;
    double Balance;

    public Account(int Account_Number, double Balance) {
        this.Account_Number = Account_Number;
        this.Balance = Balance;
    }

    double calculate() {
        return 0;
    }

    void display() {
        System.out.println("Account_Number : - - - - " + Account_Number);
        System.out.println("Balance In Account : - - - - " + Balance);
    }
}

class SavingsAccount extends Account {

    SavingsAccount(int Account_Number, double Balance) {
        super(Account_Number, Balance);
    }

    @Override
    double calculate() {
        return Balance * 0.04;
    }
}

class CurrentAccount extends Account {

    CurrentAccount(int Account_Number, double Balance) {
        super(Account_Number, Balance);
    }

    @Override
    double calculate() {
        return Balance * 0.02;
    }
}

public class Third {

    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount(33226, 115000);

        double total1 = s1.calculate();
        s1.display();
        System.out.println("Interest : - - " + total1);

        System.out.println();

        CurrentAccount c1 = new CurrentAccount(44567, 115000);
        double total2 = c1.calculate();
        c1.display();
        System.out.println("Interest : - - " + total2);
    }
}