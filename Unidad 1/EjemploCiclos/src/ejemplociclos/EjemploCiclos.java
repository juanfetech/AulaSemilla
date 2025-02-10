/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplociclos;

/**
 *
 * @author juan.quintanag
 */
public class EjemploCiclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // <editor-fold desc="[Ciclo For]">
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteración: " + i);
        }  
        //</editor-fold>
        
        // <editor-fold desc="[Ciclo While]">
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }
        //</editor-fold>
        
        // <editor-fold desc="[Ciclo Do-While]">
        int contador2 = 1;
        do {
            System.out.println("Contador do-while: " + contador2);
            contador2++;
        } while (contador2 <= 5);
        //</editor-fold>
    }
    
}
