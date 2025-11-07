package lista_exercicios_1;

import java.util.Scanner;

// Faça um programa que leia um número inteiro e exiba a sua tabuada de multiplicação até o décimo valor.
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        System.out.println("Tabuada do " + numero);

        for (int i=1;i<=10;i++){
            System.out.println(numero + " * " + i + " = " + (numero*i));
        }
    }
}
