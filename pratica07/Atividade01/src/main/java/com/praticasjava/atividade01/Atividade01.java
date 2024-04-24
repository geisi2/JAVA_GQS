/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.praticasjava.atividade01;

/**
 *
 * @author geisi
 */

   import java.util.Scanner;
public class Atividade01 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 numeros: ");
        int[] arr = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i] + " ");
        }
       
        System.out.println("Soma dos números pares: " + sum);
    }
}

