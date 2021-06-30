package com.company;


public class Main {
    public static void main(String[] args) {
        Human h0 = new Human();
        Human h1 = new Human("Tom", "Henks", 56);
        Human h2 = new Human("Tom", "Henks", 56, "Running");

        System.out.println(h0 + "\n");
        System.out.println(h1 + "\n");
        System.out.println(h2);
    }
}

class Human {
    private final String defaultValue = "Empty";

    private int age;
    private String name = defaultValue;
    private String secondName = defaultValue;
    private String favoriteSport = defaultValue;

    public Human() {

    }

    public Human(String name, String secondName, int age, String favoriteSport) {
        this(name, secondName, age);
        this.favoriteSport = favoriteSport;
    }

    public Human(String name, String secondName, int age) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
    }

    @Override

    public String toString() {
        return "Name: " + name +
                "\nSecondName: " + secondName +
                "\nAge: " + age +
                "\nSport: " + favoriteSport;
    }
}





