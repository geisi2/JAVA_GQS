/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.praticasjava.atividade01;

/**
 *
 * @author geisi
 * 
 * Leia a idade e sexo do cliente de uma academia de musculação e imprima o valor da
 mensalidade a ser paga. A academia possui a seguinte tabela para cobrança da
mensalidade de seus clientes:
* HOMENS                         MULHERES

até 15 anos 60,00           até 18 anos 60,00
16 a 18 anos 75,00          19 a 25 anos 90,00
19 a 30 anos 90,00          26 a 40 anos 85,00
31 a 40 anos 85,00          Acima de 40 anos 80,00
Acima de 40 anos 80,00
 */

import java.util.Scanner;

public class Atividade01 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int idade;
        char sexo;
        double mensalidade;
        
        System.out.println("Digite a idade do cliente: ");
        idade = entrada.nextInt();
        
        System.out.println("Digite o sexo do cliente (M/F): ");
        sexo = entrada.next().toUpperCase().charAt(0);
        
        
        if (sexo == 'F'){
            if (idade <= 18 ){
                mensalidade = 60;
                System.out.println("O valor da sua mensalidade é igual a " + mensalidade + " reais");
              } else if (idade <=25){
                mensalidade = 90;
                System.out.println("O valor da sua mensalidade é igual a " + mensalidade + " reais");
              } else if (idade <= 40){
                mensalidade = 85;
                System.out.println("O valor da sua mensalidade é igual a " + mensalidade + " reais");
              } else {
                mensalidade = 80;
                System.out.println("O valor da sua mensalidade é igual a " + mensalidade + " reais");
    
            }
        }
            
            else { 
                if (idade <=15){
                  mensalidade = 60;
                  System.out.println("O valor da sua mensalidade é igual a " + mensalidade + " reais");
               } else if (idade <=18){
                  mensalidade = 75;
                  System.out.println("O valor da sua mensalidade é igual a " + mensalidade + " reais");
                } else if (idade <=30){
                  mensalidade = 90;
                  System.out.println("O valor da sua mensalidade é igual a " + mensalidade + " reais");
                } else if (idade <=40){
                  mensalidade = 85;
                  System.out.println("O valor da sua mensalidade é igual a " + mensalidade + " reais");
                } else{
                  mensalidade = 80;
                  System.out.println("O valor da sua mensalidade é igual a " + mensalidade + " reais");
                }
            
            } 
        
    }
}
