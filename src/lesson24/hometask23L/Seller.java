package lesson24.hometask23L;

public class Seller extends Person {
    Product[] warehouse = new Product[10];

    public Seller(String name) {
        super(name);
    }

    public Product[] getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Product[] warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void introduce() {
        super.introduce();
    }

    public double getPrice(String productName, int amount) {
        for (int i = 0; i < warehouse.length; i++) {
            if (productName.equals(warehouse[i].getName())) {
                if (warehouse[i].getQuantity() >= amount) {
                    return warehouse[i].getPrice() * amount;
                } else return -1;
            }
        }
        return -1;
    }


    public void sellProduct(String productName, int amount) {
        for (int i = 0; i < warehouse.length; i++) {
            if (productName.equals(warehouse[i].getName())) {
                if (warehouse[i].getQuantity() >= amount) {
                    warehouse[i].setQuantity(warehouse[i].getQuantity() - amount);
                    return;
                }
            }
        }
    }



}