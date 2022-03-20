/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para
esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en
horas). Implemente las clases y métodos necesarios para esta situación, teniendo en
cuenta lo que se pide a continuación:

19
En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si
quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package peliculaEntidades;

import java.util.ArrayList;


public class Pelicula {
    private String titulo ;
    private String director;
    private Double duracion;
    private ArrayList peliculas;
    
    //Constructor vacio

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Double duracion, ArrayList peliculas) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.peliculas = new ArrayList<>();
    }

   // Getter & Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public ArrayList<String> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList  peliculas) {
        this.peliculas = peliculas;
    }

    
    
    // ToString

    @Override
    public String toString() {
        return "PeliculaEntidades{" + "pelicula=" + titulo + ", director=" + director + ", duracion=" + duracion + ", peliculas=" + peliculas + '}';
    }
    
    
    
   
}
