/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eed.mipracticarecursiva;

/**
 *
 * @author EQUIPO
 */
public class MiPracticaRecursiva {

    public static void main(String[] args) {
        String miVariable = new String ("imprime Numeros");
        
        miVariable = "Hola Tierra";
        
        System.out.println("Hello World!");
        
        Practica miPractica = new Practica();
        
        miPractica.imprime(8);
        
        System.out.print("Suma de Numeros");
        
        int suma = miPractica.sumaNumeros(1, 4);
 //       int suma = miPractica.sumaNumeros(10);
        
        System.out.print(suma);
        
    }
}
