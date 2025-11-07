package lista_exercicios_1;

import java.util.Scanner;

// Escreva um programa que leia o raio de um círculo e calcule sua área e perímetro.
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o raio do círculo (em centímetros): ");
        float raio = entrada.nextFloat();

        float area = (float) (Math.PI * Math.pow(raio, 2));
        float perimetro = (float) (2 * Math.PI * raio);

        System.out.printf("A área do círculo é %.2f cm, e " , area);
        System.out.printf("o perímetro do círculo é %.2f cm" , perimetro);
    }
}
