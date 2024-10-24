package org.example;

import org.example.objects.*;

public class Main {

    public static void main(String[] args) {
        String ciao = "Ciao, come va?";
        System.out.println("Testo: " + ciao);

        // Classe, Istanza
        //
        //  io e te
        //
        //
        //
        //
        //
        //
        //

        Umano uomo = new Uomo("Samuele", "Russo", 21);
        Umano donna = new Donna("Giovanna", "Russo", 21);
        Umano nb = new NonBinary("Salvatore", "Rossi", 34);
        Extraterrestre slimy = new Slimy("marte", "gb1", 1201);


        uomo.test();
        donna.test();
        nb.test();
        slimy.info();


    }

}
