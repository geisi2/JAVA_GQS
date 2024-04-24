/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.praticasjava.atividade02;

/**
 *
 * @author geisi
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Atividade02 {

    // Criamos uma variável para armazenar a janela principal
    private JFrame frame;
    // Criamos uma variável para armazenar o campo de texto onde o usuário irá inserir o número
    private JTextField inputField;
    // Criamos uma variável para armazenar o rótulo que irá exibir o resultado
    private JLabel resultLabel;

    // Construtor da classe FatorialCalculator
    public Atividade02() {
        // Criamos a janela principal com o título "Fatorial Calculator"
        frame = new JFrame("Fatorial Calculator");
        // Definimos o comportamento da janela quando o usuário fecha ela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Definimos o layout da janela como FlowLayout
        frame.setLayout(new FlowLayout());

        // Criamos um rótulo para informar ao usuário que ele deve inserir um número
        JLabel inputLabel = new JLabel("Informe um número:");
        // Criamos o campo de texto onde o usuário irá inserir o número
        inputField = new JTextField(10);

        // Criamos um botão para calcular o fatorial
        JButton calculateButton = new JButton("Calcular Fatorial");
        // Adicionamos um listener ao botão para que ele execute uma ação quando for clicado
        calculateButton.addActionListener(new CalculateButtonListener());

        // Criamos um rótulo para exibir o resultado
        resultLabel = new JLabel("Resultado:");

        // Adicionamos os componentes à janela
        frame.add(inputLabel);
        frame.add(inputField);
        frame.add(calculateButton);
        frame.add(resultLabel);

        // Tamanho da janela é ajustado automaticamente com base nos componentes adicionados
        frame.pack();
        // Mostramos a janela
        frame.setVisible(true);
    }

    // Classe interna que implementa o listener do botão
    private class CalculateButtonListener implements ActionListener {
        // Método que é executado quando o botão é clicado
        @Override
        public void actionPerformed(ActionEvent e) {
            // Tentamos converter o texto inserido pelo usuário em um número inteiro
            int number = 0;
            try {
                number = Integer.parseInt(inputField.getText());
            } catch (NumberFormatException ex) {
                // Se o usuário inseriu um texto que não é um número, mostramos uma mensagem de erro
                JOptionPane.showMessageDialog(frame, "Erro: número inválido");
                return;
            }

            // Verificamos se o número é negativo
            if (number < 0) {
                // Se o número é negativo, mostramos uma mensagem de erro
                JOptionPane.showMessageDialog(frame, "Erro: número negativo");
                return;
            }

            // Calculamos o fatorial do número
            int fatorial = calculateFatorial(number);
            // Exibimos o resultado
            resultLabel.setText("Resultado: " + fatorial);
        }
    }

    // Método que calcula o fatorial de um número
    private int calculateFatorial(int number) {
        // Inicializamos o fatorial com 1
        int fatorial = 1;
        // Loop que multiplica os números de 1 a number
        for (int i = 1; i <= number; i++) {
            fatorial *= i;
        }
        // Retornamos o fatorial calculado
        return fatorial;
    }

    // Método main que inicia a aplicação
    public static void main(String[] args) {
        // Criamos uma thread que irá executar a aplicação
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Criamos uma instância da classe FatorialCalculator
                new Atividade02();
            }
        });
    }
}
    