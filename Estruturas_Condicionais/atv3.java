/*Uma fabrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e
garrafa de 2 litros. Tomando por base que um comerciante compre uma determinada quantidade de
cada um dos formatos disponíveis, escreva um programa para calcular quantos litros de refrigerante
ele comprou.*/

import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantidade de latas de 350ml: ");
        int lata = input.nextInt();

        System.out.print("Quantidade de latas de 600ml: ");
        int garrafa = input.nextInt();

        System.out.print("Quantidade de garrafas de 2l: ");
        int litrao = input.nextInt();

        float total_litros = (lata * 0.35f) + (garrafa * 0.6f) + (litrao * 2);
        System.out.print("Total litros: " + total_litros);
        
        input.close();
    }
}
