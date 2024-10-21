package org.example.objects;

public class Uomo extends Person {

    public Uomo(String name, String cognome, int eta) {
        super(name, cognome, eta);
    }

    @Override
    public void test() {
        System.out.println("Ciao sono un Uomo");
    }
}
