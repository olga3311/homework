package lesson18.Hometask;

public class MyTeacher {
    public static void main(String[] args) {
        Teacher teacher = new Teacher( "Harry Potter", "English", 40,15);
        String info = teacher.whoAmI();
        System.out.println(info);

        Teacher teacher1 = new Teacher( "london", " a university");
        String data = teacher1.whereAmI();
        System.out.println(data);
        teacher1.work();

    }
}
