//Escreva um programa que leia horas, minutos e segundos do teclado e apresente o tempo total em segundos

import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de horas: ");
        int h = input.nextInt();

        System.out.print("Informe a quantidade de minutos: ");
        int min = input.nextInt();

        System.out.print("Informe a quantidade de segundos: ");
        int seg = input.nextInt();

        int total_segundos = (h * 3600) + (min * 60) + seg;
        System.out.print("Tempo total em segundos: " + total_segundos);

        input.close();
    }
}