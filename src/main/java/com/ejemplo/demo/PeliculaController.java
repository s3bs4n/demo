package com.ejemplo.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class PeliculaController {
    private List<Pelicula> peliculas = new ArrayList<>();

    public PeliculaController() {
        // Inicializar la lista con datos

        peliculas.add(new Pelicula(1, "Shrek", 2001, "Andrew Adamson", "comedia", "Trata sobre un ogro"));
        peliculas.add(new Pelicula(2, "La era del Hielo", 2002, "Chris Wedge", "comedia", "Trata sobre la era del hielo"));
        peliculas.add(new Pelicula(3, "Open Season", 2006, "Jill Culton", "comedia", "Trata sobre un oso Grizli"));
        peliculas.add(new Pelicula(4, "Monsters Inc.", 2001, "Pete Docter", "comedia", "Trata sobre una empresa de energia a gritos"));
        peliculas.add(new Pelicula(1, "Shrek 2", 2004, "Andrew Adamson", "comedia", "Lo mismo que la 1 pero wenisima"));

    }
    
    @GetMapping("/peliculas")
    public List<Pelicula> getPeliculas() {return peliculas;}
    
    @GetMapping("/peliculas/{id}")
    public Pelicula getPeliculaById(@PathVariable int id) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getId() == id) {
                return pelicula;
            }
        }
        return null;
    }

}
