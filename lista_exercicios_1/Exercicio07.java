package lista_exercicios_1;

import java.util.Scanner;

// Crie um programa que leia o valor do depósito mensal em uma poupança e a taxa de juros mensal, e calcule o montante após 12 meses.
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do depósito mensal (em reais): ");
        double deposito_mensal = entrada.nextDouble();

        System.out.println("Digite a porcentagem da taxa de juros mensal (apenas números, ex: 1,05% = 1,05):");
        double juros_mensal = entrada.nextDouble();

        double montante = 0;
        for (int i=0;i<12;i++){
            montante += deposito_mensal;
            montante *= 1+(juros_mensal/100);
        }

        System.out.printf("Após 12 meses, o montante será R$ %.2f" , montante);
    }
}
