import java.util.Scanner;

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
