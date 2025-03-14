/*5 - Escreva um método que solicite ao usuário o nome e o preço de um produto. Em seguida, deve ser mostrada uma mensagem baseada no seguinte exemplo: 
"Você comprou um produto (mouse) por R$ 185,00 e acaba de ganhar um desconto de 10%. Assim você vai pagar apenas R$ 166,50 pelo seu produto. Volte sempre!". */

import java.util.Scanner;

public class atv5 {

    public static void troco(String nome, Float valor) {

        System.out.printf("Voce comprou um produto %s por %.2f porem recebeu um desconto de 10 porcento.", nome, valor); 
        float pagar = valor - (valor * 0.1f);
        System.out.printf("\nVoce vai pagar apenas R$: %.2f de troco. Volte sempre!", pagar);

        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = input.nextLine();
        System.out.print("Digite o valor do produto: ");
        float valor = input.nextFloat();

        troco(nome, valor);
    }
}