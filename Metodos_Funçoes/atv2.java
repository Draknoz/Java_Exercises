/*2 - Uma escola remunera seus professores por hora/aula ministrada. 
Escreva um método que calcule e retorne o salário de um professor, sendo que o valor hora/aula obedece aos seguintes critérios: 
20,00 para o nível 1, 25,00 para o nível 2 e 30,00 para o nível 3.*/

import java.util.Scanner;

public class atv2 {
    public static float nv1(String nome, float horas) {

        float salario = horas * 20;

        return salario;
    }
    public static float nv2(String nome, float horas) {

        float salario = horas * 25;

        return salario;
        
    }
    public static float nv3(String nome, float horas) {
        
        float salario = horas * 30;

        return salario;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float tot1 = 0;

        System.out.print("Digite o nome do prfessor: ");
        String nome = input.nextLine();

        System.out.print("Digite as horas trabalhadas: ");
        float horas = input.nextFloat();

        System.out.printf("\nO nives de professores são: (Nv1=1 Nv2=2 Nv3=3) ");
        System.out.print("Sabendo disso digite o nivel do professor: ");
        int nv = input.nextInt();


        switch (nv) {
            case 1:
               nv1(nome, horas);
                break;
            case 2:
                nv2(nome, horas);
                break;
            case 3:
                nv3(nome, horas);
                break;
        }

        if (nv == 1) {
            
            System.out.printf("O nome do professor é: %s", nome);
            System.out.printf("\tSeu Salario sera de R$: %.2f", nv1(nome, horas));

        }else if (nv == 2) {
            
            System.out.printf("O nome do professor é: %s", nome);
            System.out.printf("\tSeu Salario sera de R$: %.2f", nv2(nome, horas));

        }else if (nv == 3) {
            
            System.out.printf("O nome do professor é: %s", nome);
            System.out.printf("\tSeu Salario sera de R$: %.2f", nv3(nome, horas));

        }

    }
}
