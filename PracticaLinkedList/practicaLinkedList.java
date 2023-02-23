package PracticaLinkedList;
// 2. Crear una clase persona que tenga los siguientes atributos: dni, nombre, apellido, dirección, celular, edad
// (tener en cuenta todos sus atributos, constructores y métodos getters y setters). A partir de ello:


// a. Crear una LinkedList de tipo Persona y agregar 20 personas distintas.
// b. Crear dos LinkedLists de tipo Persona diferentes a la primera, una para almacenar a los menores de edad y otra para los mayores.
// c. Recorrer la lista principal buscando a las personas que sean mayores de 18 años. En caso que una persona tenga o sea mayor a 18 años, 
//    agregarla a la lista de mayores, caso contrario agregarla a una lista de menores.
// d. Una vez realizada la separación, recorrer ambas nuevas listas y mostrar por pantalla el nombre, apellido y edad de cada una de las personas
//  contenidas en cada lista.

import java.util.List;
import java.util.LinkedList;

public class practicaLinkedList {
    public static void main(String[] args) {
        List<Persona> lista = new LinkedList<Persona>();
        List<Persona> mayores = new LinkedList<Persona>();
        List<Persona> menores = new LinkedList<Persona>();

        lista.add(new Persona(32563242, "Eric", "Knudsen", "Mitre 1334", "3413409125", 36));
        lista.add(new Persona(13245687, "Alexis", "Knudsen", "Montevideo 3588", "123456789", 35));
        lista.add(new Persona(32561658, "Guillermo", "Knudsen", "Montevideo 3588", "321654987", 64));
        lista.add(new Persona(16581926, "Norma", "Fontana", "Montevideo 3588", "123789456", 58));
        lista.add(new Persona(195716, "Evelyn", "Knudsen", "9 de julio 1234", "430934986", 31));

        lista.add(new Persona(24791225, "Tatiana", "Pellegrina", "9 de julio 1234", "4093046049", 16));
        lista.add(new Persona(563745378, "Alina", "Knudsen", "Mitre 1334", "480345960", 3));
        lista.add(new Persona(763269, "Nelso", "Fontana", "Heaven 777", "3804938930", 84));
        lista.add(new Persona(78647296, "Susana", "Gimenez", "Heaven 777", "049330415369", 90));
        lista.add(new Persona(7532637, "Ivana", "Scavo", "Maipu 4321", "3403403479125", 31));

        lista.add(new Persona(573789365, "Soledad", "Gutierrez", "Pellegrini 4312", "0453146340", 6));
        lista.add(new Persona(719318637, "Julieta", "Sol", "Entre rios 123", "4053186004", 14));
        lista.add(new Persona(7831693, "Mauro", "Palacios", "Alberdi 6543", "1230404530", 36));
        lista.add(new Persona(56437849, "Fernando", "Zuloaga", "Mendoza 3750", "798634593619", 36));
        lista.add(new Persona(71396613, "Laureano", "Demarchi", "Crespo 220", "719367936789", 36));

        lista.add(new Persona(6317893, "Rocio", "Gomez", "Cordoba 9876", "7193613789", 40));
        lista.add(new Persona(3176831, "Carlos", "Gonzalez", "Rioja 1234", "7193679", 21));
        lista.add(new Persona(715367, "Raul", "Acevedo", "Colombres 6563", "429364193", 61));
        lista.add(new Persona(17531797, "Julian", "Acevedo", "Colombres 5653", "479264962", 23));
        lista.add(new Persona(4796426, "Jacky", "Knudsen", "Heaven", "354163841", 9));


            // RECORRER LISTA Y BUSCAR MAYORES Y MENORES
        for (Persona pers : lista) {
            if (pers.getEdad() < 18) {
                menores.add(pers);
            }else{mayores.add(pers);} 
        }

        // IMPRESIONES
        System.out.println("__________________________________");
        System.out.println("----------MENORES DE EDAD---------");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");

        // IMPRIMIR MENORES DE EDAD
        for (Persona men : menores) {
            System.out.println("NOMBRE: " + men.getNombre() + ". APELLIDO: " + men.getApellido() + ". EDAD: "+ men.getEdad());
        }

        // IMPRESIONES
        System.out.println("__________________________________");
        System.out.println("----------MAYORES DE EDAD---------");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");

        // IMPRIMIR MAYORES DE EDAD
        for (Persona may : mayores) {
            System.out.println("NOMBRE: " + may.getNombre() + ". APELLIDO: " + may.getApellido() + ". EDAD: "+ may.getEdad());
        }

    } // Cierra main
} // Cierre class
