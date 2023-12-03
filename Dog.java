package Seminar.DZ1_OOP;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog() {
        super();
    }

    public Dog(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }

    @Override
    public void fly() {
        System.out.println("летать не может");
    }
}
