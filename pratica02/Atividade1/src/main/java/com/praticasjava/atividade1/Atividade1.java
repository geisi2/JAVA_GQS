/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.praticasjava.atividade1;

/**
 *
 * @author geisi
 * 
 * Calcule e apresente a área de um losango. 
 * As diagonais maior e menor do losango devem ser informadas pelo usuário. 
 * OBS: AREA = (DIAGONAL MAIOR * DIAGONAL MENOR) / 2.

 */


import java.util.Scanner;
public class Atividade1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float diagonalMaior, diagonalMenor, somaDiadonal, area;

        System.out.println("Informe o valor da diagonal maior: ");
        diagonalMaior = entrada.nextFloat();

        System.out.println("Informe o valor da diagonal menor: ");
        diagonalMenor = entrada.nextFloat();


        somaDiadonal = diagonalMaior + diagonalMenor;

        System.out.println("A aréa do losango é: " + somaDiadonal);
    }
}