/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.*/

import java.util.Locale;
import java.util.Scanner;

public class exe06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite a variavel A");
        double variavelA= sc.nextDouble();
        System.out.println("Digite a variavel B");
        double variavelB= sc.nextDouble();
        System.out.println("Digite a variavel C");
        double variavelC= sc.nextDouble();

        double triangulo = (variavelA * variavelC) / 2;
        double pi = 3.14159265359;
        double circulo = pi * Math. pow (variavelC, 2);
        double trapezio = ((variavelA + variavelB) * variavelC) / 2;
        double quadrado = Math. pow (variavelB,2);
        double retangulo = variavelA * variavelB;

        System.out.printf("Área do traingulo: %.3f%n",triangulo);
        System.out.printf("Área do circulo: %.3f%n",circulo);
        System.out.printf("Área do trapezio: %.3f%n",trapezio);
        System.out.printf("Área do quadrado: %.3f%n",quadrado);
        System.out.printf("Área do retangulo: %.3f%n",retangulo);

        sc.close();
    }
}
