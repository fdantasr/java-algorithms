package entities;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        if(balance > 0.0)
            this.balance = balance;
    }

    public void deposit(double depositAmount) {
        if(depositAmount > 0.0)
            balance += depositAmount;
    }

    // method withDraw
    public void withDraw(double removedValue) {
        if(removedValue < this.balance) {
            this.balance -= removedValue;
            System.out.printf("New balance after removed value from account: %.2f\n", this.balance);
        }else {
            System.out.println("[Withdrawal amount exceeded account balance]");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

