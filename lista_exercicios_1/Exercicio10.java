package lista_exercicios_1;

import java.util.Scanner;

// Crie um programa que leia o salário de um funcionário e calcule o novo salário com um aumento de 15%.
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o salário do funcionário (em reais): ");
        double salario_base = entrada.nextDouble();

        double salario_novo = salario_base * 1.15;
        System.out.printf("O novo salário do funcionário, com um aumento de 15%% é R$ %.2f" , salario_novo);
    }
}
