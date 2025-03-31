package Program;

import model.Services.BrasilTaxService;
import model.Services.RentalServices;
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
        String modeloCarro = scanner.nextLine();

        System.out.println("inicio: ");
        LocalDateTime inicio = LocalDateTime.parse(scanner.nextLine(), dtf);

        System.out.println("fim: ");
        LocalDateTime fim = LocalDateTime.parse(scanner.nextLine(), dtf);

        AluguelCarro aluguelCarro = new AluguelCarro(inicio, fim, new Carro(modeloCarro));

        System.out.println("Entre com o preço por hora: ");
        Double pricePerHour = scanner.nextDouble();

        System.out.println("Entre com o preço por dia: ");
        Double pricePerDay = scanner.nextDouble();

        RentalServices rentalServices = new RentalServices(pricePerHour, pricePerDay, new BrasilTaxService());

        rentalServices.processFatura(aluguelCarro);

        System.out.println("FATURA: ");
        System.out.println("Pagamento Básico: " + aluguelCarro.getFatura().getPagamentoBasico());
        System.out.println("Imposto: " + aluguelCarro.getFatura().getTaxa());
        System.out.println("Pagamento Total: " + aluguelCarro.getFatura().getPagamentoTotal());
    }
}