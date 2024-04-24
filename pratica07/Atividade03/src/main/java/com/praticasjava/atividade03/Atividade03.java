/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.praticasjava.atividade03;

/**
 *
 * @author geisi
 */

import java.util.Scanner;
public class Atividade03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] arr = new double[10];
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        
        System.out.println("Digite 10 numeros:");
    
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextDouble();
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i] + " ");
        }
        
        System.out.println("Menor número: " + min);
        System.out.println("Maior número: " + max);
    }
}
