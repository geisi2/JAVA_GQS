/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.praticasjava.atividade1;

/**
 *
 * @author geisi
 */
import javax.swing.JOptionPane;
public class Atividade1 {

    public static void main(String[] args) {
      
        String entrada;
        int numeroConta, numeroInvertido, soma, digito;
        int multiplicador = 3; // multiplicador para calcular o dígito verificador

        do {
            entrada = JOptionPane.showInputDialog("Informe o número da conta (3 dígitos): ");
            numeroConta = Integer.parseInt(entrada);

            // Verifique se o número da conta tem 3 dígitos
            if (numeroConta < 100 || numeroConta > 999) {
                JOptionPane.showMessageDialog(null, "Número da conta inválido. Deve ter 3 dígitos.");
                continue;
            }

            // Calcule o dígito verificador
            numeroInvertido = inverter(numeroConta);
            soma = numeroConta + numeroInvertido;
            digito = calcularUltimoDigito(soma, multiplicador);

            JOptionPane.showMessageDialog(null, "O dígito verificador é: " + digito);

            entrada = JOptionPane.showInputDialog("Deseja continuar? (S)im ou (N)ão");
        } 
            while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));

        System.exit(0);
    }

    private static int inverter(int numero) {
        int invertido = 0;
        while (numero > 0) {
            invertido = invertido * 10 + (numero % 10);
            numero /= 10;
        }
        return invertido;
    }

    private static int calcularUltimoDigito(int soma, int multiplicador) {
        int total = 0;
        while (soma > 0) {
            total += (soma % 10) * multiplicador;
            soma /= 10;
            multiplicador = (multiplicador == 3) ? 1 : multiplicador + 1;
        }
        return total % 10;
    }
}
    