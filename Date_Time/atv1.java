import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class atv1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("-----------------------------");
        System.out.println("Digite o Nome do Funcionario: ");
        String nome = input.nextLine();

        System.out.println("Digite a Hora de entrada no formato (hh:mm):  ");
        String hora_entrada = input.nextLine();
        LocalTime hora = LocalTime.parse(hora_entrada, formato);
        String entrada = hora.format(formato);
        System.out.println("-----------------------------");

        System.out.println("Digite a Hora de Saida no formato (hh:mm): ");
        String hora_saida = input.nextLine();
        LocalTime h = LocalTime.parse(hora_saida, formato);
        String saida = h.format(formato);

        
        Duration diferenca = Duration.between(hora, h);
        long horas = diferenca.toHours();
        long minutos = diferenca.toMinutes() % 60;

        Funcionario(nome, horas, minutos, entrada, saida);
    }
    public static void Funcionario(String nome, Long horas, long minutos, String entrada, String saida) {
        System.out.println("Nome: "+nome);
        System.out.println("Entrada: "+entrada);
        System.out.println("Saida: "+saida);
        System.out.println("Horas Trabalhadas: "+horas+" Horas "+minutos+" minutos");
        long total = horas + (minutos);
        if (total > 8) {
            System.out.println("Horas extras: Sim");
        }else{
            System.out.println("Horas extras: Nao");
        }
        
    }
}