/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.praticasjava.atividade02;

/**
 *
 * @author geisi
 * 
 * Leia a tipo de apartamento e a quantidade de dias em que um hóspede esteve
* hospedado em um hotel e apresente o total a ser pago. O hotel possui a seguinte tabela
para cobrança da diária de seus clientes:
*Apto Simples                                |         Apto Duplo
*Número de diárias < 10 = 100,00             |    Número de diárias < 10 = 140,00
* Número de diárias entre 10 e 15 = 90,00     |    Número de diárias entre 10 e 15 = 120,00
* Número de diárias > 15 = 80,00              |    Número de diárias > 15 = 100,00
 */

import java.util.Scanner;

public class Atividade02 {
 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva o  tipo de  apartamento (simples/ duplo):");
        String tipoApartamento = entrada.nextLine().toLowerCase();

        System.out.println("Escreva quantos dias o hóspede ficou no apartamento:");
        int numeroDiarias = entrada.nextInt();

        double pagamento = calculoPagamento(tipoApartamento,numeroDiarias );

        System.out.printf("O total a ser pagado é: R$ %.2f%n", pagamento);
    }

    private static double calculoPagamento(String tipoApartamento, int numeroDiarias) {
        double pagamento = 0;

        switch (tipoApartamento) {
            case "simples":
                if (numeroDiarias < 10) {
                    pagamento = 100.00;
                } else if (numeroDiarias >= 10 && numeroDiarias <= 15) {
                    pagamento = 90.00;
                } else {
                    pagamento = 80.00;
                }
                break;
            case "duplo":
                if (numeroDiarias < 10) {
                    pagamento = 140.00;
                } else if (numeroDiarias >= 10 && numeroDiarias <= 15) {
                    pagamento = 120.00;
                } else {
                    pagamento = 100.00;
                }
                break;
            default:
                System.out.println("Tipo de Apartamento inválido.");
                System.exit(1);
        }

        return pagamento * numeroDiarias;
    }
}


