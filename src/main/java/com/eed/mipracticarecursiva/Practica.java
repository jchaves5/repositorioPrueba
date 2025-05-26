/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eed.mipracticarecursiva;

/**
 *
 * @author EQUIPO
 */
public class Practica {
    
    public void imprime (int numero){
        // 1. Caso Base  / Condición de Parada.
        if (numero == 1)
        {
            // Mando a imprimir el número    
            System.out.println(numero);
            // retorno.
        }else{ 
        // 2. Caso Recursivo.
            System.out.println(numero);
            numero = numero - 1;
            imprime(numero);
        }
    }
/* TAREA FORMATIVA: REVISAR PQ ESTE CODIGO SE CAE.*/
    public int sumaNumeros(int posicion, int n){
        if (posicion == n)
             return posicion;
        else
            return posicion + sumaNumeros(posicion++,n);
    }

    public int sumaNumeros(int n){
        if (n == 1){
            return 1;
        }
        else{
            return n + sumaNumeros (n-1);
        }
            
    }
    
}
