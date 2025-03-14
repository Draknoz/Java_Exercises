/*3 - Escreva um método que calcule e retorne o valor da conta de energia a ser paga de acordo com a quantidade de kW consumidos, 
sendo que o valor do kW é 0,60 (pessoa física), 0,48 (comércio) e 1,29 (indústria). */

import java.util.Scanner;

public class atv3 {
    public static float pessoa_fisica(float kw) {

        float pagar = kw * 0.60f;

        return pagar;
        
    }
    public static float comercio(float kw) {
        
        float pagar = kw * 0.48f;

        return pagar;

    }
    public static float industria(float kw) {
        
        float pagar = kw * 1.29f;

        return pagar;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu consumo Kw: ");
        float kw = input.nextFloat();

        System.out.printf("\nPesso Fisica = 1 Comercio = 2 Industria = 3 ");
        System.out.print("Sabendo disso digite a qual grupo pertence: ");
        int op = input.nextInt();

        switch (op) {
            case 1:
                pessoa_fisica(kw);
                break;
            case 2:
                comercio(kw);
                break;
            case 3:
                industria(kw);
                break;
        }

        if (op == 1) {
            
            System.out.printf("\tO valor a pagar sera de R$: %.2f", pessoa_fisica(kw));

        }else if (op == 2) {
            
            System.out.printf("\tO valor a pagar sera de R$: %.2f", comercio(kw));

        }else if (op == 3) {
            
            System.out.printf("\tO valor a pagar sera de R$: %.2f", industria(kw));

        }


    }
}
