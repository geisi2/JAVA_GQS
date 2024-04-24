/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.praticasjava.atividade2;

/**
 *
 * @author geisi
 * 
 * Receba uma temperatura em Celsius, calcule e mostre essa temperatura em Fahrenheit.
*   OBS: F = (C * 1,8) + 32.
*/

import java.util.Scanner;
public class Atividade2 {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
         float temperatura;
         double fahrenheit;

        System.out.println("Digite a temperatura em Celsius: ");
        temperatura = entrada.nextFloat();

        fahrenheit = (temperatura * 1.8) + 32 ;

        System.out.println("A temperatura " + temperatura + " C° em fahrenheit é: " + fahrenheit);

    }
}