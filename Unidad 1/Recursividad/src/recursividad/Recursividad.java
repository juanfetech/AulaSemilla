/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

/**
 *
 * @author juan.quintanag
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        lavarPlatos(5);
    }

    public static void lavarPlatos(int platos) {
        // Caso base: No hay más platos para lavar
        if (platos == 0) {
            System.out.println("Todos los platos están limpios.");
            return;
        }

        // Imprimir el plato actual que se está lavando
        System.out.println("Lavando el plato " + platos + "...");

        // Llama de nuevo de forma recursiva con un plato menos.
        lavarPlatos(platos - 1);
    }
}
