/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglosmatrices;

/**
 *
 * @author juan.quintanag
 */
public class ArreglosMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("*****************************************");
        System.out.println("Inicialización de un arreglo y recorrido:");
        DeclaracionRecorridoArreglos();
        
        System.out.println("*****************************************");
        System.out.println("Inicialización de una Matriz y recorrido:");
        DeclaracionRecorridoMatrices();
        System.out.println("*****************************************");
    }

    public static void DeclaracionRecorridoArreglos() {
        // Asi es la declaración de un Arreglo de Java.
        int[] numeros = {10, 20, 30, 40, 50};

        // Por medio de un ciclo For podemos realizar el recorrido
        // de un arreglo.
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento en índice " + i + ": " + numeros[i]);
        }
    }

    public static void DeclaracionRecorridoMatrices() {
        // Declaración e inicialización de una Matriz en Java.
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Por medio de un ciclo For anidado se puede realizar el cocorrido
        // de un arreglo.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();  // Salto de línea para cada fila
        }
    }
}
