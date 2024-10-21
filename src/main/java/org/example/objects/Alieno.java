package org.example.objects;

public class Alieno extends Extraterrestre{

    public Alieno(String pianeta, String razza, int age) {
        this.age = age;
        this.razza = razza;
        this.pianeta = pianeta;
    }

    @Override
    public void info() {
        System.out.print(pianeta + razza + age);
    }
}
