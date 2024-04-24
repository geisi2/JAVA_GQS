/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.praticasjava.atividade04;

/**
 *
 * @author geisi
 */

import javax.swing.JOptionPane;
public class Atividade04 {

    public static void main(String[] args) {
        // Inicializa as variáveis máximo e mínimo
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        // Usa um loop while para solicitar repetidamente a entrada do usuário
        while (true) {
            // Solicita a entrada do usuário
            String input = JOptionPane.showInputDialog("Digite um número inteiro (ou 'sair' para exibir o maior e o menor número informado)");

            // Se o usuário entrar 'sair', saia do loop
            if (input.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                // Tenta analisar a entrada como um inteiro
                int numero = Integer.parseInt(input);

                // Se a entrada for um inteiro válido, atualize o máximo e o mínimo conforme necessário
                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }

                // Exibe uma mensagem de sucesso
                JOptionPane.showMessageDialog(null, "Adicionado com sucesso!");
            } catch (NumberFormatException e) {
                // Se a entrada não for um inteiro válido, exiba uma mensagem de erro
                JOptionPane.showMessageDialog(null, "Digite apenas números!");
            }
        }

        // Se pelo menos um número foi inserido, exiba o máximo e o mínimo
        if (menor != Integer.MAX_VALUE) {
            JOptionPane.showMessageDialog(null, "O maior número informado é: " + maior + "\nO menor número informado é: " + menor);
        } else {
            // Se nenhum número foi inserido, exiba uma mensagem de erro
            JOptionPane.showMessageDialog(null, "Nenhum número foi informado!");
        }
    }
}
