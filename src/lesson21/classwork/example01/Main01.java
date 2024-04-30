package lesson21.classwork.example01;

public class Main01 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount( "Olga Kulaga", " ry 765747", AccountType.CREDIT);

        account.deposit(500);
        System.out.println( "Deposited 500, amount: " + account.getAmount());
        account.withdraw(400);
        System.out.println("withdrawn 400, amount: " + account.getAmount());
        System.out.println("in debt: " + account.hasDebt());
        account.withdraw(200);
        System.out.println("withdrawn 200, amount: " + account.getAmount());
        System.out.println("in debt: " + account.hasDebt());

    }
}
