package com.company;

public class Osoba {
    String name;
    String surname;
    int age;
    Gender gender;

    public Osoba(int age) {
        this.age = age;
    }

    @Override //adnotacja
    public String toString() {
        return "Osoba{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
    //ctrl + alt + L formatowanie
    @Override //nadpisanie funkcji equals
    public boolean equals(Object other){
        Osoba otherPerson = (Osoba)other;
        return this.name.equals(otherPerson.name)
                && this.surname.equals(otherPerson.surname)
                && this.gender == otherPerson.gender;


    }
}
