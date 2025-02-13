/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coleccionesdatosset;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author jufeq
 */
public class ColeccionesDatosSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HasSetEjemploUno();
        HasSetEjemploDos();
        TreeSetEjemplo();
        LinkedHashSetEjemplo();
    }

    public static void HasSetEjemploUno() {
        Set<Integer> miSet = new HashSet<>();

        // 1. Ingreso de elementos en el HashSet
        miSet.add(1);
        miSet.add(2);
        miSet.add(3);
        miSet.add(3);  // 2. Este dato al ser un duplicado, no se agregara

        System.out.println(miSet); // 3. Output: [1, 2, 3] (El orden puede variar)

        // 4. Método contains, verifica si un elemento existe dentro del HashSet
        System.out.println(miSet.contains(2)); // true

        // 5. Método remove, elimina un elemento del HashSet
        miSet.remove(2);

        System.out.println(miSet);
    }

    public static void HasSetEjemploDos() {

        Set<Integer> numeros = new HashSet<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        System.out.println("Conjunto de números: " + numeros);

        Set<Integer> otroSet = new HashSet<>();
        otroSet.add(4);
        otroSet.add(5);
        otroSet.add(6);
        otroSet.add(7);

        // 1. Metodo para la unión de conjuntos (todos los elementos sin duplicados)
        Set<Integer> union = new HashSet<>(numeros);
        union.addAll(otroSet);
        System.out.println("Unión: " + union);

        // 2. Metodo para la intersección de conjuntos (elementos comunes)
        Set<Integer> interseccion = new HashSet<>(numeros);
        interseccion.retainAll(otroSet);
        System.out.println("Intersección: " + interseccion);

        // 3. Metodo para la diferencia de conjuntos (elementos en 'numeros' que no están en 'otroSet')
        Set<Integer> diferencia = new HashSet<>(numeros);
        diferencia.removeAll(otroSet);
        System.out.println("Diferencia: " + diferencia);

        int numBuscado = 3;
        if (numeros.contains(numBuscado)) {
            System.out.println("El número " + numBuscado + " está en el conjunto.");
        } else {
            System.out.println("El número " + numBuscado + " NO está en el conjunto.");
        }
    }

    public static void TreeSetEjemplo() {
        // 1.El TreeSet con números (se ordenará automáticamente)
        Set<Integer> numeros = new TreeSet<>();

        numeros.add(50);
        numeros.add(10);
        numeros.add(30);
        numeros.add(20);
        numeros.add(40);
        numeros.add(10); // 2. Los números duplicados se ignoran.

        System.out.println("TreeSet ordenado: " + numeros);

        // El método first trae el primero dato del TreeSet.
        // El método last obtiene el ultimo dato del TreeSet.
        System.out.println("Menor número: " + ((TreeSet<Integer>) numeros).first());
        System.out.println("Mayor número: " + ((TreeSet<Integer>) numeros).last());

        // El método headSet con un número como parametro trae los valores menores a ese número
        System.out.println("Números menores que 30: " + ((TreeSet<Integer>) numeros).headSet(30));

        // El método tailSet con un número como parametro trae los valores mayores o iguales a ese número
        System.out.println("Números mayores o iguales a 30: " + ((TreeSet<Integer>) numeros).tailSet(30));
    }

    public static void LinkedHashSetEjemplo() {
        // 1. Creación de un LinkedHashSet.
        Set<String> nombres = new LinkedHashSet<>();

        // 2. Agregamos elementos al LinkedHashSet.
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Pedro");
        nombres.add("Beatriz");
        nombres.add("Ana"); // Elemento ignorado por ser duplicado.

        System.out.println("LinkedHashSet: " + nombres);

        nombres.remove("Pedro");
        System.out.println("Después de eliminar 'Pedro': " + nombres);

        System.out.println("¿Contiene 'Ana'? " + nombres.contains("Ana"));
    }
}
