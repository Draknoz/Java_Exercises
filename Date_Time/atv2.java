import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("-----------------------------");
        System.out.println("Digite a Placa do Carro: ");
        String placa = input.nextLine();

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
        long total = diferenca.toMinutes(); 

        float pagar = Preco(total);

        Recibo(placa, entrada, total, pagar);
    }

    public static void Recibo(String Placa, String entrada, long total, float pagar){
        System.out.println("-----------------------------");
        System.out.println("Recibo");
        System.out.println("-----------------------------");
        System.out.println("Placa: " + Placa);
        System.out.println("Entrada: " + entrada);
        System.out.println("Tempo Total (em Minutos): " + total);
        System.out.printf("Total a Pagar: R$ %.2f%n", pagar);
        System.out.println("-----------------------------");
    }

    public static float Preco(long total) {
        float pagar = 0;
        if (total > 60) {
           float t =  total - 60;
           pagar = 5 + ((t / 15) * 2); 
        } else {
            pagar = 5;
        }
        return pagar;
    }
}
