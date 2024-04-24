/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.praticasjava.atividade2;

/**
 *
 * @author geisi
 */

import javax.swing.JOptionPane;
public class Atividade2 {

   public static void main(String[] args) {
        String entrada;
        double nota;
        double salario;
        char sexo;
        int idade;

        do {
            entrada = JOptionPane.showInputDialog("Informe a nota (entre 0 e 10): ");
            nota = Double.parseDouble(entrada);
        } while (nota < 0 || nota > 10);
        JOptionPane.showMessageDialog(null, "Nota validada com sucesso.");

        do {
            entrada = JOptionPane.showInputDialog("Informe o salário (maior que zero): ");
            salario = Double.parseDouble(entrada);
        } while (salario <= 0);
        JOptionPane.showMessageDialog(null, "Salário validado com sucesso.");

        do {
            entrada = JOptionPane.showInputDialog("Informe o sexo (m ou f): ");
            sexo = entrada.charAt(0);
        } while (sexo != 'm' && sexo != 'f');
        JOptionPane.showMessageDialog(null, "Sexo validado com sucesso.");

        do {
            entrada = JOptionPane.showInputDialog("Informe a idade (entre 0 e 150): ");
            idade = Integer.parseInt(entrada);
        } while (idade < 0 || idade > 150);
        JOptionPane.showMessageDialog(null, "Idade validada com sucesso.");

        System.exit(0);
    }
}