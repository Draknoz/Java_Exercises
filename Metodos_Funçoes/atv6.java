//6 - Escreva um método que retorne o maior valor entre três números inteiros.

import java.util.Scanner;

public class atv6 {

    public static int maior(int num1, int num2, int num3) {

        int giga = 0;

        if ((num1 > num2) && (num1 > num3)) {
            giga = num1;
            
        }
        if ((num2 > num3) && (num2 > num1)) {
             giga = num2;
        
        }
        if ((num3 > num2) && (num3 > num1)) {
             giga = num3;
    
        }   

        return giga;
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite um numero: ");
        int num1 = input.nextInt();

        System.out.printf("Digite mais um numero: ");
        int num2 = input.nextInt();

        System.out.printf("Digite mais um numero: ");
        int num3 = input.nextInt();

        maior(num1, num2, num3);

        System.out.printf("O maior e: %d ", maior(num1, num2, num3));

    }
}
