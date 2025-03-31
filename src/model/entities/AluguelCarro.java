package model.entities;

import java.time.LocalDateTime;

public class AluguelCarro {

    private LocalDateTime inicio;
    private LocalDateTime fim;

    private Carro carro;
    private Fatura fatura;

    public AluguelCarro(LocalDateTime inicio, LocalDateTime fim, Carro carro) {
        this.inicio = inicio;
        this.fim = fim;
        this.carro = carro;
        this.fatura = fatura;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }
}
