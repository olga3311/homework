package lesson18.Hometask;

public class MyBaker {
    public static void main(String[] args) {


    Baker baker = new Baker("Peter Parker", "Munich, Baker Street, 14.", 36);
    String data = baker.whoAmI();

    System.out.println(data);
    baker.bakeCroissant();
        System.out.println();


        Baker baker1 = new Baker("Fred Bakers", 15, "french");
        String datum = baker1.whoAmI2();
        System.out.println(datum);
        baker1.bakeBaguette();
}


  }