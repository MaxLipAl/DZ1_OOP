package Seminar.DZ1_OOP;

import java.time.LocalDate;

public class Fish extends Animal {
    public Fish() {
        super();
    }

    public Fish(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }

    @Override
    public void fly() {
        System.out.println("летать не может");
    }

    @Override
    public void toGo() {
        System.out.println("ходить не может");
    }

}