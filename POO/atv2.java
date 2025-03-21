/*2 - Crie uma classe que modele uma pessoa. A classe deve possuir os seguintes atributos: 
nome, idade, peso e altura. Os métodos são os seguintes: envelhecer (um ano por vez), engordar (informar quantidade de quilos) e emagrecer (informar quantidade de quilos). 
Por padrão, a cada ano que uma pessoa envelhece, sendo a idade dela menor que 21 anos, ela deve crescer 1 cm*/

import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        pessoa p1 = new pessoa();
        int op = 0;

       System.out.printf("Digite seu nome: ");
       p1.nome = input.nextLine();
       System.out.printf("Digite sua idade: ");
       p1.idade = input.nextInt();
       System.out.printf("Digite sua altura: ");
       p1.altura = input.nextFloat();
       System.out.printf("Digite seu Peso: ");
       p1.peso = input.nextFloat(); 

        do {
            System.out.println("\n<<<< PASSAGEM DE TEMPO DO VAPO VAPO >>>>");
            System.out.println("--------------------------");
            System.out.println("\t1. pular um ano");
            System.out.println("\t2. engordar");
            System.out.println("\t3. emagrecer");
            System.out.println("\t4. dados pessoais");
            System.out.println("\t5. Sair");
            System.out.println("--------------------------");
            System.out.print("\tEscolha uma opcao: ");
            op = input.nextInt();
            input.nextLine();

            switch (op) {
                case 1:
                    p1.tempo();
                    break;
                case 2:
                    p1.engordar();
                    break;
                case 3:
                    p1.emagrecer();
                    break;
                case 4:
                    p1.dados();
                    break;
                case 5:
                    System.out.printf("\n O programa sera encerrado!!!");
                    break;
            }
        } while (op != 5);
    } 
}

class pessoa {
    Scanner input = new Scanner(System.in);
    String nome;
    int idade;
    float altura;
    float peso;

    public void tempo(){
        idade++;
        
        System.out.printf("parabens voce fez aniversario, agora sua idade é %d ", idade);
        if (idade<=21) {
            altura = altura + 1;
        }
    }
    public void engordar(){
        System.out.printf("O quanto que voce engordou: ");
        float engord = input.nextFloat();
        peso = peso + engord;
    }
    public void emagrecer(){
        System.out.printf("O quanto que voce emagreceu: ");
        float emagr = input.nextFloat();
        peso = peso - emagr;
    }
    public void dados(){

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(peso);
    }
  
}