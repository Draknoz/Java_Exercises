/*Escreva um programa que pergunte ao usuário a quantidade de km percorridos por um carro alugado
e a quantidade de dias pelos quais ele foi alugado. Calcule e mostre o valor a pagar, sabendo que o
carro custa R$ 70,00 por dia e R$ 0,15 por km rodado */

import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quilometros percorridos: ");
        float km_percorrido = input.nextFloat();

        System.out.print("Quantidade de dias: ");
        int dias = input.nextInt();

        float total_pagar = (km_percorrido * 0.15f) + (dias * 70);

        System.out.print("Total a pagar: " + total_pagar);

        input.close();
    }
}
