/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manejoexpresionesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author juan.quintanag
 */
public class ManejoExpresionesRegulares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ejemploValidarExpresionRegularCadena();
        ejemploCoincidenciasExpresionRegular();
        ejemploRemplazoCaracteresExpresionRegular();
    }
    
    public static void ejemploValidarExpresionRegularCadena(){
        
        // regex contiene el formato de número como "123-45-6789".
        String regex = "\\d{3}-\\d{2}-\\d{4}";
        String texto = "Mi número es 123-45-6789";

        boolean coincide = Pattern.matches(regex, texto);
        
        // Resultado: false (matches evalúa toda la cadena).
        System.out.println("¿Coincide?: " + coincide);
    }
    
    public static void ejemploCoincidenciasExpresionRegular(){
        // regex contiene el formato para buscar números en el texto.
        String regex = "\\d+"; 
        String texto = "Hay 3 gatos, 7 perros y 15 peces.";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            System.out.println("Número encontrado: " + matcher.group());
        }
    }
    
    public static void ejemploRemplazoCaracteresExpresionRegular(){
        String texto = "Hola 123, adiós 456";
        
        // nuevoTexto remplazara cualquier número que encuentre por ###
        String nuevoTexto = texto.replaceAll("\\d+", "###");
        System.out.println(nuevoTexto); 
    }
}
