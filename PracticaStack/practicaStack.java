package PracticaStack;
// 3. Crear una stack que permita objetos de tipo Autos, donde cada objeto auto debe tener: num_patente, marca, modelo, color, chasis.

//    Cargar la pila con 7 autos diferentes luego hacer lo siguiente:

// a. Buscar un auto de color rojo.
// b. Mostrar el auto que se encuentra en la cima de la pila.
// c. Borrar el auto que se encuentra en la cima de la pila.
// d. Agregar dos nuevos autos a la pila.
// Recorrer la pila mostrando el nuevo contenido luego de las operaciones realizadas.

import java.util.Stack;

public class practicaStack {
    public static void main(String[] args) {
        Stack<Autos> autos = new Stack<Autos>();

        // CARGA
        autos.push(new Autos("abc123", "Chevrolet", "Corsa", "Negro", 123456));
        autos.push(new Autos("def132", "Audi", "A5", "Plata", 987654321));
        autos.push(new Autos("ghi456", "Fiat", "Marea", "Blanco", 13487421));
        autos.push(new Autos("jkl465", "Nissan", "Sense", "Cobre", 2843188));
        autos.push(new Autos("mno798", "Honda", "Fit", "Gris", 21687618));
        autos.push(new Autos("xyz123", "Ferrari", "296GBT", "Rojo", 884558));
        autos.push(new Autos("pqr789", "Mercedes Benz", "Amg", "Plata", 97654258));


        System.out.println("__________________________");
        System.out.println("AUTO ROJO");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");

        // BÚSQUEDA E IMPRESIÓN AUTO ROJO
        for (Autos rojo : autos) {
            if (rojo.getColor() == "Rojo") {
                System.out.println("Nº PATENTE: " + autos.peek().getNum_patente() +
                        " -MARCA: " + autos.peek().getMarca() +
                        " -MODELO: " + autos.peek().getModelo() +
                        " -COLOR: " + autos.peek().getColor() +
                        " -Nº CHASIS:" + autos.peek().getChasis());
            }
        }

        // IMPRESIÓN
        System.out.println("__________________________");
        System.out.println("AUTO DE LA CIMA DE LA PILA");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        System.out.println(
                "Nº PATENTE: " + autos.peek().getNum_patente() +
                        " -MARCA: " + autos.peek().getMarca() +
                        " -MODELO: " + autos.peek().getModelo() +
                        " -COLOR: " + autos.peek().getColor() +
                        " -Nº CHASIS:" + autos.peek().getChasis());

        

        // BORRAR ÚLTIMO
        autos.pop();

        // CARGA 2 NUEVOS
        autos.push(new Autos("jgh565", "Lamborghini", "Diablo", "Amarillo", 657653));
        autos.push(new Autos("hsy852", "Volkswagen", "T-Cross", "Azul", 987654321));

        System.out.println("__________________________");
        System.out.println("NUEVA PILA DE AUTOS");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");

        // RECCORRE E IMRPIME
        for (Autos au : autos) {
            System.out.println(
                    "Nº PATENTE: " + au.getNum_patente() +
                            " -MARCA: " + au.getMarca() +
                            " -MODELO: " + au.getModelo() +
                            " -COLOR: " + au.getColor() +
                            " -Nº CHASIS:" + au.getChasis());
        }
    } // Cierra main
} // Cierra class
