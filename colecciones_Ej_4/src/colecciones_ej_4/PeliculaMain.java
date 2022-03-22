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
package colecciones_ej_4;

import PeliculaServicios.PeliculaServicios;
import java.util.ArrayList;
import java.util.Collections;
import peliculaEntidades.Pelicula;

public class PeliculaMain {

    public static void main(String[] args) {
        PeliculaServicios pel = new PeliculaServicios();//instancio la clase servicios 
        ArrayList<Pelicula> pelEnt = pel.ingresarDatos();
       
        
        System.out.println(" LISTA PELIS INGRESADAS : ");
        System.out.println(" ");
        pel.mostrarPelicula();// Llamo el metodo mostrar pelicula
        
        
        System.out.println("DURACION MAYOR A 1 HORA :");
        System.out.println(" ");
        pel.peliculasUnaHora();// Llamo el metodo ordenar peli de mas de una hora 
       
        
        System.out.println(" ");
        System.out.println(" ORDENADA DE MAyOR A MENOR : ");
        Collections.sort(pelEnt, PeliculaServicios.deMayorAMenor);//  Llamo el metodo de Ordenar  de mayor a menor 

        for (Pelicula P : pelEnt) {
            System.out.println(P);
        }
        
        
        System.out.println(" ");
        System.out.println("ORDENADO DE MENOR A MAYOR : ");
        Collections.sort(pelEnt, PeliculaServicios.deMenorAMayor);

        for (Pelicula P : pelEnt) {
           
            System.out.println(P);
        }
        
        
        System.out.println(" ");
        System.out.println("ORDEN ALFABETICO : ");
        Collections.sort(pelEnt,PeliculaServicios. alfabeticamente);
        for (Pelicula P : pelEnt) {
            System.out.println(P);
        }
        
        System.out.println(" ");
        System.out.println("ORDEN ALFABETICO DIRECTOR : ");
        Collections.sort(pelEnt,PeliculaServicios.directoralf);
        for (Pelicula P : pelEnt) {
            System.out.println(P);
        }
        
    }
}
