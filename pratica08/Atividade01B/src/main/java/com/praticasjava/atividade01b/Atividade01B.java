/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.praticasjava.atividade01b;

/**
 *
 * @author geisi
 */
 import java.util.Scanner;
public class Atividade01B {
  public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Elementos armazenados nas posições em que o índice da linha par e o índice da coluna ímpar:");
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j < matrix[i].length; j += 2) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
