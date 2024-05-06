package lesson23.classwork.example02;

public class CreditBankAccount {
    private double creditLimit;
    private  double currentDebt;


    public CreditBankAccount(double creditLimit, double currentDebt) {
        this.creditLimit = creditLimit;
        this.currentDebt = 0;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getCurrentDebt() {
        return currentDebt;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
}
