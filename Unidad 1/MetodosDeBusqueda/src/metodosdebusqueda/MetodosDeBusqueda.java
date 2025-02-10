/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodosdebusqueda;

/**
 *
 * @author juan.quintanag
 */
public class MetodosDeBusqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("******************************************");
        System.out.println("Busqueda Lineal");
        int[] numeros = {5, 8, 3, 9, 1};

        int indice = buscarElemento(numeros, 3);
        System.out.println("Elemento encontrado en el índice: " + indice);
        System.out.println("******************************************");
        
        System.out.println("******************************************");
        System.out.println("Busqueda Binaria");
        
        int[] numerosOrdenados = {1, 3, 5, 7, 9, 11, 13};
        int valor = 7;

        int resultado = busquedaBinaria(numerosOrdenados, valor);
        if (resultado != -1) {
            System.out.println("Elemento encontrado en el índice: " + resultado);
        } else {
            System.out.println("Elemento no encontrado.");
        }
    }

    public static int buscarElemento(int[] arreglo, int valor) {
        // Se recorre el arreglo de 1 en 1 hasta encontrar el valor
        // solicitado.
        for (int i = 0; i < arreglo.length; i++) {

            // Si encontramos el valor, entrará en este condicional
            // y retornará la posición donde se encuentra el valor
            // buscado dentro del arreglo.
            if (arreglo[i] == valor) {
                return i;
            }
        }

        // Si no lo encuentra, retornará -1.
        return -1;
    }

    public static int busquedaBinaria(int[] arreglo, int valorBuscado) {
        int inicio = 0;
        int fin = arreglo.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            // Comparamos el valor medio con el valor buscado
            if (arreglo[medio] == valorBuscado) {
                return medio;
            }

            // Ajustamos los límites
            if (arreglo[medio] < valorBuscado) {
                inicio = medio + 1;  // Buscar en la mitad derecha
            } else {
                fin = medio - 1;  // Buscar en la mitad izquierda
            }
        }
        
        // Si no lo encuentra, retornará -1.
        return -1;
    }
}
