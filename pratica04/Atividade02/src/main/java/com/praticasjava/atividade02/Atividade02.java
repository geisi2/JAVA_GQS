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
        int totalPessoas = 0;
        double somaSalarios = 0;
        int somaFilhos = 0;
        double salario;
        int filhos;

        while (true) {
            System.out.print("Digite o salário (-1 para parar): ");
            salario = scanner.nextDouble();

            if (salario < 0) {
                break;
            }

            System.out.print("Digite o número de filhos: ");
            filhos = scanner.nextInt();

            totalPessoas++;
            somaSalarios += salario;
            somaFilhos += filhos;
        }

        double mediaSalarial = somaSalarios / totalPessoas;
        double mediaFilhos = (double) somaFilhos / totalPessoas;

        System.out.printf("Média salarial: %.2f%n", mediaSalarial);
        System.out.printf("Média do número de filhos: %.2f%n", mediaFilhos);
    }
}
   

