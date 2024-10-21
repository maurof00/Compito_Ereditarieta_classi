package org.example.objects;

public class Donna extends Person {

    public Donna(String name, String cognome, int eta) {
        super(name, cognome, eta);
    }
    @Override
    public void test() {
        System.out.println("Ciao sono una donna");
    }
}
