package Seminar.DZ1_OOP;

import java.time.LocalDate;

public class Birds extends Animal {
    private Birds() {
        super();
    }

    public Birds(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }
}
