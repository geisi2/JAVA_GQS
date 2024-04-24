/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.praticasjava.atividade01;

/**
 *
 * @author geisi
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Atividade01  {
    // Declarar componentes
    private JFrame frame;
    private JTextField campo1;
    private JTextField campo2;
    private JLabel labelResultado;

    public  Atividade01() {
        // Inicializar e configurar a janela
        frame = new JFrame("Soma de Impares");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Adicionar componentes à janela
        frame.add(new JLabel("Número 1:"));
        campo1 = new JTextField(5);
        frame.add(campo1);

        frame.add(new JLabel("Número 2:"));
        campo2 = new JTextField(5);
        frame.add(campo2);

        // Adicionar um botão para calcular a soma
        JButton botaoCalcular = new JButton("Calcular");
        frame.add(botaoCalcular);

        // Adicionar uma label para exibir o resultado
        labelResultado = new JLabel("Resultado:");
        frame.add(labelResultado);

        // Definir tamanho e visibilidade da janela
        frame.pack();
        frame.setVisible(true);

        // Adicionar ouvinte de ação ao botão
        botaoCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obter a entrada do usuário
                int num1 = Integer.parseInt(campo1.getText());
                int num2 = Integer.parseInt(campo2.getText());

                // Validar a entrada
                if (num1 <= 0 || num2 <= 0) {
                    JOptionPane.showMessageDialog(frame, "Erro: Insira números inteiros positivos.");
                    return;
                }

                // Calcular a soma dos números ímpares entre os dois limites
                int soma = 0;
                for (int i = Math.min(num1, num2) + 1; i < Math.max(num1, num2); i++) {
                    if (i % 2 != 0) {
                        soma += i;
                    }
                }

                // Exibir o resultado
                labelResultado.setText("Resultado: " + soma);
            }
        });
    }

    public static void main(String[] args) {
        // Criar e exibir a janela
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Atividade01 ();
            }
        });
    }
}