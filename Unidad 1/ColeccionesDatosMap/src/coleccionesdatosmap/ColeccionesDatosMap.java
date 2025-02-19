/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coleccionesdatosmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author jufeq
 */
public class ColeccionesDatosMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMapEjemplo();
        TreeMapEjemplo();
        LinkedHashMapEjemplo();
    }

    public static void HashMapEjemplo() {
        Map<String, Integer> hashMap = new HashMap<>();
        
        // El HashMap no garantiza orden en los elementos. Es la implementación más rápida.
        // Asi se pueden agregar elementos al HashMap y a las demas implementaciones.
        hashMap.put("Carlos", 30);
        hashMap.put("Ana", 25);
        hashMap.put("Beatriz", 28);
        hashMap.put("Daniel", 35);

        System.out.println("HashMap: " + hashMap);
        System.out.println("Cuantos años tiene Daniel: " + hashMap.get("Daniel"));
    }

    public static void TreeMapEjemplo() {
        Map<String, Integer> treeMap = new TreeMap<>();
        
        // Este Map ordena automáticamente por clave (alfabéticamente o numéricamente).
        treeMap.put("Carlos", 30);
        treeMap.put("Ana", 25);
        treeMap.put("Beatriz", 28);
        treeMap.put("Daniel", 35);

        System.out.println("TreeMap: " + treeMap);
        System.out.println("Cuantos años tiene Ana: " + treeMap.get("Ana"));
    }
    
    public static void LinkedHashMapEjemplo(){
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        
        // El objeto mantiene el orden de inserción.
        linkedHashMap.put("Carlos", 30);
        linkedHashMap.put("Ana", 25);
        linkedHashMap.put("Beatriz", 28);
        linkedHashMap.put("Daniel", 35);

        System.out.println("LinkedHashMap: " + linkedHashMap);
        System.out.println("Cuantos años tiene Beatriz: " + linkedHashMap.get("Beatriz"));
    }
}
