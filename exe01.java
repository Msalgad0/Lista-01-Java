import java.util.Scanner;
/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
 */

public class exe01 {
   public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);

      System.out.println("Digite um numero: ");
      int x = sc.nextInt();
      System.out.println("Digite outro numero: ");
      int y = sc.nextInt();

      int soma = x + y;
      System.out.println("Soma: "+ soma);


      sc.close();
   }
}
