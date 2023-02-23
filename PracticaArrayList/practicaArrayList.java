package PracticaArrayList;

import java.util.List;

import java.util.ArrayList;

// 1.      Crear una clase Mascota, que tenga los siguientes atributos: nombre, especie, sexo, color, pelaje y raza 
// (tener en cuenta todos sus atributos, constructores y métodos getters y setters). A partir de ello:

// a  Crear un ArrayList de tipo Mascota. Crear 5 mascotas y guardarlas en la lista.
// b. Recorrer la lista creada y mostrar por pantalla el nombre, especie y pelaje de las mascotas almacenadas.
// c. Durante el recorrido, cambiar el nombre de dos mascotas. Volver a recorrer la lista y mostrar los nuevos datos
// d. Agregar dos nuevas mascotas a la lista.
// e. Recorrer la lista pero solo mostrando las mascotas que sean de la especie “perro”.

public class practicaArrayList{
    public static void main(String[] args) {
        List <Mascota> listaMascota = new ArrayList<Mascota>();

        listaMascota.add(new Mascota("Jacky", "Gato", "Hembra", "Negro", "Corto", "Mezcla"));
        listaMascota.add(new Mascota("Chuchy", "Gato", "Hembra", "Blanco", "Corto", "Mezcla"));
        listaMascota.add(new Mascota("Odín", "Perro", "Macho", "Marron", "Medio", "Rottweiler"));
        listaMascota.add(new Mascota("Tenacious", "Perro", "Macho", "Negro", "Corto", "Doberman"));
        listaMascota.add(new Mascota("Picky", "Gato", "Hembra", "Gris", "Rulos", "Caniche"));

        // IMPRIME
        System.out.println();
        System.out.println("_____________________________");
        System.out.println("Datos de mis mascotas");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");

        // RECORRE E IMPRIME
        for (Mascota masc : listaMascota) {
            System.out.println("Nombre: "+ masc.getNombre() + " - Especie: " + masc.getEspecie() + " - Pelaje: " + masc.getPelaje());
        }
        
        // CAMBIO DE NOMBRES
        listaMascota.get(0).setNombre("She");
        listaMascota.get(2).setNombre("Bobby");
        
        System.out.println();
        System.out.println("_____________________________");
        System.out.println("Lista con cambios");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");

        // RECORRE E IMPRIME NUEVOS DATOS
        for (Mascota masc : listaMascota) {
            System.out.println("Nombre: "+ masc.getNombre() + " - Especie: " + masc.getEspecie() + " - Pelaje: " + masc.getPelaje());            
        }

        // AGREGA NUEVOS
        listaMascota.add(new Mascota("Betty", "Gato", "Hembra", "Beige", "Medio", "Mestizo"));
        listaMascota.add(new Mascota("Pipi", "Perro", "Hembra", "Gris", "Rulos", "Mezcla"));

        System.out.println();
        System.out.println("_____________________________");
        System.out.println("Lista de perros");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");


        // RECORRE LISTA E IMPRIME SIN PERROS
        for (Mascota masc : listaMascota) {
            if (masc.getEspecie() == "Perro") {
                System.out.println("Nombre: "+ masc.getNombre() + 
                                   " - Especie: " + masc.getEspecie() + 
                                   " - Sexo " + masc.getSexo() + 
                                   " - Color " + masc.getColor() + 
                                   " - Pelaje: " + masc.getPelaje() + 
                                   " - Raza " + masc.getRaza());
            }
        }
    }
}