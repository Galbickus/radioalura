package com.aluracursos.radioalura.modelos;

public class MisFavoritos {
    public void agregar(Audio audio){
        if (audio.getClasificacion()>=8){
            System.out.println(audio.getTitulo() + " Favoritos del momento");
        }else{
            System.out.println(audio.getTitulo() + " En ascenso");
        }
    }
}
