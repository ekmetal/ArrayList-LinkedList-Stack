package Stacks;

import java.util.Stack;

public class Staks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        System.out.println("Pila vacía: " + stack);
        System.out.println("Está vacía? " + stack.isEmpty());

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);


        // RECORRIDO
        for (Integer pilita : stack){
            System.out.println(pilita);
        }

        // MOSTRAR
        System.out.println("Pila: " + stack);
        System.out.println("Pila vacía? " + stack.isEmpty());

        stack.pop(); // El método POP elimina el último registro q entró.
        System.out.println("Está el 3? " + stack.search(3));
        System.out.println("Último agregado: " + stack.peek());

    } // Cierra main
} // Cierra class
