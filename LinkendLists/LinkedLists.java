package LinkendLists;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args) {
        
        List<Persona> lista = new LinkedList<Persona>();

        // Agregar personas al final de la lista
        lista.add(new Persona(1, "Eric", 30));
        lista.add(new Persona(2, "Alina", 3));
        lista.add(new Persona(3, "Norma", 58));
        lista.add(new Persona(4, "Guillermo", 64));


        // Agregar al principio
        lista.add(0, new Persona(5, "Taty", 16)); // Se le agrega un indice antes del NEW

        // RECORRER POR INDICE
        // ----------SOLO SE PUEDE RECORRER POR FOREACH----------
        System.out.println("--------------------");
        for (Persona perso : lista) {
            System.out.println("Prueba: "+ perso.getNombre() + " - " + perso.getEdad() + " años");
        }
        
    } // Cierra main
} // Cierra class

