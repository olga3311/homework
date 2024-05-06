package lesson23.classwork.example02;

public class BankAccount {
    private int id;
    protected  String iban;
    protected  Human owner;

    protected  double amount;

    public BankAccount(int id, String iban, Human owner) {
        this.id = id;
        this.iban = iban;
        this.owner = owner;
        amount = 0;
    }

    public void withdraw (double amount){
        if(this.amount >=amount){
            this.amount -= amount;
        }
    }
    public  void deposit (double amount){
        this.amount +=amount;
    }

    public int getId() {
        return id;
    }

    public String getIban() {
        return iban;
    }

    public Human getOwner() {
        return owner;
    }

    public double getAmount() {
        return amount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }



}
