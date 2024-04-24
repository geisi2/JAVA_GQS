/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.praticasjava.atividade4;

/**
 *
 * @author geisi
 * Receba os valores dos dois catetos de um triângulo, calcule e apresente
 * o valor da hipotenusa. OBS - Teorema de Pitágoras: a2 = b2 + c2
.
 */
import java.util.Scanner;
import java.lang.Math;

public class Atividade4 {
    
    public static double exponenciacao (double g){
        double numero,soma;  
        numero = g;
        soma = Math.pow(numero,2);
        return (soma);
    }   
    
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in); 
       double cateto1, resultadoB, cateto2, resultadoC, hipotenusa, total;
                
       System.out.print("Digite um o valor do primeiro cateto:");
       cateto1 = entrada.nextDouble();
       resultadoB = exponenciacao (cateto1);
      
       System.out.print("Digite um o valor do segundo cateto:");
       cateto2 = entrada.nextFloat();
       resultadoC = exponenciacao (cateto2);
      
        hipotenusa = resultadoB + resultadoC;
        total = exponenciacao (hipotenusa);
       
       System.out.println("O resultado do Teorema de Pitágoras é igual a " + total);
       
       
       
    }
}
