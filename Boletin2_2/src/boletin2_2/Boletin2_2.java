/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_2;

import java.util.Scanner;

/**
 *
 * @author cfigueirasvalverde
 */
public class Boletin2_2 {
 public static void main(String[] args) {
        // TODO code application logic here
        // Scanner se usa para introducir texto
        Scanner leer = new Scanner (System.in);
       float temperaturaC = 0;
       System.out.println("Intrdouzca temperatura celsius: ");
       temperaturaC = leer.nextFloat();
       //formula kelvin
       float conversionKelvin = (float) (temperaturaC + 273.15f);
       System.out.println(+temperaturaC+" grados son "+conversionKelvin+" grados kelvin");
       //formula fahrenheit
       float conversionFahrenheit = (float) ((temperaturaC * 1.8) + 32);
       System.out.println(temperaturaC+" grados son "+conversionFahrenheit+" grados fahrenheit");
               
        
        
    }
    
}