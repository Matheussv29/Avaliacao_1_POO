package br.com.newton.poo.projeto3;

public class Mensalidade {
    private double valorMensalidade;
    private int numeroIrmaos;

    public Mensalidade(double valorMensalidade, int numeroIrmaos) {
        this.valorMensalidade = valorMensalidade;
        this.numeroIrmaos = numeroIrmaos;
    }
    public void Mensalidade(double valorMensalidade, int numeroIrmaos){

    }
    public double calcularMensalidade() {

        if (numeroIrmaos == 1) {
            double desconto1 = valorMensalidade * 5 / 100;
            double valorFinal = valorMensalidade - desconto1;
            return valorFinal;
        }
        if (numeroIrmaos == 2) {
            double desconto2 = valorMensalidade * 10 / 100;
            double valorFinal = valorMensalidade - desconto2;
            return valorFinal;
        }
        if (numeroIrmaos > 2) {
            double desconto3 = valorMensalidade * 15 / 100;
            double valorFinal = valorMensalidade - desconto3;
            return valorFinal;
        }
        if (numeroIrmaos == 0) {
            double valorFinal = valorMensalidade - 0;
            return valorFinal;
        }

        return 0;
    }
}
