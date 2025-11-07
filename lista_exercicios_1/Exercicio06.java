package lista_exercicios_1;

import java.util.Scanner;

// Escreva um programa que leia dois números inteiros e troque os seus valores, ou seja, o primeiro deve ficar com o valor do segundo e vice-versa.
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valor1 = entrada.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valor2 = entrada.nextInt();

        int aux = valor1;
        valor1 = valor2;
        valor2 = aux;

        System.out.println("Após a troca, o primeiro valor é " + valor1 + " e o segundo valor é " + valor2);
    }
}
