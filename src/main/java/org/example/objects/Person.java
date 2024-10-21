package org.example.objects;

public class Person extends Umano {

    public String name, cognome;

    public Person(String name, String cognome, int eta){
        this.name = name;
        this.cognome = cognome;
        this.eta = eta;

        //org.example.objects.Person
    }

    public void ciao(){

    }

    @Override
    public void test() {
        System.out.println("Super-PErson");
    }
}
