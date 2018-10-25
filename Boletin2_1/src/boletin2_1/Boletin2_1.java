/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_1;

import java.util.Scanner;

/**
 *
 * @author cfigueirasvalverde
 */
public class Boletin2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float prezotarifa=0, prezopagado=0, porcentaxepagado;
        System.out.println("teclea prezotarifa:");
        prezotarifa=ler.nextFloat();
        System.out.println("teclea prezopagado:");
        prezopagado=ler.nextFloat();
        porcentaxepagado=(prezopagado*100)/prezotarifa;
        System.out.println("o percentaxe e do:"+porcentaxepagado+"%");
    }
    
}
