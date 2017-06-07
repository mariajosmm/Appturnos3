/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author sena
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cuenta cuenta1 = new Cuenta();
        cuenta1.consignar(6000000);
        
        Algoritmo algoritmo1 = new  Algoritmo();
        algoritmo1.ejercicio1();
        algoritmo1.ejercicio2();
    }
    
}
