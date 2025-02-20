/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coleccionesdatosqueue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author jufeq
 */
public class ColeccionesDatosQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjemploQueue();
        EjemploPriorityQueue();
    }

    public static void EjemploQueue() {
        // 1. Crea una Queue de tipo String para representar los clientes en la fila
        Queue<String> queueClientes = new LinkedList<>();

        // 2. Agrega clientes a la cola.
        queueClientes.offer("Cliente 1");
        queueClientes.offer("Cliente 2");
        queueClientes.offer("Cliente 3");
        queueClientes.offer("Cliente 4");

        // 3. Mostrar la cola actual
        System.out.println("Cola de clientes: " + queueClientes);

        // 4. Atiende a los clientes en orden de llegada
        while (!queueClientes.isEmpty()) {
            // 5. Remueve y atiende al cliente en la cabeza de la cola.
            String clienteAtendido = queueClientes.poll();
            System.out.println("Atendiendo a: " + clienteAtendido);
            System.out.println("Cola actualizada: " + queueClientes);
        }

        System.out.println("Todos los clientes han sido atendidos.");
    }

    public static void EjemploPriorityQueue() {
        // 1. Crea una PriorityQueue con orden ascendente (por defecto)
        PriorityQueue<Integer> numeros = new PriorityQueue<>();

        // 2. Agrega elementos a la cola
        numeros.offer(50);
        numeros.offer(10);
        numeros.offer(30);
        numeros.offer(20);

        // Extraer elementos en orden de prioridad
        while (!numeros.isEmpty()) {
            System.out.println(numeros.poll());
        }
    }
}
