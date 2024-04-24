/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.praticasjava.atividade3;

/**
 *
 * @author geisi
 * 
 * Receba o valor do salário mínimo e o valor do salário de um funcionário. O algoritmo
* deve calcular e apresentar a quantidade de salários mínimos que esse funcionário
* recebe.
 */

import java.util.Scanner;
public class Atividade3 {
    public static float valorSalarioMinimo() {
        float salarioMinimo = 1412;    
        return (salarioMinimo);
    }
    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       float salario, qtd_SalariosMinimos, minimo;
       
       minimo = valorSalarioMinimo();
               
       System.out.println("Digite o valor do seu salário:  ");
       salario = entrada.nextFloat();
       
       qtd_SalariosMinimos = salario / minimo ;
       
      System.out.println("O salário minimo atualmente é: " + minimo );

        System.out.format("Seu salário é referente à %.0f salários mínimos", qtd_SalariosMinimos);
       
    }
}
