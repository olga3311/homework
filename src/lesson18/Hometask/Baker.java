package lesson18.Hometask;

public class Baker {
    String name;
    int age;
    int experience;
    String cuisine;
    String address;


    public  Baker (String name,String address,int age) {
        this.name = name;
        this.age = age;
        this.address = address;

    }
    String whoAmI(){
        return "I am baker " + this.name + ", " + this.age + " years old, " + "I live in " + this.address;

    }


    public Baker (String name, int experience, String cuisine){
        this.name = name;
        this.experience = experience;
        this.cuisine = cuisine;
    }

    String whoAmI2(){
        return "I am baker " + this.name +",  I have " + this.experience + " years of experience, i prefer "
                + this.cuisine + " cuisine.";
    }

    public void bakeCroissant(){
        System.out.println("I'm baking french croissants!");
    }

    public void bakeBaguette(){
        System.out.println("I'm baking french baguettes!");
    }


}
