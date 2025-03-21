/*1 - Crie uma classe que modele uma conta corrente. 
A classe deve possuir os seguintes atributos: número da conta, nome do correntista e saldo. 
Os métodos são os seguintes: depósito e saque. O saldo deve ser definido inicialmente com 0 (zero). 
A cada deposito ou saque efetuado deve ser mostrado o nome do correntista e o saldo atualizado.*/

import java.util.Scanner;

public class atv1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        correntista p1 = new correntista();
        int op = 0;

        
        do {
            System.out.println("\n<<<< BANCO VAPO VAPO >>>>");
            System.out.println("--------------------------");
            System.out.println("\t1. Cadastrar");
            System.out.println("\t2. Ver informações");
            System.out.println("\t3. Depositar");
            System.out.println("\t4. Sacar");
            System.out.println("\t5. Ver saldo");
            System.out.println("\t6. Sair");
            System.out.println("--------------------------");
            System.out.print("\tEscolha uma opcao: ");
            op = input.nextInt();
            input.nextLine();
            
            switch (op) {
                case 1:
                    System.out.printf("\nDigite seu nome: ");
                    p1.nome1 = input.nextLine();
                    System.out.printf("\nDigite sua idade:");
                    p1.idade1 = input.nextInt();
                    System.out.printf("\nDigite seu numero de conta:");
                    p1.numeroconta1 = input.nextFloat();
                    System.out.printf("\nDigite seu saldo:");
                    p1.saldo1 = 0;

                    System.out.println("\nCadastro realizado com sucesso!");

                    break;
                case 2:
                    p1.info();
                    break;
                case 3:
                    p1.deposito();
                    break;
                case 4:
                    p1.sacar();
                    break;
                case 5:
                    p1.versaldo();
                    break;
                case 6:
                    System.out.printf("\n O programa sera encerrado!!!");
                    break;
            }
        } while (op != 6);

    }
    
}
class correntista {
    Scanner input = new Scanner(System.in);

    String nome1;
    int idade1;
    float numeroconta1;
    float saldo1;

    public void info() {

        System.out.printf("cadastro: %s - %d - %.2f - %.2f ", this.nome1, this.idade1, this.numeroconta1, this.saldo1);
    }

    public void deposito(){
        System.out.printf("Digite o valor que deseja depositar: ");
        float dpo = input.nextFloat();
        saldo1 = saldo1 + dpo;

    }

    public void sacar(){
        System.out.printf("Digite o valor que deseja sacar: ");
        float retirar = input.nextFloat();
        saldo1 = saldo1 - retirar;

    }

    public void versaldo(){
        System.out.printf("O saldo da sua conta eh: %.2f");
    }

    
}