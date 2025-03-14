/*1 - Escreva um método que receba o nome e as 3 notas de um aluno e mostre o nome do aluno e a 
sua média aritmética.*/

import java.util.Scanner;

public class atv1 {
    public static float media(String nome, float nota1, float nota2, float nota3, int idade){

        System.out.printf("\nO nome do aluno é: %s", nome);
        System.out.printf("\nA idade dele é: %d ", idade);
        float m_aritimetica = (nota1 + nota2 + nota3)/3;

        return m_aritimetica;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Informe seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite sua idade:");
        int idade = input.nextInt();

        System.out.printf("Digite a primeira nota: ");
        float nota1 = input.nextFloat();

        System.out.printf("Digite a segunda nota: ");
        float nota2 = input.nextFloat();

        System.out.printf("Digite terceira nota: ");
        float nota3 = input.nextFloat();


        float teste = media(nome, nota1, nota2, nota3, idade);

        System.out.printf("\nA media do aluno é: %.2f ", teste);

        input.close();
    }
}