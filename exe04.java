import java.util.Scanner;

/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/
public class exe04 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = sc.nextLine();
        System.out.println("Qual o numero de horas trabalhadas nesse mês?");
        int horasTrabalhadas = sc.nextInt();
        System.out.println("Quanto voce recebe por horas trabalhadas?");
        double valorHora = sc.nextDouble();
        double salario = valorHora * horasTrabalhadas;
        System.out.printf(nome + "seu salario é: " + "R$: %.2f%n",salario);

        sc.close();
    }
}
