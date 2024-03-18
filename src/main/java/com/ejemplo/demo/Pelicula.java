package com.ejemplo.demo;
 
public class Pelicula {
    private int id;
    private String titulo;
    private int anio;
    private String director;
    private String genero;
    private String sinopsis;
    
    public Pelicula(int id, String titulo, int anio, String director, String genero, String sinopsis) {
        this.id = id;
        this.titulo = titulo;
        this.anio = anio;
        this.director = director;
        this.genero = genero;
        this.sinopsis = sinopsis;
    }

    //Getters @
    public int getId() {return id;}
    public String getTitulo() {return titulo;}
    public int getAge() {return anio;}
    public String getDirector() {return director;}
    public String getGenero() {return genero;}
    public String getSinopsis() {return sinopsis;}

    
}
