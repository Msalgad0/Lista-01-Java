import java.util.Scanner;
/*
Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
*/

public class exe03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o valor de A:");
        int A = sc.nextInt();
        System.out.println("Digite o valor de B:");
        int B = sc.nextInt();
        System.out.println("Digite o valor de C:");
        int C = sc.nextInt();
        System.out.println("Digite o valor de D:");
        int D = sc.nextInt();

        int calculo = (A*B - C*D);
        System.out.println("Diferença: " + calculo);

        sc.close();
    }
}
