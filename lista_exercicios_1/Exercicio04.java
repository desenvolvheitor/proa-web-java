package lista_exercicios_1;

import java.util.Scanner;

// Faça um programa que receba três notas de um aluno (cada nota de 0 a 10) e calcule a média ponderada considerando pesos 2, 3 e 5 para as notas, respectivamente.
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        float nota1 = entrada.nextFloat() * 2;

        System.out.println("Digite a segunda nota: ");
        float nota2 = entrada.nextFloat() * 3;

        System.out.println("Digite a terceira nota: ");
        float nota3 = entrada.nextFloat() * 5;

        float media_ponderada = (nota1+nota2+nota3) / 10;
        System.out.println("A média ponderada das 3 notas é: " + media_ponderada);
    }
}
