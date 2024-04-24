/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.praticasjava.atividade03;

/**
 *
 * @author geisi
 */

import javax.swing.JOptionPane;
public class Atividade03 {
    public static void main(String[] args) {
        // Inicializa as variáveis de soma e contador
        int soma = 0;
        int contador = 0;

        // Usa um loop while para solicitar repetidamente a entrada do usuário
        while (true) {
            // Solicita a entrada do usuário
            String input = JOptionPane.showInputDialog("Digite uma idade (ou 'sair' para calcular a média)");

            // Se o usuário entrar 'sair', saia do loop
            if (input.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                // Tenta analisar a entrada como um inteiro
                int idade = Integer.parseInt(input);

                // Se for bem-sucedido, adicione a idade à soma e incremente o contador
                soma += idade;
                contador++;

                // Exibe uma mensagem de sucesso
                JOptionPane.showMessageDialog(null, "Adicionado com sucesso!");
            } catch (NumberFormatException e) {
                // Se a entrada não for um inteiro válido, exiba uma mensagem de erro
                JOptionPane.showMessageDialog(null, "Digite apenas números!");
            }
        }

        // Se pelo menos uma idade foi inserida, calcule e exiba a média
        if (contador > 0) {
            double media = (double) soma / contador;
            JOptionPane.showMessageDialog(null, "A média aritmética é: " + media);
        } else {
            // Se nenhuma idade foi inserida, exiba uma mensagem de erro
            JOptionPane.showMessageDialog(null, "Nenhuma idade foi informada!");
        }
    }
}






