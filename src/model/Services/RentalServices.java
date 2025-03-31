package model.Services;

import model.entities.AluguelCarro;
import model.entities.Fatura;

import java.time.Duration;

public class RentalServices {

    private Double pricePerHour;
    private Double pricePerDay;

    private BrasilTaxService taxService;

    public RentalServices(Double pricePerHour, Double pricePerDay, BrasilTaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processFatura (AluguelCarro aluguelCarro){
       double minutes =  Duration.between(aluguelCarro.getInicio(), aluguelCarro.getFim()).toMinutes();
       double hours = minutes / 60;

       double basicPayment;
       if (hours <= 12){
            basicPayment = pricePerHour * Math.ceil(hours);
       }else{
            basicPayment = pricePerDay * Math.ceil(hours / 24);
       }

       double tax = taxService.tax(basicPayment);

        aluguelCarro.setFatura(new Fatura(basicPayment, tax));
    }
}
