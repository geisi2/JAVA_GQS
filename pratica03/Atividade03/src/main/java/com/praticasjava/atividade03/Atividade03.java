/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.praticasjava.atividade03;

/**
 *
 * @author geisi
 * 
 * Resolva uma equação de segundo grau, realizando consistências dos valores dos
coeficientes (“a”, “b” e “c”) e do discriminante (delta), conforme descrito abaixo.
a. Se os coeficientes “a”, “b” e “c” forem iguais a zero, apresentar a mensagem
"Igualdade confirmada: 0 = 0".
b. Se os coeficientes “a” e “b” forem iguais a zero e o coeficiente “c” for
diferente de zero, apresentar a mensagem “Coeficientes informados
incorretamente”.
c. Caso o coeficiente “a” seja igual a zero e o coeficiente “b” for diferente de
zero, deverá ser impressa a mensagem: “Esta é uma equação de primeiro
grau” e deverá ser apresentado o valor da raiz real da equação (x = -c / b).
d. Caso o coeficiente “a” seja diferente de zero:
i. Deverá ser impressa a mensagem: “Esta é uma equação de segundo
grau”.
ii. Caso o discriminante seja negativo, deverá ser impressa a mensagem:
“Esta equação não possui raízes reais”.
iii. Caso o discriminante seja zero, apresentar a mensagem “Esta equação
possui duas raízes reais iguais”. Em seguida, apresentar o valor das
raízes da equação (x = -b / (2 * a)).
iv. Caso o discriminante seja maior que zero, apresentar a mensagem
“Esta equação possui duas raízes reais diferentes”. Em seguida,
apresentar o valor das raízes da equação.

 */

import java.util.Scanner;
public class Atividade03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escreva o coeficiente 'a': ");
        double a = entrada.nextDouble();

        System.out.print("Escreva o coeficiente 'b': ");
        double b = entrada.nextDouble();

        System.out.print("Escreva o coeficiente 'c': ");
        double c = entrada.nextDouble();

        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Igualdade confirmada: 0 = 0");
        } else if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente");
        } else if (a == 0 && b != 0) {
            double x = -c / b;
            System.out.printf("Esta é uma equação de primeiro grau. Raiz real: x = %.2f%n", x);
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais, delta = " + delta);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.printf("Esta equação possui duas raízes reais iguais. Raízes: x1 = x2 = %.2f%n", x);
            } else {
                double sqrtDelta = Math.sqrt(delta);
                double x1 = (-b + sqrtDelta) / (2 * a);
                double x2 = (-b - sqrtDelta) / (2 * a);
                System.out.printf("Esta equação possui duas raízes reais diferentes. Raízes: x1 = %.2f, x2 = %.2f%n", x1, x2);
            }
        }
    }

}
