package org.example.objects;

public class NonBinary extends Person{
    public NonBinary(String name, String cognome, int eta) {
        super(name, cognome, eta);
    }

    @Override
    public void test() {
        System.out.print("Ciao! Sono non-binario!");
    }
}
