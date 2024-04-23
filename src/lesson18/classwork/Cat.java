package lesson18.classwork;

public class Cat {

        String name;
        String color;
        int age;
        char ch;

        public Cat(){

        }
        public  Cat (String catName){
            name = catName;
        }
        public  Cat(String catName, String color){
            name = catName;
            this.color = color;
        }
        public Cat(String name, String color, int age){
            this(name, color);
            this.age = age;
        }
        public void sleep(){
            System.out.println("i am sleeping!");
        }
        void run() {
            System.out.println( "i am running!");
        }
        void sayMeow (){
        System.out.println("Meow!");
    }

    void sayMeow(String string){
        System.out.println("Hello!Meow, " + string);
    }
    public void whoAmI(){
        System.out.println("Я котик" + name+ ", мой возраст: " + age + " , и мой окрас:" + color + ".");
    }
    }





