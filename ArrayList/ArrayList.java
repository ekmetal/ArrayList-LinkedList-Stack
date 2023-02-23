package ArrayList;


import java.util.List;


public class ArrayList {

    public static void main(String[] args) {
        
        List<Persona> lista = new java.util.ArrayList<Persona>();
        lista.add(new Persona(1, "Eric", 30));
        lista.add(new Persona(2, "Alina", 3));
        lista.add(new Persona(3, "Norma", 58));
        lista.add(new Persona(4, "Guillermo", 64));

        // RECORRER POR INDICE

        // ----------FOR----------
        System.out.println("----------FOR----------");
        for(int i = 0; i < lista.size(); i++){
            System.out.println("Prueba: " + lista.get(i).getNombre() + " - " + lista.get(i).getEdad() + " años");
        }


        // ----------FOREACH----------
        System.out.println("----------FOREACH----------");
        for (Persona perso : lista) {
            System.out.println("Prueba: "+ perso.getNombre() + " - " + perso.getEdad() + " años");
        }
        
    } // Cierra main
} // Cierra class
