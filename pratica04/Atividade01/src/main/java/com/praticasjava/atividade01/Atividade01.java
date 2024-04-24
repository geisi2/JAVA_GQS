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
        int totalAlunos = 0;
        int alunosAprovadosNota = 0;
        int alunosReprovados = 0;
        double maiorNota = -1;
        double menorNota = Double.MAX_VALUE;
        double somaNotas = 0;
        double nota;
        int faltas;

        while (true) {
            System.out.print("Digite a nota final (-1 para parar): ");
            nota = scanner.nextDouble();

            if (nota < 0) {
                break;
            }

            System.out.print("Digite a quantidade de faltas: ");
            faltas = scanner.nextInt();

            totalAlunos++;
            somaNotas += nota;

            if (nota >= 90) {
                alunosAprovadosNota++;
            }

            if (nota < 70 || faltas >= 20) {
                alunosReprovados++;
            }

            if (nota > maiorNota) {
                maiorNota = nota;
            }

            if (nota < menorNota) {
                menorNota = nota;
            }
        }

        double mediaNotas = somaNotas / totalAlunos;

        System.out.printf("Número de alunos aprovados por nota: %d%n", alunosAprovadosNota);
        System.out.printf("Número de alunos reprovados por nota ou faltas: %d%n", alunosReprovados);
        System.out.printf("Maior nota: %.2f%n", maiorNota);
        System.out.printf("Menor nota: %.2f%n", menorNota);
        System.out.printf("Média de notas da turma: %.2f%n", mediaNotas);
    }
}
