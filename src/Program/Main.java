package Program;

import model.entities.AluguelCarro;
import model.entities.Carro;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel: ");
        System.out.println("Modelo do carro: ");
        String modeloCarro = scanner.next();

        System.out.println("inicio: ");
        LocalDateTime inicio = LocalDateTime.parse(scanner.next());

        System.out.println("fim: ");
        LocalDateTime fim = LocalDateTime.parse(scanner.next(), dtf);

        AluguelCarro aluguelCarro = new AluguelCarro(inicio, fim, new Carro(modeloCarro));

    }
}