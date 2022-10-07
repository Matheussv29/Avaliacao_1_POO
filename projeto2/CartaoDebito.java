package br.com.newton.poo.projeto2;

public class CartaoDebito extends Pagamento{
    private String numCartao, tirularCartao;

    public CartaoDebito(String dataHoraPagamento, int numeroPagamento, double valorPago, String numCartao, String tirularCartao) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.numCartao = numCartao;
        this.tirularCartao = tirularCartao;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getTirularCartao() {
        return tirularCartao;
    }

    public void setTirularCartao(String tirularCartao) {
        this.tirularCartao = tirularCartao;
    }
    public String imprimirCupomFiscal;
}
