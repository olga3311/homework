package lesson24.homework24;

import java.util.Objects;

public class MainDoc {
    public static void main(String[] args) {
        Doctor doctor = new Doctor( "House", "pediatrics", 34, "London." );
        Doctor doctor1 = new Doctor( "House", "pediatrics", 34, "London." );


        System.out.print(doctor);
        System.out.println(doctor1);
        System.out.println(doctor.hashCode());
        System.out.println(doctor1.hashCode());
        System.out.println(doctor.equals(doctor1));

        System.out.println("Reference: " + doctor1.equals(doctor));


        }
    }
