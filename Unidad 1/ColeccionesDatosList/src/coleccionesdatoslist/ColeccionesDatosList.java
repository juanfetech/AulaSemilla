/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coleccionesdatoslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author jufeq
 */
public class ColeccionesDatosList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ejemploArrayList();
        ejemploVector();
    }
    
    public static void ejemploArrayList(){
        // 1. Crea una lista de nombres.
        List<String> nombres = new ArrayList<>();

        // 2. Agrega elementos a la lista.
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Carlos");

        // 3. Accede a elementos por índice en la lista.
        System.out.println("Primer nombre: " + nombres.get(0));

        // 4. Recorre la lista.
        System.out.println("Lista de nombres:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // 5. Elimina un elemento de la lista.
        nombres.remove("María");
        System.out.println("Lista después de eliminar a María: " + nombres);
    }
    
    public static void ejemploVector(){
        // 1. Crea un Vector de productos.
        List<String> productos = new Vector<>();

        // 2. Agrega elementos al Vector.
        productos.add("Laptop");
        productos.add("Teléfono");
        productos.add("Tablet");
        productos.add("Monitor");

        // 3. Muestra la lista de productos.
        System.out.println("Lista de productos: " + productos);

        // 4. Accede a un elemento específico.
        System.out.println("Primer producto: " + productos.get(0));

        // 5. Elimina un producto.
        productos.remove("Tablet");
        System.out.println("Lista después de eliminar 'Tablet': " + productos);

        // 6. Recorre el Vector con un bucle.
        System.out.println("Productos disponibles:");
        for (String producto : productos) {
            System.out.println("- " + producto);
        }

        // 7. Obtiene tamaño del Vector.
        System.out.println("Tamaño actual: " + productos.size());
    }
    
}
