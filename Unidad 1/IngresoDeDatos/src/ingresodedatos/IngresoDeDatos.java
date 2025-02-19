/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ingresodedatos;

import java.util.Scanner;

/**
 *
 * @author juan.quintanag
 */
public class IngresoDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Para ingresar números, puedes utilizar un método específico 
        // que convierta el texto ingresado en un valor numérico.
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        // 2. Para limpiar el buffer de entrada del Scanner, 
        // usa la siguiente línea:
        scanner.nextLine();

        // 3. Para leer una cadena de texto, utiliza scanner.nextLine(), 
        // asignándolo a una variable. Este método capturará el texto 
        // ingresado por el usuario hasta que presione la tecla Enter.
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        // Mostrar los datos ingresados
        System.out.println("Número ingresado: " + numero);
        System.out.println("Nombre ingresado: " + nombre);

        scanner.close(); // Cerrar el Scanner al final
    }
    
}
