package lesson23.homework;

public class Main {
    public static void main(String[] args) {

        Seller seller1 = new Seller( "Vasya");

        Product[] warehouse = new Product[10];

        warehouse[0] = new Product("milk", 20, 1.05);
        warehouse[1] = new Product("yogurt", 25, 0.65);
        warehouse[2] = new Product("cream", 16, 1.46);
        warehouse[3] = new Product("cheese", 20, 2.5);
        warehouse[4] = new Product("bread", 50, 0.45);
        warehouse[5] = new Product("coffee", 13, 5.55);
        warehouse[6] = new Product("tea", 17, 3.6);
        warehouse[7] = new Product("sugar", 37, 2.4);
        warehouse[8] = new Product("rice", 45, 0.98);
        warehouse[9] = new Product("biscuits", 20, 2.4);

        seller1.setWarehouse(warehouse);

        Customer customer1 = new Customer("Petya", 100);

        customer1.introduce();
        System.out.println("This customer has " + customer1.getMoney() + ".");

        seller1.introduce();

        customer1.buyProduct( seller1, "sugar",15);
        System.out.println("This customer has " + customer1.getMoney() + ".");

        System.out.println("Sugar: " + seller1.getWarehouse()[7].getQuantity() );




    }
}
