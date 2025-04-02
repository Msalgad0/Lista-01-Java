/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
 código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

 */
import java.util.Scanner;

public class exe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Primeira peça
        System.out.print("Digite o código da primeira peça: ");
        int codigoPeca1 = sc.nextInt();
        System.out.print("Digite o número de unidades da primeira peça: ");
        int quantidadePeca1 = sc.nextInt();
        System.out.print("Digite o valor unitário da primeira peça: ");
        double valorPeca1 = sc.nextDouble();

        // Segunda peça
        System.out.print("Digite o código da segunda peça: ");
        int codigoPeca2 = sc.nextInt();
        System.out.print("Digite o número de unidades da segunda peça: ");
        int quantidadePeca2 = sc.nextInt();
        System.out.print("Digite o valor unitário da segunda peça: ");
        double valorPeca2 = sc.nextDouble();

        // Cálculo do valor total
        double valorTotal = (quantidadePeca1 * valorPeca1) + (quantidadePeca2 * valorPeca2);

        // Exibição do resultado formatado
        System.out.printf("Valor total a pagar: R$ %.2f%n", valorTotal);

        sc.close();
    }
}
