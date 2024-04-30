package lesson21.classwork.example01;

public class BankAccount {
    private String fullName;
    private final String iban;
    private final AccountType accountType;
    private double amount;

    public BankAccount(String fullName, String iban, AccountType accountType) {
        this.fullName = fullName;
        this.iban = iban;
        this.accountType = accountType;
        amount = 0;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getIban() {
        return iban;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double amount) {
        this.amount += amount;
    }
    public  void  withdraw( double amount){
        if (amount <= this.amount
        || accountType ==AccountType.CREDIT){
        this.amount -= amount;}

    }
    public boolean hasDebt(){
        return amount < 0;
    }


}
