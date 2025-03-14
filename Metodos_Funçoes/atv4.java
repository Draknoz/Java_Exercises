/*4 - Escreva um método que solicite ao usuário o nome de um produto, o preço desse produto e o valor em dinheiro entregue ao vendedor. 
Em seguida, deve ser mostrada uma mensagem baseada no seguinte exemplo: 
"Você comprou um produto (mouse) por R$ 185,00 e entregou ao vendedor R$ 200,00 em dinheiro. 
Você vai receber R$ 15,00 de troco. Volte sempre!". */

import java.util.Scanner;

public class atv4 {

    public static void troco(String nome, Float preco, Float dinheiro) {

        System.out.printf("Voce comprou um produto %s por %.2f e entregou ao vendedor %.2f em dinheiro.", nome, preco, dinheiro); 
        float troco = dinheiro - preco;
        System.out.printf("\nVoce vai receber R$: %.2f de troco. Volte sempre!", troco);
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = input.nextLine();
        System.out.print("Digite o vlor do produto: ");
        float preco = input.nextFloat();
        System.out.printf("Digite o valor entregue: ");
        float dinheiro = input.nextFloat();

        troco(nome, preco, dinheiro);
    }
}
