package model.entities;

public class Fatura  {

    private Double pagamentoBasico;
    private Double taxa;

    public Fatura(){
    }

    public Fatura(Double pagamentoBasico, Double taxa) {
        this.pagamentoBasico = pagamentoBasico;
        this.taxa = taxa;
    }

    public Double getPagamentoBasico() {
        return pagamentoBasico;
    }

    public void setPagamentoBasico(double pagamentoBasico) {
        this.pagamentoBasico = pagamentoBasico;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public Double getPagamentoTotal(){
return getPagamentoBasico() + getTaxa();
    }
}
