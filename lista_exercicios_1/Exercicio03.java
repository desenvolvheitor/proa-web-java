package lista_exercicios_1;

import java.util.Scanner;

// Crie um programa que leia a base e a altura de um triângulo e calcule sua área.
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o tamanho da base do triângulo (em centímetros): ");
        float base = entrada.nextFloat();

        System.out.println("Digite o tamanho da altura do triângulo (em centímetros): ");
        float altura = entrada.nextFloat();

        float area = (base * altura) / 2;
        System.out.printf("A área do triângulo é %.2f cm" , area);
    }
}
