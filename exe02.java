import java.util.Scanner;

public class exe02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o raio do circulo:");
        double raio = sc.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("O raio é:" +area);
        sc.close();
    }
}
