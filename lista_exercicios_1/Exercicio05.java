package lista_exercicios_1;

import java.util.Scanner;

// Faça um programa que receba o salário base de um funcionário e calcule o seu salário líquido, considerando que o funcionário recebe 5% de comissão sobre o salário base.
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o salário base do funcionário (em reais): ");
        double salario_base = entrada.nextDouble();

        double salario_liquido = salario_base * 1.05;
        System.out.printf("O salário líquido do funcionário, com a comissão de 5%% é R$ %.2f" , salario_liquido);
    }
}
