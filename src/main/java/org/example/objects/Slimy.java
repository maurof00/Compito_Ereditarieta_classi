package org.example.objects;

public class Slimy extends Alieno {
    public Slimy(String pianeta, String razza, int age) {
        super(pianeta, razza, age);
    }

    @Override
    public void info() {
        System.out.print("Ciao! Vengo dal pianeta %planet% & ho %age% anni"
                .replace("%planet%", pianeta)
                .replace("%age%", String.valueOf(age)));
    }
}
