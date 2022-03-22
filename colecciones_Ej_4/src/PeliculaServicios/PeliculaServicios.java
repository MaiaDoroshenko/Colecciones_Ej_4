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
package PeliculaServicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import peliculaEntidades.Pelicula;

public class PeliculaServicios {

    private ArrayList<Pelicula> pelis = new ArrayList<>();
    private Double duracion;
    private String titulo;
    private String director;

    public ArrayList<Pelicula> ingresarDatos() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String rta;

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


        return pelis;
    }

    public void mostrarPelicula() {

        System.out.println(" Las peliculas de la lista : ");
        System.out.println(" Descripcion : ");
        for (Pelicula P : pelis) {//recorro el ArrayList y muestro las pelis ingresadas 
            System.out.println(P.toString());//muestro la cantidad de las peliculas ingresadas en el ArrayList
        }
        System.out.println(" Pelis ingresadas : " + pelis.size());
    }

    public void peliculasUnaHora() {

        System.out.println(" ");
        System.out.println(" PELIS DE MAS DE UNA HORA : ");
        for (Pelicula P : pelis) {
            if (P.getDuracion() > 1) {
                System.out.println(P);
            }

        }
       
    }
    
    public static Comparator<Pelicula>deMayorAMenor=new Comparator<Pelicula>() {
        
        
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           
             
            return t1.getDuracion().compareTo(t.getDuracion());
            
        }
        
    };

    
        public static Comparator <Pelicula>deMenorAMayor=new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
          
                 
            return t.getDuracion().compareTo(t1.getDuracion());
         
            }
            
        };
        
        public static Comparator <Pelicula>alfabeticamente=new Comparator<Pelicula>() {
                @Override
        public int compare(Pelicula t, Pelicula t1) {
          
                 
            return t.getTitulo().compareTo(t1.getTitulo());
         
            }
                };
        
           
         public static Comparator <Pelicula>directoralf=new Comparator<Pelicula>() {
                @Override
        public int compare(Pelicula t, Pelicula t1) {
          
                 
            return t.getDirector().compareTo(t1.getDirector());
         
            }
                };
        
        
        
        }
                

                


    
    
            



