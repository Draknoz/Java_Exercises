//Escreva um programa que leia um número inteiro e apresente o seu antecessor e o seu sucessor.

import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe numero: ");
        int numero = input.nextInt();
        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("Numero: " + numero);
        System.out.println("Antecessor: " + antecessor);
        System.out.print("Sucessor: " + sucessor);

        input.close();
    }
}
