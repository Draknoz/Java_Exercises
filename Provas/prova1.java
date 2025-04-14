import java.util.ArrayList;
import java.util.Scanner;
 
 
public class prova1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<carro> carros= new ArrayList<>();
        int qtdcarros = 0;
 
 
        while (true) {
            System.out.println("\n#############################");
            System.out.println("# [1] Definir qtd de Carros");
            System.out.println("# [2] Adicionar carro");
            System.out.println("# [3] Aumentar a velocidade");
            System.out.println("# [4] Diminuir a Velocidade");
            System.out.println("# [5] Mostrar Informacoes");
            System.out.println("# [6] Excluir carro");
            System.out.println("# [7] Sair");
            System.out.println("\n#############################");
            int opcao = input.nextInt();
            input.nextLine();
 
 
            switch (opcao) {
                case 1:
                    System.out.println("Quantas carros?");
                    qtdcarros = input.nextInt();
                    input.nextLine();
                    break; 
                case 2:
                    if (carros.size() < qtdcarros) {
                        System.out.println("Informe o modelo do carro:");
                        String modelo = input.nextLine();
                        System.out.println("Informe a cor do carro:");
                        String cor = input.nextLine();
                        System.out.println("Informe o ano do carro:");
                        int ano = input.nextInt();
                        System.out.println("Informe a velocidade maxima:");
                        int vel_max = input.nextInt();
                        System.out.println("Informe a velocidade atual:");
                        int vel_atual = input.nextInt();
                        input.nextLine();
                        carros.add(new carro(modelo,cor,ano,vel_max,vel_atual));
                    } else {
                        System.out.println("Limite de carros atingido!");
                    }
 
 
                    break;
                case 3:
                    input.nextLine();
                    System.out.println("Digite o nome do modelo que deseja aumentar a velocidade:");
                    String buscar = input.nextLine();
                    boolean encontrado = false;
 
 
                    for (carro c : carros) {
                        if (c.getModelo().equalsIgnoreCase(buscar)) {
                            if (c.getVel_atual() < c.getVel_max()) {
 
 
                                int vel_atual = c.getVel_atual();
                                int novavelocidade = AumentarVelocidade(vel_atual);
                                c.setVel_atual(novavelocidade);
                                encontrado = true;
 
 
                            }else{
                                System.out.println("Velocidade Maxima Atingida!");
                                encontrado = true;
                            }
                            
                        }  
                    }
                    if (!encontrado) {
                        System.out.println("Carro nao encontrado!");
                    }
                    break;
                case 4:
                    input.nextLine();
                    System.out.println("Digite o nome do modelo que deseja diminuir a velocidade:");
                        buscar = input.nextLine();
                        encontrado = false;
 
 
                        for (carro c : carros) {
                            if (c.getModelo().equalsIgnoreCase(buscar)) {
                                if (c.getVel_atual() > 0) {
 
 
                                    int vel_atual = c.getVel_atual();
                                    int novavelocidade = DiminuirVelocidade(vel_atual);
                                    c.setVel_atual(novavelocidade);
                                    encontrado = true;
                                }else{
                                    System.out.println("Velocidade Maxima Atingida!");
                                    encontrado = true;
                                }
                                
                                
                            }  
                        }
                        if (!encontrado) {
                            System.out.println("Carro nao encontrado!");
                        }
                    break;
                case 5:
                    System.out.println("Digite o nome do modelo que deseja buscar:");
                    buscar = input.nextLine();
                    encontrado = false;
 
 
                    for (carro c : carros) {
                        if (c.getModelo().equalsIgnoreCase(buscar)) {
                            String modelo = c.getModelo();
                            String cor = c.getCor();
                            int ano = c.getAno();
                            int vel_max = c.getVel_max();
                            int vel_atual = c.getVel_atual();
 
 
                            MostrarInformacoes(modelo, cor, ano, vel_max, vel_atual);
                            encontrado = true;         
                        }
                        }
                        if (!encontrado) {
                            System.out.println("Carro nao encontrado!");
                        }
                    break;
                case 6:
                    System.out.println("Digite a posicao do carro que deseja deleter as informacoes(começando em 1):");
                        int del = input.nextInt();
                        if ((del > 0) && (del <= carros.size())) {
                        carros.remove(del - 1);
                        System.out.println("informacoes deletadas!");
                        } else {
                        System.out.println("A posicao digitada eh invalida!");
                        }
 
 
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcao invalida!\n");
                    break;
            }
        }
        
    }
    public static int AumentarVelocidade(int vel_atual) {
 
 
        int novavelocidade = 10 + vel_atual; 
        System.out.println("Velocidade aumentada!");
        return novavelocidade;
        
        
    }
    public static int DiminuirVelocidade(int vel_atual) {
 
 
        int novavelocidade = vel_atual - 10; 
        System.out.println("Velocidade diminuida!");
        return novavelocidade;
            
    }
    public static void MostrarInformacoes(String modelo, String cor, int ano, int vel_max, int vel_atual) {
        System.out.println("Contato encontrado!");
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: "+ cor);
        System.out.println("Ano: "+ ano);
        System.out.println("Velocidade Maxima: "+ vel_max);
        System.out.println("Velocidade atual: "+ vel_atual);
    }
}
class carro {
    private String modelo;
    private String cor;
    private int ano;
    private int vel_max;
    private int vel_atual = 0;
 
 
    public carro(String modelo,String cor,int ano,int vel_max,int vel_atual){
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.vel_max = vel_max;
        this.vel_atual = vel_atual;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
 
 
    }
    public String getModelo(){
        return modelo;
    }
    public void setCor(String Cor){
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }
    public void setAno(int ano){
        this.ano = ano;
 
 
    }
    public int getAno(){
        return ano;
 
 
    }
    public void setVel_max(){
        this.vel_max = vel_max;
 
 
    }
    public int getVel_max(){
        return vel_max;
        
    }
    public void setVel_atual(int vel_atual){
        this.vel_atual = vel_atual;
 
 
    }
    public int getVel_atual(){
        return vel_atual;
    }
}