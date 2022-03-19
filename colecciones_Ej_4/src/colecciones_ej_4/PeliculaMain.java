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
import java.util.Scanner;
import peliculaEntidades.Pelicula;

public class PeliculaMain {

    private ArrayList<Pelicula> pelis = new ArrayList<>();

    public static void main(String[] args) {
        PeliculaServicios pel = new PeliculaServicios();//instancio la clase servicios 
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String rta;
        ArrayList<Pelicula> pelis = new ArrayList<>();// creo un ArrayList para gusrdar los datos de las peliculas 

        do {
            System.out.println("Ingrese el titulo de la pelicula: ");
            String titulo = leer.next();
            System.out.println("Ingrese el Director de la pelicula :");
            String director = leer.next();
            System.out.println("Ingrese la duracion en horas :");
            Double duracion = leer.nextDouble();
            Pelicula p1 = new Pelicula();// creo objeto pelicula
            p1.setTitulo(titulo);//guardo los datos en el objero pelicula 
            p1.setDirector(director);
            p1.setDuracion(duracion);
            System.out.println("Ingresar otra pelicula? Si/No");
            rta = leer.next();
            pelis.add(p1);// agrego todas las peliculas al ArrayList pelis 

        } while ("si".equalsIgnoreCase(rta));
          
        
        for (Pelicula P : pelis) {//recorro el ArrayList y muestro las pelis ingresadas 
            System.out.println(P);//muestro la cantidad de las peliculas ingresadas en el ArrayList
        }
        
        System.out.println(" Pelis ingresadas : " + pelis.size());
    }

}
