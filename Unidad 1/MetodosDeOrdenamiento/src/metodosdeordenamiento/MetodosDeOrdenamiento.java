/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodosdeordenamiento;

/**
 *
 * @author juan.quintanag
 */
public class MetodosDeOrdenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = {5, 3, 8, 1, 9};
        
        System.out.println("Arreglo antes del ordenamiento: ");
        recorrerArreglo(numeros);
        ordenamientoPorBurbuja(numeros);
        System.out.println("Arreglo despues del ordenamiento: ");
        recorrerArreglo(numeros);
    }

    public static void ordenamientoPorBurbuja(int[] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Intercambio
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
    }
    
    public static void ordenamientoPorInsercion(int[] arreglo){
        for (int i = 1; i < arreglo.length; i++) {
            int clave = arreglo[i];
            int j = i - 1;

            // Desplaza elementos mayores que la clave
            while (j >= 0 && arreglo[j] > clave) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }

            // Inserta la clave en su posición correcta
            arreglo[j + 1] = clave;
        }
    }

    public static void recorrerArreglo(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("");
    }
}
