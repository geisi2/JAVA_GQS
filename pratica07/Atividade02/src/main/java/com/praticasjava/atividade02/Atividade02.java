/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.praticasjava.atividade02;

/**
 *
 * @author geisi
 */

import java.util.Scanner;
public class Atividade02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] arr = new double[10];
        System.out.println("Digite 10 numeros:");
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextDouble();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            if (arr[i] < 0) {
                System.out.println("Número negativo na posição " + i);
            }
        }
    }
}