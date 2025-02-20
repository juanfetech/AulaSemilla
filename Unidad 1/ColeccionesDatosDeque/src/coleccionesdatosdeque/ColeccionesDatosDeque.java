/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coleccionesdatosdeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 *
 * @author jufeq
 */
public class ColeccionesDatosDeque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ejemploDeque();
        ejemploStack();
    }
    
    public static void ejemploDeque(){
        Deque<String> deque = new ArrayDeque<>();

        // 1. Agrega elementos al frente y al final.
        deque.addFirst("Primero");
        deque.addLast("Último");
        deque.offerFirst("Nuevo Primero");
        deque.offerLast("Nuevo Último");

        System.out.println("Deque actual: " + deque);

        // 2. Remueve elementos desde ambos extremos.
        System.out.println("Removido del frente: " + deque.pollFirst());
        System.out.println("Removido del final: " + deque.pollLast());

        System.out.println("Deque actualizado: " + deque);
    }
    
    public static void ejemploStack(){
        Stack<String> historial = new Stack<>();

        // 1. Ejemplo de una simulación de visitas a páginas web.
        historial.push("Inicio");
        historial.push("Página 1");
        historial.push("Página 2");
        historial.push("Página 3");

        System.out.println("Historial actual: " + historial);

        // 2. Proceso para retroceder en el historial de las visitas.
        System.out.println("Retrocediendo a: " + historial.pop());
        System.out.println("Retrocediendo a: " + historial.pop());

        System.out.println("Historial actualizado: " + historial);
    }
    
}
