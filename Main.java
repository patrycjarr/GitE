package com.company;

public class Main {

    public static void main(String[] args) {
//        String a = new String("Java");
//        String b = new String("Java");
//        System.out.println(a.equals(b));

    Osoba os = new Osoba(2);
    Osoba os1 = new Osoba(2);
    os1.gender=Gender.FEMALE;
    os.gender=Gender.FEMALE;
    //System.out.println(os.equals(os1));
//	Dog reksio = new Dog("Reksio");
//	reksio.setNumberOfLegs(4);
//	System.out.println(os);
////	reksio.bark();
////	Dog.sayHi();
    }
}
