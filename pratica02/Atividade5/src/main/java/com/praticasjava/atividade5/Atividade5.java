/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.praticasjava.atividade5;

/**
 *
 * @author geisi
 * 
 * Receba o raio, calcule e apresente:

a. O comprimento de uma esfera: C = 2 * π * R.
b. A área de uma esfera: A = π * R2
c. O volume de uma esfera: V = 3⁄4 * π * R3
.
 */
import java.util.Scanner;
import java.lang.Math;

public class Atividade5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double comprimento, raio, area, mul_volume, volume ; 
        
        
        System.out.print("Digite o raio da esfera:");
        raio = entrada.nextDouble();
  
        comprimento = 2 * Math.PI * raio;
     
         System.out.println("O comprimento da esfera é igual a " + comprimento );

        area = Math.PI * Math.pow(raio,2);
        System.out.println( "A Aréa da esfera é igual a "+ area );
        
        mul_volume = 3 * Math.PI * Math.pow(raio,3);
        volume = mul_volume / 4; 
        System.out.format( "O volume da esfera é igual a "+  volume  );


            
    }
}
