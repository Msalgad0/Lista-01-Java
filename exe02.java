import java.util.Scanner;
/*
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
*/

public class exe02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o raio do circulo:");
        double raio = sc.nextDouble();
        double area = 3.14159 * Math.pow(raio, 2);
        System.out.printf("O raio é: " + "%.4f%n",area );
        sc.close();
    }
}
