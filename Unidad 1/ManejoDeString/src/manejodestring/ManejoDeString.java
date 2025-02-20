/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manejodestring;

import java.util.Arrays;

/**
 *
 * @author juan.quintanag
 */
public class ManejoDeString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // ==============================================
        // Creación y obtención de información.
        // ==============================================
        
        // Método length() – Devuelve la cantidad de caracteres en la cadena.
        String texto = "Hola";
        System.out.println(texto.length());

        // charAt(int index) – Devuelve el carácter en la posición indicada.
        String charAtExample = "Hola";
        System.out.println(charAtExample.charAt(1));

        // isEmpty() – Verifica si la cadena está vacía (length() == 0).
        String isEmptyExample = "";
        System.out.println(isEmptyExample.isEmpty());

        // isBlank() Para Java 11 – Verifica si la cadena está vacía o contiene 
        // solo espacios en blanco.
        String isBlank = "   ";
        System.out.println(isBlank.isBlank());

        // ==============================================
        // Comparación de cadenas de caracteres.
        // ==============================================
        // equals(String otraCadena) – Compara si dos cadenas son exactamente
        // iguales.
        String cadena1 = "Hola";
        String cadena2 = "hola";
        System.out.println(cadena1.equals(cadena2));

        // equalsIgnoreCase(String otraCadena) – Compara ignorando mayúsculas 
        // y minúsculas.
        System.out.println(cadena1.equalsIgnoreCase(cadena2));

        // compareTo(String otraCadena) – Compara dos cadenas lexicográficamente
        // (devuelve un número negativo, 0 o positivo).
        System.out.println(cadena1.compareTo("Mundo"));

        // compareToIgnoreCase(String otraCadena) – Igual que compareTo(), pero
        // ignorando mayúsculas.
        System.out.println(cadena1.compareToIgnoreCase(cadena2));

        // ==============================================
        // Búsqueda en cadenas.
        // ==============================================
        String cadena3 = "Hola mundo";
        String cadena4 = "Java Java Java";

        // contains(CharSequence secuencia) – Verifica si la cadena contiene 
        // una secuencia de caracteres.
        System.out.println(cadena3.contains("mundo"));

        // startsWith(String prefijo) – Verifica si la cadena comienza con 
        // un prefijo.
        System.out.println(cadena1.startsWith("Ho"));

        // endsWith(String sufijo) – Verifica si la cadena termina con 
        // un sufijo.
        System.out.println(cadena1.endsWith("la"));

        // indexOf(String subcadena) – Devuelve la posición de la primera
        // aparición de una subcadena.
        System.out.println(cadena3.indexOf("mundo"));

        // lastIndexOf(String subcadena) – Devuelve la posición de la última
        // aparición de una subcadena.
        System.out.println(cadena4.lastIndexOf("Java"));

        // ==============================================
        // Modificación de cadenas.  
        // ==============================================
        // toUpperCase() – Convierte la cadena a mayúsculas. 
        System.out.println(cadena1.toUpperCase());

        //toLowerCase() – Convierte la cadena a minúsculas.
        System.out.println(cadena1.toLowerCase());

        //trim() – Elimina espacios en blanco al inicio y al final.
        System.out.println("  Hola  ".trim());

        // replace(char viejo, char nuevo) – Reemplaza un carácter por otro.
        System.out.println(cadena1.replace('o', 'a'));

        // ============================================================
        // Extracción de partes de una cadena
        // ============================================================
        // substring(int inicio) – Extrae una subcadena desde el índice
        // especificado hasta el final.
        System.out.println(cadena3.substring(5));

        // substring(int inicio, int fin) – Extrae una subcadena desde 
        // inicio hasta fin (exclusivo).
        System.out.println(cadena3.substring(0, 4));
        
        // ============================================================
        // División y unión de cadenas
        // ============================================================
        
        // split(String regex) – Divide la cadena en un array usando 
        // una expresión regular.
        String[] partes = "uno,dos,tres".split(",");
        System.out.println(Arrays.toString(partes));

        // join(CharSequence delimitador, CharSequence... elementos) 
        // desde Java 8 – Une elementos con un delimitador.
        String resultado = String.join("-", "uno", "dos", "tres");
        System.out.println(resultado);
        
        // ============================================================
        // Conversión y formato.
        // ============================================================
        
        // valueOf(Tipo valor) – Convierte valores en cadena.
        System.out.println(String.valueOf(123));

        // format(String formato, Object... args) – Formatea la cadena 
        // con especificadores (%s, %d, etc.).
        String nombre = "Juan";
        int edad = 25;
        String mensaje = String.format("Nombre: %s, Edad: %d", nombre, edad);
        System.out.println(mensaje);
        
        // ============================================================
        // Conversión a otros tipos.
        // ============================================================
        // toCharArray() – Convierte la cadena en un array de caracteres.
        char[] caracteres = cadena1.toCharArray();
        System.out.println(Arrays.toString(caracteres));
    }

}
