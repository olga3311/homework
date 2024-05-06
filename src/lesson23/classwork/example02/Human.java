package lesson23.classwork.example02;

public class Human {
    public  String fullName;
    private  String address;
    private  int age;

    public Human(String fullName, String address, int age) {
        this.fullName = fullName;
        this.address = address;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
