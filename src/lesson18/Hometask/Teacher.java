package lesson18.Hometask;

public class Teacher {
    String name;
    String subject;
    String jobPlace;
    String address;
    int age;
    int experience;
    public Teacher(String name, String subject, int age, int experience){
        this.name = name;
        this.subject = subject;
        this.age = age;
        this.experience = experience;
    }
    String whoAmI(){
        return "I'm " + this.name + ", a teacher of " + this.subject +", I'm " + this.age
                + ", I have " + this.experience + " of experience.";
    }

    public Teacher(String address, String jobPlace){
        this.address = address;
        this.jobPlace = jobPlace;
    }
    String whereAmI(){
        return "I live in " + this.address + " and" +
                "I work at " + this.jobPlace + ".";
    }
    void work(){
        System.out.println( "I'm teaching my students!");

    }
}
