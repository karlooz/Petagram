package com.petagram.carlos.petagram;

/**
 * Created by Carlos on 20/08/2016.
 */
public class Mascota {
    private String nombre;
    private int foto;
    private String likes;

    public Mascota(String nombre, int foto, String likes) {
        this.nombre = nombre;
        this.foto = foto;
        this.likes = likes;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }
}
