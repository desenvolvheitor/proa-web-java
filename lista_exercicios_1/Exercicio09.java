package lista_exercicios_1;

import java.util.Scanner;

// Escreva um programa que leia a idade de uma pessoa em anos, meses e dias, e calcule quantos dias de vida ela tem.
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite quantos anos de vida você tem: ");
        int anos = entrada.nextInt();

        System.out.println("Além dos anos completos, digite quantos meses de vida você tem: ");
        int meses = entrada.nextInt();

        System.out.println("Além dos meses completos, digite quantos dias de vida você tem: ");
        int dias = entrada.nextInt();

        int idade_dias = anos * 365 + meses * 30 + dias;
        System.out.println("Você tem aproximadamente " + idade_dias + " dias de vida.");
    }
}
