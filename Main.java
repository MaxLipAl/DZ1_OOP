package Seminar.DZ1_OOP;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Birds parrot = new Birds("Чижик", new Chumka("Больное крыло"), "Петр", LocalDate.of(2010, 2, 12));
        Cat cat = new Cat("Сид", new Chumka("соня"), "Максим", LocalDate.of(2021, 5, 15));
        Dog dog = new Dog("Луна", new Chumka("Стресс"), "Таня", LocalDate.of(2023, 12, 21));
        Fish fish = new Fish("Немо", new Chumka("Нет, наблюдается"), "Нина", LocalDate.of(2019, 7, 2));

        Scanner scan = new Scanner(System.in);
        System.out.println("Выберети животное, по которому хотите посмотреть информацию: " +
                "\n1 - Птица\n2 - Кот\n3 - Собака\n4 - Рыба\n0 - выход");
        System.out.print(": ");
        int input = scan.nextInt();
        while (!(input == 1 || input == 2 || input == 3 || input == 4 || input == 5 || input == 0)) {
            System.out.println("Не верный ввод, введите еще раз.");
            System.out.println("Выберети животное, по которому хотите посмотреть информацию: " +
                    "\n1 - Птица\n2 - Кот\n3 - Собака\n4 - Рыба\n0 - выход");
            System.out.print(": ");
            input = scan.nextInt();
        }

        if (input == 1) {
            System.out.println("Имя птицы: " + parrot.getName());
            System.out.println("Болезнь: " + parrot.getIllness());
            System.out.println("Владелец: " + parrot.getOwnername());
            System.out.println("Дата рождения: " + parrot.getBirthday());
            System.out.println("Жизненный цикл: ");
            parrot.liveCircle();
            System.out.print("Может ходить?: ");
            parrot.toGo();
            System.out.print("Может летать?: ");
            parrot.fly();
            System.out.print("Может плавать?: ");
            parrot.swim();
            return;
        }

        if (input == 2) {
            System.out.println("Имя кота: " + cat.getName());
            System.out.println("Болезнь: " + cat.getIllness());
            System.out.println("Владелец: " + cat.getOwnername());
            System.out.println("Дата рождения: " + cat.getBirthday());
            System.out.println("Жизненный цикл: ");
            System.out.print("Может ходить?: ");
            cat.toGo();
            System.out.print("Может летать?: ");
            cat.fly();
            System.out.print("Может плавать?: ");
            cat.swim();
            return;
        }

        if (input == 3) {
            System.out.println("Имя собаки: " + dog.getName());
            System.out.println("Болезнь: " + dog.getIllness());
            System.out.println("Владелец: " + dog.getOwnername());
            System.out.println("Дата рождения: " + dog.getBirthday());
            System.out.println("Жизненный цикл: ");
            System.out.print("Может ходить?: ");
            dog.toGo();
            System.out.print("Может летать?: " + dog.getName() + " ");
            dog.fly();
            System.out.print("Может плавать?: ");
            dog.swim();
            return;
        }

        if (input == 4) {
            System.out.println("Имя рыбы: " + fish.getName());
            System.out.println("Болезнь: " + fish.getIllness());
            System.out.println("Владелец: " + fish.getOwnername());
            System.out.println("Дата рождения: " + fish.getBirthday());
            System.out.println("Жизненный цикл: ");
            System.out.print("Может ходить?: " + fish.getName() + " ");
            fish.toGo();
            System.out.print("Может летать?: " + fish.getName() + " ");
            fish.fly();
            System.out.print("Может плавать?: ");
            fish.swim();
            return;
        }
        if (input == 0) {
            System.out.println("Пока");
        }
    }
}
