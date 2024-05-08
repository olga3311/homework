package lesson23.homework;

public class  Customer extends Person {

    private double money;

    public double getMoney() {
        return money;
    }



    public Customer(String name, double money) {
        super(name);
        this.money = money;
    }

    @Override
    public void introduce() {
        super.introduce();
    }



    public void buyProduct(Seller seller, String productName, int amount) {
        double price = seller.getPrice(productName, amount);
        if (price != -1){
           if (payMoney(price)){
            seller.sellProduct(productName, amount);}
        }
    }

    public boolean payMoney(double price){
        if (price<=money){
            money -= price;
            return true;
        } return false;
    }

}
