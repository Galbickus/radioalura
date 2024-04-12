package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.MisFavoritos;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion();
        cancion1.setTitulo("Quemarás");
        cancion1.setCantante("WOS");

        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("Abcdario");
        podcast1.setPresentador("Pocoyo");

        for (int i = 0; i < 10; i++) {
            cancion1.meGusta();
        }
        for (int i = 0; i < 50; i++) {
            cancion1.reproducir();
        }
        System.out.println("Total de reproducciones de " + cancion1.getTitulo()+ ": " + cancion1.getTotalDeReproducciones());
        System.out.println("Total de Me gusta de " + cancion1.getTitulo() + ": " + cancion1.getTotalDeMeGusta());

        for (int i = 0; i < 15; i++) {
            podcast1.meGusta();
        }
        for (int i = 0; i < 30; i++) {
            podcast1.reproducir();
        }
        System.out.println("Total de reproducciones de " + podcast1.getTitulo()+ ": " + podcast1.getTotalDeReproducciones());
        System.out.println("Total de Me gusta de " + podcast1.getTitulo() + ": " + podcast1.getTotalDeMeGusta());

        MisFavoritos misFavoritos = new MisFavoritos();
        misFavoritos.agregar(cancion1);
        misFavoritos.agregar(podcast1);
    }
}
