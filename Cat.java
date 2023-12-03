package Seminar.DZ1_OOP;

import java.time.LocalDate;

public class Cat extends Animal {
    public Cat() {
        super();
    }

    public Cat(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }

    @Override
    public void swim() {
        System.out.println("некоторые коты умеют плавать");
    }

    @Override
    public void fly() {
        System.out.println("коты не умеют летать (если только со шкафа :))");
    }
}
